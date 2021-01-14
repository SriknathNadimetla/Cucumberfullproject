package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleScnarios {

	
	WebDriver driver=null;
	
	@Given("browser is open")
	public void browser_is_open() {
		
		String projectPath=System.getProperty("user.dir");
		System.out.println("----------->"+projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
	
		driver=	new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		System.out.println("-------browser is open--------");
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("user_is_on_google_search_page()");
		
		driver.navigate().to("http://www.google.com");
	}

	@When("^user enters a (.*) and (.*) in search box$")
	public void user_enters_a_text_in_search_box(String text1,String text2) {
		System.out.println("user_enters_a_text_in_search_box()");
		driver.findElement(By.name("q")).sendKeys(text1 +" and "+text2);
		
	}

	@And("hits enter")
	public void hits_enter() {
		System.out.println("hits_enter()");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("user_is_navigated_to_search_results()");
		
		if (driver.getPageSource().contains("What is selenium and why it is used?"))
			System.out.println("passed");
		else
			System.out.println("failed");
			
		driver.close();
	}

}

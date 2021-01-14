package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Fbautomation {

	
	WebDriver driver=null;
	
	@Given("FB browser is open1")
	public void FB_browser_is_open() {
		
		String projectPath=System.getProperty("user.dir");
		System.out.println("----------->"+projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
	
		driver=	new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		System.out.println("-------browser is open--------");
	}

	@And("user is on facebook page1")
	public void user_is_on_FB_page() {
		System.out.println("user_is_on_google_search_page()");
		
		driver.navigate().to("http://www.facebook.com");
	}

	@When("^user enters a (.*) and (.*) in loginpage1$")
	public void user_enters_a_text_in_search_box(String username,String password) {
		System.out.println("user_enters_a_text_in_search_box()");
		
		
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);
		
		
	}

	@And("hits login button1")
	public void hits_enter() {
		System.out.println("hits_enter()");
		driver.findElement(By.name("login")).click();
		driver.close();
	}



}

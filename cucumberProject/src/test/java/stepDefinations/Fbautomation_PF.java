package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.Fbloginpage;
import pfPages.pfFbLoginpage;

public class Fbautomation_PF {

	
	WebDriver driver=null;
	pfFbLoginpage fblogin;
	@Given("FB browser is open")
	public void FB_browser_is_open() {
		
		String projectPath=System.getProperty("user.dir");
		System.out.println("----------->"+projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
	
		driver=	new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		System.out.println("-------browser is open--------");
	}

	@And("user is on facebook page")
	public void user_is_on_FB_page() {
		System.out.println("user_is_on_google_search_page()");
		
		driver.navigate().to("http://www.facebook.com");
	}

	@When("^user enters a (.*) and (.*) in loginpage$")
	public void user_enters_a_text_in_search_box(String username,String password) {
		
		fblogin = new pfFbLoginpage(driver);
		fblogin.enterUserName(username);
		fblogin.enterPassword(password);
	//	fblogin.enterUserName(username);
	//	fblogin.enterPassword(password);
		
		
		
	}

	@And("hits login button")
	public void hits_enter() {
		
		System.out.println("hits_enter()");
		fblogin.clickLogin();
		driver.close();
	//	fblogin.clickOnlogin();
		//driver.findElement(By.name("login")).click();
	}



}

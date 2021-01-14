package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbloginpage {

WebDriver driver;
	
	By name_useranme=By.name("email");
	By name_password=By.name("pass");
	By name_clickBtn=By.name("login");
	
	public Fbloginpage (WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterUserName(String username)
	{
	driver.findElement(name_useranme).sendKeys(username);	
	}
	
	public void enterPassword(String password)
	{
	driver.findElement(name_password).sendKeys(password);	
	}
	
	public void clickOnlogin()
	{
	driver.findElement(name_clickBtn).click();
	}
	
	

	
	
	
}

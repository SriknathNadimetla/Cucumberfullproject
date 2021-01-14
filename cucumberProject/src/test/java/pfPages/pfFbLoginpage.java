package pfPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pfFbLoginpage {

/*	
	By name_useranme=By.name("email");
	By name_password=By.name("pass");
	By name_clickBtn=By.name("login");
	*/
	WebDriver driver;
	@FindBy(name="email")
	   WebElement name_useranme;
	
	@FindBy(name="pass")
	   WebElement name_password;
	
	@FindBy(name="login")
	   WebElement name_clickBtn;
	
	
	public pfFbLoginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
//		PageFactory.initElements(driver, pfFbLoginpage.class);
		PageFactory.initElements(driver, this);
	}
	
	
	/*
	 * public void enterUserName(String username) {
	 * driver.findElement(name_useranme).sendKeys(username); }
	 */
	public void enterUserName(String username) {
		
		name_useranme.sendKeys(username);
	}
	public void enterPassword(String password) {
		
		name_password.sendKeys(password);
	}
	
public void clickLogin() {
		
		name_clickBtn.click();
	}
	
}

package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	//userName
	By userName = By.id("user-name");
	
	//password
	By password = By.id("password");
	
	//Login btn
	By loginBtn = By.id("login-button");
	
	//Bussiness logic(Login action)
	public void enterLoginCredentials(String un, String pwd) {
		driver.findElement(userName).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickOnLogin() {
		driver.findElement(loginBtn).click();
	}
	
}

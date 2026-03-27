package objectRepository_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({@FindBy(id = "username"), @FindBy(id = "user-name")})
	WebElement userName;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(id = "login-button")
	WebElement loginBtn;
	
	//Business logic to login
	public void enterLoginCredentials(String un, String pwd) {
		userName.sendKeys(un);
		password.sendKeys(pwd);
	}
	
	public void clickOnLogin() {
		loginBtn.click();
	}
}

package objectRepository_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class DemoLoginPage {
	WebDriver driver;

	public DemoLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindAll({ @FindBy(id = "user-name"), @FindBy(id = "username") })
	WebElement userName;

	@FindAll({ @FindBy(id = "password"), @FindBy(id = "password") })
	WebElement password;
	
	@FindBy(css = "[type = 'submit']")
	WebElement loginBtn;
	
	public void enterLoginCredentials(String un, String pwd) {
		userName.sendKeys(un);
		password.sendKeys(pwd);
	}
	
	public void clickOnLogin() {
		loginBtn.click();
	}
}

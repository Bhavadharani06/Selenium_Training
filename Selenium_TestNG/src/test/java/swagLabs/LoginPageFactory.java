package swagLabs;

import org.testng.annotations.Test; 

import objectRepository_PageFactory.LoginPage;
import objectRepository_PageFactory.LogoutPage;
import objectRepository_PageFactory.BaseClass;

public class LoginPageFactory extends BaseClass {
	@Test
	public void logIn() {
		LoginPage lp = new LoginPage(driver);
		LogoutPage lop = new LogoutPage(driver);
		// Login with valid credentials
		lp.enterLoginCredentials("standard_user", "secret_sauce");
		lp.clickOnLogin();
		lop.clickLogout();
		
	}
}

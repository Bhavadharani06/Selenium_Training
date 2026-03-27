package swagLabs;

import org.testng.annotations.Test;
import objectRepository.*;

public class LoginTest extends BaseClass{
	@Test
	public void logIn() {
		LoginPage lp = new LoginPage(driver);
		LogoutPage logOut = new LogoutPage(driver);
		// Login with valid credentials
		lp.enterLoginCredentials("standard_user", "secret_sauce");
		lp.clickOnLogin();
		logOut.clickLogout();
		
	}
}

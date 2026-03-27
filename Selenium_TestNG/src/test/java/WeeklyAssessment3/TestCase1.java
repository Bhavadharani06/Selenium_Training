package WeeklyAssessment3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase1 {
	WebDriver driver = null;
	@Test(priority = 0)
	public void launchingBrowser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}

	@Test(priority = 1 ,dependsOnMethods = "launchingBrowser")
	public void login() {
		// Navigate to swag labs
		driver.get("https://www.saucedemo.com/");
		
		// Login with valid credentials
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Reporter.log("Login Successfully", true);
		
		
	}
	@Test(priority = 2, dependsOnMethods = "login")
	public void validateProductPage() {
		// Validate product page 

		String productPage = driver.findElement(By.xpath("//span[.='Products']")).getText();

		if (productPage.contains("Products")) {
			Reporter.log("Products Page is Displayed Successfully.", true);
		} else {
			Reporter.log("Products Page is not Displayed.", true);
		}
	}
	
	@Test(priority = 3, dependsOnMethods = "login")
	public void addToCart() {
		// Add products to cart 
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		
		// Click on cart icon
		driver.findElement(By.id("shopping_cart_container")).click();
		
		// Verify cart items 
		String product1 = driver.findElement(By.xpath("//div[.='Sauce Labs Bolt T-Shirt']")).getText();
		String product2 = driver.findElement(By.xpath("//div[.='Sauce Labs Bike Light']")).getText();

		List<WebElement> prductsInTheCart = driver.findElements(By.className("inventory_item_name"));
		boolean flag = true;

		for (WebElement i : prductsInTheCart) {
			if (!(i.getText().contains(product1) || i.getText().contains(product2))) {
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println("Both Products Added to cart Succesfully");
		else
			System.out.println("Not Added to cart");

	}
	
	@Test(priority = 4, dependsOnMethods = "addToCart")
	public void checkoutProducts() {
		//Perform checkout 
		driver.findElement(By.id("checkout")).click();
		
		driver.findElement(By.id("first-name")).sendKeys("Dharani");
		driver.findElement(By.id("last-name")).sendKeys("Vedha");
		driver.findElement(By.id("postal-code")).sendKeys("600123");
		driver.findElement(By.id("continue")).click();
		
		// Validate Price
		String expectedPrice = "$28.06";
		String actualTotalPrice = driver.findElement(By.className("summary_total_label")).getText();
//		System.out.println(actualTotalPrice);
		
		if(actualTotalPrice.contains(expectedPrice)) {
			System.out.println("Actual price and Expected price are equal.");
		}
		else {
			System.out.println("Actual price and Expected price are not equal.");
		}
		
		// Complete order
		driver.findElement(By.id("finish")).click();
	}
	
	@Test(priority = 5, dependsOnMethods = "login")
	public void logout() {
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		Reporter.log("Logout Successfully", true);
		driver.close();
	}
		

}

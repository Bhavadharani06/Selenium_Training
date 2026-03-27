package locators;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XpathByMultipleAttributes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//		driver.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[contains(@text(),'Digital downloads') and @class]")).click();

//		driver.get("https://www.ebay.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[@href='https://www.ebay.com/b/Clothing-Shoes-Accessories/11450/bn_1852545' and @class='vl-flyout-nav__link-container']")).click();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Recruitment")).click();
		Thread.sleep(5000);
//		WebElement recruitmentMenu = wait.until(
//		        ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Recruitment']"))
//		);
//
//		recruitmentMenu.click();
//		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("firstName")).sendKeys("Bhavadharani");
		driver.findElement(By.name("lastName")).sendKeys("V");
		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active' and @placeholder='Type here']")).sendKeys("dharanivedha26@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("[type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='/web/index.php/auth/logout']")).click();
	}

}

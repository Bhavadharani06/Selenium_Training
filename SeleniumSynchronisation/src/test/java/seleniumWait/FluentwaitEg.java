package seleniumWait;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentwaitEg {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/products_page/57");
		driver.findElement(By.id("Check Delivery")).sendKeys("123456");
		WebElement checkBtn = driver.findElement(By.id("Check"));
		
//		giving a fluent wait to check if the condition is satisfied
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		
		wait.pollingEvery(Duration.ofSeconds(1));
		wait.withTimeout(Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(checkBtn));
		
		checkBtn.click();
	

	}

}

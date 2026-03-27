package webElementInterrogatinMethods;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver; 

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		WebElement btn = driver.findElement(By.xpath("//button[.='Register']"));
//		verifying if the button is displayed
		System.out.println("The button is displayed: "+btn.isDisplayed());
		Thread.sleep(3000);
		driver.quit();
	}

}

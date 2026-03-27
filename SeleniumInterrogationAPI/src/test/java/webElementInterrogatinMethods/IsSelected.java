package webElementInterrogatinMethods;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver; 

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		Thread.sleep(10000);
		WebElement check=driver.findElement(By.id("Check"));
		System.out.println("Is my check button is enabled: "+check.isEnabled());

	}}

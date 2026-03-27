package handlingPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Dresses");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Dresses")).click();
		driver.findElement(By.xpath("//img[@alt='Marks & Spencer Girls Tie-Dye Printed Fit & Flare Dress']")).click();
		Thread.sleep(3000);
		
		String parent = driver.getWindowHandle();

		for(String s : driver.getWindowHandles()) {
		    if(!s.equals(parent)) {
		        driver.switchTo().window(s);
		    }
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='WISHLIST']")).click();
		Thread.sleep(5000);
		
		String currentUrl = driver.getCurrentUrl();

		if(currentUrl.contains("login")) {
		    System.out.println("User is redirected to Login Page");
		} else {
		    System.out.println("User is NOT redirected to Login Page");
		}		
		
	}

}

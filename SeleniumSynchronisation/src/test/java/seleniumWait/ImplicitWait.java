package seleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		// Enter Username
		driver.findElement(By.name("username")).sendKeys("Admin");
		// Enter Password
		driver.findElement(By.name("password")).sendKeys("admin123");
		// Click Login
		driver.findElement(By.cssSelector("[type='submit']")).submit();
		// Click on profile menu
        driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
        // Logout
        driver.findElement(By.xpath("//a[.='Logout']")).click();
		
	}
}

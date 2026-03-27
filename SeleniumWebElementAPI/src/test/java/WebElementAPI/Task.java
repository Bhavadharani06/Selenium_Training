package WebElementAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		WebElement userName = driver.findElement(By.xpath("//input[starts-with(@name,'username')]"));
		userName.sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(userName)).sendKeys("admin123");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		driver.findElement(By.linkText("Change Password")).click();

	}

}

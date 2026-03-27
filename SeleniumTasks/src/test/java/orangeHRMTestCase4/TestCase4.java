package orangeHRMTestCase4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase4 {
	@Test
	public static void clickOnPIM() throws InterruptedException {
		// Launching Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);

		// Login to OrangeHRM
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("[type='submit']")).click();

		// Click on PIM link
		driver.findElement(By.xpath("//span[.='PIM']")).click();
		Thread.sleep(2000);

		// click configuration dropdown
		driver.findElement(By.xpath("//span[.='Configuration ']")).click();
		Thread.sleep(2000);

		// click on Termination reasons
		driver.findElement(By.linkText("Termination Reasons")).click();
		Thread.sleep(2000);

		// click on + Add button
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		Thread.sleep(2000);

		// enter a reason in name input field
		driver.findElement(By.xpath("//label[.='Name']/../..//input")).sendKeys("Tamil is too worst");

		// click on save button
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// verify whether the reason is added to the Termination reasons
		String reason = driver.findElement(By.xpath("//div[.='Tamil is too worst']")).getText();

		if (reason.contains("Tamil is too worst")) {
			System.out.println("Termination reason is added");
		} else {
			System.out.println("Termination reason is not added");
		}

		// logOut
		// click on profile
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		Thread.sleep(2000);
		// click on logout
		driver.findElement(By.xpath("//a[.='Logout']")).click();

	}
}

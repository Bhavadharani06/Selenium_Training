package prectice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://icehrmpro.gamonoid.com/login.php");
		Thread.sleep(2000);

		// login
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[.='Log in ']")).click();

		// verify the dashboard
		if (driver.getCurrentUrl().contains("dashboard")) {
			System.out.println("Dashboard page");
		} else {
			System.out.println("Not in dashboard");
		}

		// employee section
		driver.findElement(By.id("menu_admin_Employees")).click();

		// employees
		driver.findElement(By.xpath(
				"//a[@href='https://icehrmpro.gamonoid.com/?g=admin&n=employees&m=admin_Employees']/.. //i[@class='fa fa-users']"))
				.click();

		// filter
		driver.findElement(By.xpath("//span[.='Filter Employees']")).click();

		// select dept
		WebElement dropdown = driver.findElement(By.id("rc_select_5"));
		dropdown.click();
		driver.findElement(By.cssSelector("[title='Development Center']")).click();

		// save
		driver.findElement(By.xpath("//div[@id='rc_unique_3']/../..//span[.='Save']")).click();

		driver.findElement(By.id("rc_select_8")).click();
		driver.findElement(By.cssSelector("[title='Project Manager']")).click();
		driver.findElement(By.xpath("//div[@id='rc_unique_3']/../..//span[.='Save']")).click();

		// Click on Profile
		driver.findElement(By.xpath("//span[.='IceHrm ']")).click();

		// LogOut
		driver.findElement(By.xpath("//a[.='Sign out']")).click();
	}

}

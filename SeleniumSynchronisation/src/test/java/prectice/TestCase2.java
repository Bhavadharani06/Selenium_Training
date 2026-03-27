package prectice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://icehrmpro.gamonoid.com/login.php?logout=1");

		WebElement we = driver.findElement(By.cssSelector("[type='button']"));
		we.click();
		WebElement name = driver.findElement(By.id("username"));
		name.sendKeys("admin12");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("admin12");
		we.click();

		String st = driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();

		if (st.contains("Login failed")) {
			System.out.println("Displays Invalid Credentials..");
		}

		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.cssSelector("[type='button']")).click();

		if (driver.getCurrentUrl().contains("dashboard")) {
			System.out.println("Dashboard Page is diplayed and Successfully Displayed...");
		}

		driver.findElement(By.xpath("//span[.='Employees']/parent::a/parent::li")).click();
		driver.findElement(By
				.xpath("//a[@href='https://icehrmpro.gamonoid.com/?g=admin&n=employees&m=admin_Employees']/parent::li"))
				.click();
		driver.findElement(By.id("tabEmployeeSkill")).click();
		driver.findElement(By.xpath("//span[.=' Add New']")).click();
		String addNew = driver.findElement(By.id("rc_unique_20")).getText();
		if (addNew.contains("Employee Skill")) {
			System.out.println("Add New is Clicked");
		}

		WebElement empname = driver
				.findElement(By.xpath("//span[.='Select Employee']/parent::span/parent::div/parent::div/parent::div"));
		empname.click();
		driver.findElement(
				By.xpath("//textarea[@class='ant-input css-dev-only-do-not-override-240cud ant-input-outlined']"))
				.sendKeys("Certified Data Analyst");
		// Click on Cancel Because of there is no data in skills
		// Cancel
		driver.findElement(By.xpath("//span[.='Cancel']")).click();

		// Click on Profile
		driver.findElement(By.xpath("//span[.='IceHrm ']")).click();

		// LogOut
		driver.findElement(By.xpath("//a[.='Sign out']")).click();
	}
}
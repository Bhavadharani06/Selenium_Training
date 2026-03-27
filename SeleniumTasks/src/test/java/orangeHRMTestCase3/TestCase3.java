package orangeHRMTestCase3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase3 {
	@Test
	public static void clickOnReqirement() throws InterruptedException {
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

		// Click on Recruitment link
		driver.findElement(By.xpath("//span[.='Recruitment']")).click();
		Thread.sleep(2000);

		// click on vacancies link
		driver.findElement(By.xpath("//a[.='Vacancies']")).click();
		Thread.sleep(2000);

		// click on + Add button
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		Thread.sleep(2000);

		// enter vacancy name
		driver.findElement(By.xpath("//label[.='Vacancy Name']/../..//div[2]//input")).sendKeys("Automaton Tester");

		// enter Job title
		driver.findElement(By.xpath("//label[.='Job Title']/../..//div[2]//div//div//div[1]")).click();
		driver.findElement(By.xpath("//div[@role='option']//span[text()='Automaton Tester']")).click();

		// add description
		driver.findElement(By.tagName("textarea")).sendKeys("Vacancy for Data Analyst");
		
		// select hiring manager    
		driver.findElement(By.xpath("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']//input")).sendKeys("Dharani");
		
		// number of positons
		driver.findElement(By.xpath("//label[.='Number of Positions']/../..//div[2]//input")).sendKeys("5");
		
		// click on save button
		driver.findElement(By.cssSelector("[type='submit']")).click();
//		// select vacancy
//		driver.findElement(By.xpath("//label[.='Vacancy']/../..//div[2]//div//div//div[1]")).click();
//		driver.findElement(By.xpath("//div[@role='option']//span[text()='Software Engineer']")).click();
//		
//		// select hiring manager
//		driver.findElement(By.xpath("//label[.='Hiring Manager']/../..//div[2]//div//div//div[1]")).click();
//		driver.findElement(By.xpath("//div[@role='option']//span[text()='Shyam Sundar K']")).click();
//		
//		// select status
//		driver.findElement(By.xpath("//label[.='Status']/../..//div[2]//div//div//div[1]")).click();
//		driver.findElement(By.xpath("//div[@role='option']//span[text()='Active']")).click();
	}
}

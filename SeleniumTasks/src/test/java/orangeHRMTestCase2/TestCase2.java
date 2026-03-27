package orangeHRMTestCase2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class TestCase2 {

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

		// click on + Add button
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		Thread.sleep(2000);

		// enter firstname
		WebElement firstname = driver.findElement(By.name("firstName"));
		firstname.sendKeys("Sai");

		// enter middlename
		driver.findElement(By.name("middleName")).sendKeys("Abinaya");

		// enter lastname
		driver.findElement(By.name("lastName")).sendKeys("V");

		// select any option for vacancy
		WebElement vacancy = driver.findElement(By.xpath("//div[@class='oxd-select-text-input']"));
		vacancy.click();
		driver.findElement(By.xpath("//div[@role='option']//span[text()='Software Engineer']")).click();

		// enter email
		WebElement email = driver.findElement(RelativeLocator.with(By.tagName("input")).below(vacancy));
		email.sendKeys("abc@gmail.com");

		// enter mobile number
		driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(email)).sendKeys("0123654789");

		// upload file
		driver.findElement(By.xpath("//input[@class='oxd-file-input']"))
				.sendKeys("C:\\Users\\preet\\Downloads\\INTERNSHIP_REPORT final.pdf");

		// Select Date of Application
		driver.findElement(By.xpath("//div[@class='oxd-date-input']")).click();

		// selecting the date 13 from calendar
		driver.findElement(By.xpath("//div[text()='10']")).click();

		// click on save button
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[type='submit']")).click();
		Thread.sleep(4000);

		// click on candidates
		driver.findElement(By.xpath("//a[.='Candidates']")).click();
		Thread.sleep(2000);

//		// select job title
//		WebElement jobTitle = driver.findElement(By.xpath("//label[.='Job Title']"));
//		WebElement jobTitleBtn = driver.findElement(RelativeLocator.with(By.tagName("div")).below(jobTitle));
//		jobTitleBtn.click();
//		driver.findElement(By.xpath("//div[@role='option']//span[text()='Software Engineer']")).click();

		// select vacancy
		driver.findElement(By.xpath("//label[.='Vacancy']/../..//div[@class='oxd-select-wrapper']")).click();
		driver.findElement(By.xpath("//div[@role='option']//span[text()='Software Engineer']")).click();
//		Actions action = new Actions(driver);
//		action.click(vacancy1).pause(8000).sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN, Keys.ENTER).perform();

		// enter candidate name
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Sai");
		driver.findElement(By.xpath("//div[@role='option']//span[text()='Sai Abinaya V']")).click();

		// date of application
		driver.findElement(By.cssSelector("[placeholder='From']")).click();

		// selecting the date 13 from calendar
		driver.findElement(By.xpath("//div[text()='10']")).click();

		// click on search
		driver.findElement(By.cssSelector("[type='submit']")).click();

		// verify whether the emplyoee is added from the records found section
		String records = driver.findElement(By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']")).getText();

		if (records.contains("No Records Found")) {
			System.out.println("Emplyoee is not added");
		} else {
			System.out.println("Employee is added Successfully");
		}

		// logOut
		// click on profile
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		Thread.sleep(2000);
		// click on logout
		driver.findElement(By.xpath("//a[.='Logout']")).click();
	}

}

package orangeHRMTestCase1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class TestCase1 {

	@Test
	public static void clickOnPIM() throws InterruptedException {
		//Launching Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		//Login to OrangeHRM
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		//Click on PIM link
		driver.findElement(By.xpath("//span[.='PIM']")).click();
		Thread.sleep(2000);
		
		//click on +Add button
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		Thread.sleep(2000);
		
		//enter firstname 
		WebElement firstname = driver.findElement(By.name("firstName"));
		firstname.sendKeys("Sai");
		
		//enter middlename
		driver.findElement(By.name("middleName")).sendKeys("Abinaya");
		
		//enter lastname
		driver.findElement(By.name("lastName")).sendKeys("V");
		
		//enter employeeId
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(firstname)).sendKeys("300821");
		Thread.sleep(2000);
		
		//click on Create Login Details toggle button
		driver.findElement(By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")).click();
		Thread.sleep(2000);
		
		//Fetching the enable button for using relative locator to give username
		WebElement enableRadioBtn = driver.findElement(By.xpath("//label[.='Enabled']"));
		
		//enter Username
		WebElement userName = driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(enableRadioBtn));
		userName.sendKeys("Saiabi");
		
		//enter PassWord
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(userName)).sendKeys("Sai@123");

		//enter Confirm PassWord
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(enableRadioBtn)).sendKeys("Sai@123");
		Thread.sleep(2000);
		
		//Click on save button
		driver.findElement(By.cssSelector("[type='submit']")).click();
		Thread.sleep(2000);
		
		//click on Admin link
		driver.findElement(By.xpath("//span[.='Admin']")).click();
		Thread.sleep(2000);
		
		//enter username
		WebElement we = driver.findElement(By.xpath("//label[.='Username']"));
		WebElement adminUserName = driver.findElement(RelativeLocator.with(By.tagName("input")).below(we));
		adminUserName.sendKeys("Saiabi");
		
		//Select Role
		WebElement role = driver.findElement(RelativeLocator.with(By.tagName("div")).toRightOf(adminUserName));
		role.click();
		//Select Admin
		driver.findElement(By.xpath("//div[@role='option']//span[text()='ESS']")).click();
		Thread.sleep(2000);
		
		//enter EmployeeName
		WebElement empName = driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(role));
		empName.sendKeys("Sai V");
		driver.findElement(By.xpath("//div[@role='option']//span[text()='Sai Abinaya V']")).click();
		
		//select status
		driver.findElement(RelativeLocator.with(By.tagName("div")).toRightOf(empName)).click();
		//Select value
		driver.findElement(By.xpath("//div[@role='option']//span[text()='Enabled']")).click();
		Thread.sleep(2000);
		
		//click on search button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//verify whether the emplyoee is added from the records found section
		String records = driver.findElement(By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']")).getText();
		
		if(records.contains("No Records Found")) {
			System.out.println("Emplyoee is not added");
		}
		else {
			System.out.println("Employee is added Successfully");
		}
		
		//logOut
		//click on profile
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		Thread.sleep(2000);
		//click on logout
		driver.findElement(By.xpath("//a[.='Logout']")).click();
	}

}

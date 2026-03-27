package handlingPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		// 1. Launch browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// 2. Navigate to OrangeHRM
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		// 3. Enter Username
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		// 4. Enter Password
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		// 5. Click Login
		driver.findElement(By.cssSelector("[type='submit']")).submit();
		Thread.sleep(3000);
		
		// 7. Click Admin from left menu
		driver.findElement(By.xpath("//span[.='Admin']")).click();
		Thread.sleep(3000);
		
		// 9. Click Add button
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		Thread.sleep(3000);
		
		// 11. Locate User Role dropdown
		WebElement we = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]"));
		we.click();
		Thread.sleep(3000);
		
		//13. Select Admin
		driver.findElement(By.xpath("//div[@role='option']//span[text()='Admin']")).click();
		Thread.sleep(3000);
		
		//14.  Verify selected value is displayed inside dropdown field
		WebElement role = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]"));
        System.out.println("Updated Role: " + role.getText());
        
        //15.  Re-open dropdown
        we.click();
        Thread.sleep(2000);
        
        //16.  Select “ESS”
        driver.findElement(By.xpath("//div[@role='option']//span[text()='ESS']")).click();
		Thread.sleep(3000);
		
		//17.  Verify selected value is displayed
		System.out.println("Updated Role: " + role.getText());
        
        // Click on profile menu
        driver.findElement(By.xpath("//button[@type='button' and @class='oxd-button oxd-button--medium oxd-button--ghost']")).click();
        Thread.sleep(2000);
        
        // 18. Click Cancel
        driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
        Thread.sleep(2000);
        
        // 19. Logout
        driver.findElement(By.xpath("//a[.='Logout']")).click();
        
        // 20. Close browser
        driver.quit();
	}

}

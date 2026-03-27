package Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		Navigating to google
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
//		Search"Automation"
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Automation");
		Thread.sleep(2000);
		
//		Navigating to google
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
//		Search"tools"
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("tools");
		Thread.sleep(2000);
		
//		Refresh the page
		driver.navigate().refresh();
		
//		navigate back and verifying
		driver.navigate().back();
		System.out.println(driver.getTitle());
	}

}

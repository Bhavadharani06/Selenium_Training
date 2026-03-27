package handlingPopups;

import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {

	public static void main(String[] args) throws InterruptedException {
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--disable-notifications");
//		options.addArguments("--incognito");

//		WebDriver driver = new ChromeDriver(options);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		String parentId = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[.='OrangeHRM, Inc']")).click();
		
		Set<String> allWindow = driver.getWindowHandles();
		
		for(String s : allWindow) {
			if(!s.equals(parentId)) {
				driver.switchTo().window(s);
			}
		}
		Thread.sleep(2000);
		String currURL = driver.getCurrentUrl();
		if(currURL.contains("orangehrm.com")) {
			System.out.println("Current URL Contains 'orangehrm.com'.");
		}
		else {
			System.out.println("Current URL dose not Contains 'orangehrm.com'.");
		}
		
		if(!(driver.getTitle().isEmpty())) {
			System.out.println("Page Title is not empty.");
		}
		else {
			System.out.println("Page Title is empty.");
		}
		
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(parentId);
		Thread.sleep(2000);
		if(driver.getCurrentUrl().contains("login")) {
			System.out.println("Login page is displayed");
		}
		else {
			System.out.println("Login page is not displayed");
		}
		driver.close();
		
	}

}

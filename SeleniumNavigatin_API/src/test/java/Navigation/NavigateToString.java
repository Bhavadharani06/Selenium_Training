package Navigation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToString {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		Navigating to google
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
//		Navigate to YT
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(2000);
		
//		Navigate to Wikipedia
		driver.navigate().to("https://www.wikipedia.org/");
		Thread.sleep(4000);
		
		driver.quit();
	}

}

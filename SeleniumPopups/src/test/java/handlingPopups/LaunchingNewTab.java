package handlingPopups;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingNewTab {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		Thread.sleep(2000);
//		Triggering a new tab in the same browser window
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://github.com/");
//		Triggering a new tab in the new browser window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://youtube.com/");
		System.out.println(driver.getTitle());
	}

}

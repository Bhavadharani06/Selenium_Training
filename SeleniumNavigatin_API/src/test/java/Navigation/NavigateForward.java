package Navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateForward {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		Navigating to myntra
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
//		Navigating to bigbasket
		driver.navigate().to("https://www.bigbasket.com/");
		Thread.sleep(2000);
//		Navigating to flipkart
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
//		Navigate to bigbasket and verifying
		driver.navigate().back();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
//		Navigate to flipkart and verifying
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
	}
}

package Practice;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//		WebDriver driver1 = new FirefoxDriver();
//		WebDriver driver2 = new EdgeDriver();
		
		
//		driver.get("https://www.youtube.com");
//		String title = driver.getTitle();
//		System.out.println(title);
		
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		
		System.out.println(driver.getCurrentUrl());
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		
		System.out.println(driver.getPageSource());
		driver.close();
//		Scanner s = new Scanner(System.in);
//		String browser = s.next();
//		
//		WebDriver driver = null;
//		
//		if(browser.toLowerCase().contains("chrome")) {
//			driver = new ChromeDriver();
//		}
//		else if(browser.toLowerCase().contains("firefox")) {
//			driver = new FirefoxDriver();
//		}
//		else if(browser.toLowerCase().contains("edge")) {
//			driver = new EdgeDriver();
//		}3
	}

}

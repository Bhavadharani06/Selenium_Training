package webdriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import java.awt.Window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;


public class LarningManage {

	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		Thread.sleep(2000);
//		Options ref = driver.manage();
//		Window w = ref.window();
//		w.maximize();
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		driver.manage().window().minimize();
//		Thread.sleep(2000);
//		driver.manage().window().fullscreen();
//		Thread.sleep(2000);
//		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
//		Thread.sleep(2000);
		
//		System.out.println(driver.manage().window().getSize());
//		Thread.sleep(2000);
////		Dimension dim = new Dimension(1500,500);
//		driver.manage().window().setSize(new Dimension(1500,500));		
//		System.out.println(driver.manage().window().getSize());
//		Thread.sleep(2000);
//		driver.quit();
		
//		System.out.println(driver.manage().window().getPosition());
//		
//		driver.manage().window().maximize();;		
//		System.out.println(driver.manage().window().getPosition());
//		Thread.sleep(2000);
//		
//		driver.manage().window().setPosition(new Point(100, 100));
//		Thread.sleep(2000);
//		driver.manage().window().setPosition(new Point(200, 300));
	
		 WebDriver driver = new ChromeDriver();

	        driver.get("https://www.youtube.com/");

	        String title = driver.getTitle();
	        if (title.contains("YouTube")) {
	            System.out.println("YouTube is Launched");
	        } else {
	            System.out.println("No YouTube is not Launched");
	        }

	        driver.quit();
	
	}

}

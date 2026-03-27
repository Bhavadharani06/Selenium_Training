package seleniumWait;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Facebook")).click();
		String parentId = driver.getWindowHandle();
		Set<String> set = driver.getWindowHandles();
		String fbID = "";
		for(String s : set) {
			if(! s.equals(parentId)) {
				fbID = s;
			}
		}
		driver.findElement(By.linkText("Twitter")).click();
		set = driver.getWindowHandles();
		String twitterID = "";
		for(String s : set) {
			if(!s.equals(parentId) && !s.equals(fbID)) {
				twitterID = s;
			}
		}
		driver.findElement(By.linkText("YouTube")).click();
		set = driver.getWindowHandles();
		String ytID = "";
		for(String s : set) {
			if(!s.equals(parentId) && !s.equals(fbID) && !s.equals(twitterID)) {
				ytID = s;
			}
		}
		
		driver.switchTo().window(ytID);
//		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("Tamil Songs");
//		driver.findElement(By.id("search-icon-legacy")).click();
	}

}

package WebdriverInterrogationAPI;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesTask {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
//		Fetching the window ID of parent window
		String parentId = driver.getWindowHandle();
		System.out.println("Parent ID: "+parentId);
		driver.findElement(By.xpath("//a[.='Facebook']")).click();
		Thread.sleep(2000);
		Set<String> allWindowIDs = driver.getWindowHandles();
//		System.out.println(allWindowIDs);
		allWindowIDs.remove(parentId);
		String fbID = "";
		for(String s: allWindowIDs) {
			fbID = s;	//Fetching the child Id out of the collection
		}
		driver.findElement(By.xpath("//a[.='Twitter']")).click();
		Thread.sleep(2000);
		allWindowIDs = driver.getWindowHandles();
		System.out.println(allWindowIDs);
		String twitterID = "";
		
		for(String s: allWindowIDs) {
			if((!s.equals(fbID)) && (!s.equals(parentId)) ) {
				twitterID = s;
			}
		}
		
		System.out.println("Facebook ID: " + fbID);
		System.out.println("Twitter ID: " + twitterID);
		
//		Selenium used approach
//		WebDriver d=new ChromeDriver();
//		d.manage().window().maximize();
//		d.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(2000); d.findElement(By.partialLinkText("Facebook")).click();
//		Thread.sleep(2000);
//		d.findElement(By.partialLinkText("Twitter")).click();
//		Thread.sleep(2000);
//		Set<String> All=d.getWindowHandles();
//		for(String str:All) {
//			d.switchTo().window(str);
//			String tittle=d.getTitle();
//			Thread.sleep(2000);
//			System.out.println("ID"+str);
//			System.out.println("Tittle"+tittle);
//		}
//		d.quit();
//		
	}

}

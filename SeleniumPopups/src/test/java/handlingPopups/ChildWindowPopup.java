package handlingPopups;

import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchTextbox")).sendKeys("laptop");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
//		Clicking on first product
		driver.findElement(By.xpath("//div[@data-index='3']")).click();
		Thread.sleep(2000);
		Set<String> allWindoId = driver.getWindowHandles();
		String parentId = driver.getWindowHandle();
//		Switching the tool contrl to child tab
		allWindoId.remove(parentId);
		
		for(String i: allWindoId) {
			driver.switchTo().window(i);
		}
		
		driver.findElement(By.xpath("(//input[@data-hover='Select <b>__dims__</b> from the left<br> to add to Shopping Cart'])[2]")).click();
		Thread.sleep(2000);
		driver.close();
	}

}

package handlingPopups;

import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h2[.='Laptop']/..//button")).click();
		Thread.sleep(2000);
		String parentId = driver.getWindowHandle();
		Set<String> allWindoId = driver.getWindowHandles();
//		Switching the tool control to child tab
		allWindoId.remove(parentId);
		for(String i: allWindoId) {
			driver.switchTo().window(i);
		}
		
		WebElement addToCart = driver.findElement(By.tagName("button"));
		addToCart.click();
		addToCart.click();
		Thread.sleep(2000);
		WebElement cart = driver.findElement(By.xpath("//*[local-name() = 'svg']"));
		cart.click();
		Thread.sleep(2000);
		WebElement shoppingCartList = driver.findElement(By.tagName("h2"));
		if(shoppingCartList.isDisplayed()) {
			System.out.println("Test Case Status: Pass");
		}
		else {
			System.out.println("Test Case Status: Pass");
		}
	}

}

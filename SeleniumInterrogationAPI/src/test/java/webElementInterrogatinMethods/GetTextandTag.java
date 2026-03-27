package webElementInterrogatinMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextandTag {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
//  	Locating the abt link
		WebElement abtLink = driver.findElement(By.id("navbarDropdown"));
		System.out.println("Name of my link is: "+ abtLink.getText());
//		fetching the tag name
		System.out.println("TagName is: "+ abtLink.getTagName());
	}

}

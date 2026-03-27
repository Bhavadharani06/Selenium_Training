package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {

	public static void main(String[] args) throws InterruptedException {
//		Launching the browser
		WebDriver driver = new ChromeDriver();
//		Navigating to Demo Web Shop
//		driver.get("https://demowebshop.tricentis.com/");
////		Wait statement to allow the web page to load properly
////		Along with all the web elements
//		Thread.sleep(2000);
////		Typing Computer in the search the text field
//		WebElement search = driver.findElement(By.id("small-searchterms"));
//		search.sendKeys("Computers");
////		Using Relative locator to locate the Search Button
//		Thread.sleep(2000);
//		driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(search)).click();
		
//		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
//		Thread.sleep(2000);
//		WebElement name = driver.findElement(By.id("name"));
//		name.sendKeys("Dharani");
//		Thread.sleep(2000);
//		WebElement email = driver.findElement(RelativeLocator.with(By.tagName("input")).below(name));
//		email.sendKeys("abc@gmail.com");
//		Thread.sleep(2000);
//		WebElement password = driver.findElement(RelativeLocator.with(By.tagName("input")).below(email));
//		password.sendKeys("abc123");
//		Thread.sleep(2000);
//		WebElement reg = driver.findElement(RelativeLocator.with(By.tagName("button")).below(password));
//		reg.click();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		WebElement firstname = driver.findElement(By.cssSelector("[placeholder='First Name']"));
		firstname.sendKeys("Bhava");
		Thread.sleep(2000);
		WebElement lastname = driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(firstname));
		lastname.sendKeys("Dharani");
		WebElement address = driver.findElement(RelativeLocator.with(By.cssSelector("[ng-model='Adress']")).below(firstname));
//		address.click();
		address.sendKeys("No.20, Anna nagar, Chennai");
		
		
		
	
	}

}

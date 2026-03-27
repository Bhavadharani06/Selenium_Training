package Navigation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class StateElementException {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement searchTF = driver.findElement(By.id("small-searchterms"));
		searchTF.sendKeys("mobile");
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//searchTF.sendKeys("mobile"); //org.openqa.selenium.StaleElementReferenceException  
		driver.findElement(By.id("small-searchterms")).sendKeys("mobile");

	}

}

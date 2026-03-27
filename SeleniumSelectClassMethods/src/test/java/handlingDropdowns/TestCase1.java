package handlingDropdowns;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(2000);
		
		WebElement oldStyle = driver.findElement(By.id("oldSelectMenu"));
		Select sel = new Select(oldStyle);
		System.out.println("Old Style Select Menu: " + sel.isMultiple());
		Thread.sleep(2000);
		
		WebElement cars = driver.findElement(By.id("cars"));
		Select sel1 = new Select(cars);
		System.out.println("Cars: " + sel1.isMultiple());
		Thread.sleep(2000);

	}

}

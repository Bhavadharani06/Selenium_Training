package webElementInterrogatinMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
//		Locate the search button
		WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
		Dimension dims = searchBtn.getSize();
		System.out.println("The dimension of the search button is: "+ dims);
//		Fetch the height
		System.out.println(dims.getHeight());
		System.out.println(dims.height);
//		Fetch the width
		System.out.println(dims.getWidth());
		System.out.println(dims.width);
		System.out.println(searchBtn.getCssValue("height"));
	}

}

package Navigation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatToURL {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

//		Navigating to amazon
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
//		Navigating to flipkart
		URL url1 = new URL("https://www.flipkart.com/");
		driver.navigate().to(url1);
		Thread.sleep(2000);
//		Navigating to UberEats
		driver.navigate().to(new URL("https://www.ubereats.com/in?srsltid=AfmBOooGdiBDYC-frQAKhiBWeSuh8ZWI0eK7xn0P7T84OYIbgNqgjgwC"));
		Thread.sleep(2000);
		
	}

}

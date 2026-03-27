package javaWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//sleep(long milis)
		Thread.sleep(2000);
		driver.navigate().to("https://www.ebay.com/");
		//sleep(long milis, int nano)
		Thread.sleep(1500, 100);
		driver.navigate().to("https://www.shoppersstack.com/");
		//sleep(Duration obj)
		Thread.sleep(Duration.ofSeconds(5));

	}

}

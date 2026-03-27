package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//		driver.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(3000);
////		Locate FB Link
//		driver.findElement(By.linkText("Facebook")).click();

//		Locate to gmail
//		driver.get("https://www.google.com/");
//		Thread.sleep(3000);
//		driver.findElement(By.linkText("Gmail")).click();

//		By.PartialLinkText

//		driver.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(3000);
//		driver.findElement(By.linkText("Computers\r\n" + "        ")).click(); Exception will occur 
//		because it accepts only one string
//		driver.findElement(By.partialLinkText("Compu")).click();

//		driver.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(3000);
//		driver.findElement(By.partialLinkText("Log in")).click();
//		
//		driver.get("https://www.flipkart.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()='✕']")).click();
//
//		driver.get("https://www.flipkart.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.partialLinkText("Cart")).click();

//		BY Class Name

//		driver.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(3000);
//		driver.findElement(By.className("ico-register")).click();

//		Iterate findElement
//		driver.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(3000);
//		List<WebElement> r = driver.findElements(By.className("ico-register"));
//		
//		for(WebElement i : r) {
//			System.out.println(i.getText());
//			i.click();
//		}

//		driver.get("https://www.google.com/");
//		Thread.sleep(3000);
//		List<WebElement> r = driver.findElements(By.tagName("a"));
//		
//		for(WebElement i : r) {
//			System.out.println(i.getText());.
//		}

//		driver.get("https://www.google.com/");
//		Thread.sleep(3000);
//		List<WebElement> r = driver.findElements(By.tagName("a"));

//		for(WebElement i : r) {
//			if(i.getText().equals("Store")) {
//				i.click();
//				break;
//			}	
//		}

//		for (WebElement i : r) {
//			System.out.println(i.getText());
//		}
//		for (WebElement j : r) {
//			if (j.getText().equals("Store")) {
//				j.click();
//				break;
//			}
//		}
//		driver.get("https://www.flipkart.com/");
//		Thread.sleep(3000);
//		driver.findElement(By.cssSelector("div[class=\"_3n8fna1co _3n8fna10j _3n8fnaod _3n8fna1 _3n8fnac7 _1i2djtb9 _1i2djt0 _9nihix56\"]")).click();
		
//		driver.get("https://demo.automationtesting.in/Register.html");
//		Thread.sleep(3000);
//		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Bhava");
//		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Dharani");
		
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(3000);
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
//		driver.findElement(By.cssSelector("[type='submit']")).click();
		
//		By XPATH
		
//		driver.get("https://github.com/");
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//span[@class='flex-1']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='query-builder-test']")).sendKeys("Selenium");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[@class='ActionListItem-label text-normal']")).click();
//		driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[@href=\'https://www.flipkart.com/travel/flights?param=Travel-BAU-msite-JJJJ&ctx=eyJjYXJkQ29udGV4dCI6eyJhdHRyaWJ1dGVzIjp7InRpdGxlIjp7Im11bHRpVmFsdWVkQXR0cmlidXRlIjp7ImtleSI6InRpdGxlIiwiaW5mZXJlbmNlVHlwZSI6IlRJVExFIiwidmFsdWVzIjpbIlRyYXZlbCJdLCJ2YWx1ZVR5cGUiOiJNVUxUSV9WQUxVRUQifX19fX0%3D\']")).click();
		
//		Xpath BY TEXT
//		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//section[.='X Path']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//section[.='Login 3.0']")).click();
		
//		driver.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(2000);
//		List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
//		Thread.sleep(2000);
//		for(WebElement i : radio) {
//			i.click();
//			Thread.sleep(2000);
//		}
		
//      Xpath By StartsWith
		
//		driver.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[starts-with(text(), 'Digital')]")).click();
		
//		driver.get("https://www.ebay.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[starts-with(@id,'g')]")).sendKeys("remote control car");
		
//		 ends-with
		
		driver.get("https://www.ebay.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[ends-with(@id,'-ac')]")).sendKeys("remote control car");
		
	}

}

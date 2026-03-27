package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
//BY ID & BY NAME
	public static void main(String[] args) throws InterruptedException {
		//By ID 1
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
		WebElement we = driver.findElement(By.id("APjFqb"));
		we.sendKeys("Selenium");
		Thread.sleep(3000);
		
//		driver.findElement(By.id("APjFqb")).sendKeys("Dharani");
//		2
		driver.get("https://chatgpt.com/");
		Thread.sleep(3000);
		
		WebElement we1 = driver.findElement(By.id("prompt-textarea"));
		we1.sendKeys("Explain Selenium");
		Thread.sleep(3000);
//		3
		driver.get("https://www.google.com/maps/@13.0549097,80.0718848,5169m/data=!3m1!1e3?entry=ttu&g_ep=EgoyMDI2MDIyMi4wIKXMDSoASAFQAw%3D%3D");
		Thread.sleep(3000);
		
		WebElement we2 = driver.findElement(By.id("ucc-1"));
		we2.sendKeys("Vadapalani");
		Thread.sleep(3000);
//		4
		driver.get("https://www.netflix.com/in/");
		Thread.sleep(2000);
		driver.findElement(By.id(":r0:")).sendKeys("dharani@gmail.com");
//		5
		driver.get("https://github.com/login");
		Thread.sleep(2000);
		driver.findElement(By.id("login_field")).sendKeys("dharani@gmail.com");
//		6
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		driver.findElement(By.id("small-searchterms")).sendKeys("Books");
//		7
		driver.get("https://www.w3schools.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("search2")).sendKeys("Testing");
//		8
		driver.get("https://in.bookmyshow.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("dummy")).sendKeys("India");
//		9
		driver.get("https://www.tamilmatrimony.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("NAME")).sendKeys("Dharani");
// 		10
		driver.get("https://www.hackerrank.com/work/free-trial");
		Thread.sleep(2000);
		driver.findElement(By.id("first_name")).sendKeys("Dharani");
		
//		driver.get("https://www.amazon.in/");
//		
//		WebElement we3 = driver.findElement(By.id("twotabsearchtextbox"));
//		we3.sendKeys("Chocolate");
//		Thread.sleep(3000);
		
//		driver.get("https://gemini.google.com/app?utm_source=app_launcher&utm_medium=owned&utm_campaign=base_all");
//		Thread.sleep(3000);
//		
//		WebElement we4 = driver.findElement(By.id("APjFqb"));
//		we4.sendKeys("Selenium");
//		Thread.sleep(3000);
		
		
//		BY NAME
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("search_query")).sendKeys("selenium");
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(10000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
	}

}

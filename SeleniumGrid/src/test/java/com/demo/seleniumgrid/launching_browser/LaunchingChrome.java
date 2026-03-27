package com.demo.seleniumgrid.launching_browser;

import java.net.URL;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchingChrome {
	public static void main(String[] args) throws Exception {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), options);
		
		//Navigating to an application
		driver.get("https://www.selenium.dev/documentation/grid/");
		Thread.sleep(4000);
		driver.quit();
		
	}
}

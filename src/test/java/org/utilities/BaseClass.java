package org.utilities;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	private void excel(String f ) {


	}
	
	public static WebDriver driver;

	public static void launchChrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static String loadUrl(String url) {
		driver.get(url);
		return url;

	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void printTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void currentUrl() {
		System.out.println(driver.getCurrentUrl());
	}
	
	public static void fill(WebElement ele, String value) {
		ele.sendKeys(value);
	}
	
	public static void buttonClick(WebElement ele) {
		ele.click();
		

	}
}

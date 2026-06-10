package com.Actions;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestScrollUpandDown {

	WebDriver driver = new ChromeDriver();
	String url = "https://www.nopcommerce.com/en";

	@Test
	public void Frames() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(10000);

		((JavascriptExecutor) driver).executeScript("scroll(0,6000)");
		Thread.sleep(6000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-4200)", " ");
	}

}

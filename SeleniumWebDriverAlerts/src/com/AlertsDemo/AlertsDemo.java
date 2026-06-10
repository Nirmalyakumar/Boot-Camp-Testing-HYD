package com.AlertsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertsDemo {
	@Test
	public void javaScriptsAlertDemo() {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://only-testing-blog.blogspot.com/");
	}
}
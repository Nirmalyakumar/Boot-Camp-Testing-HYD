package com.SeleniumTestWebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test(priority = 0)
public class LaunchFirefoxBrowser {
	public void FirefoxBrowserTest() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void FirefoxBrowserTest1() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
	}

	@Test(priority = 2)
	public void FirefoxBrowserTest2() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
	}

	@Test(priority = 3)
	public void FirefoxBrowserTest3() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.freecrm.com/");
		driver.manage().window().maximize();
	}

	@Test(priority = 4)
	public void FirefoxBrowserTest4() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.chase.com/");
		driver.manage().window().maximize();
	}

	@Test(priority = 5)
	public void FirefoxBrowserTest5() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://altoro.testfire.net/");
		driver.manage().window().maximize();
	}

	@Test(priority = 6)
	public void FirefoxBrowserTest6() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	}

	@Test(priority = 7)
	public void FirefoxBrowserTest7() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
	}

	@Test(priority = 8)
	public void FirefoxBrowserTest8() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
	}
}

package com.SeleniumTestWebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LaunchEdgeBrowser {
	@Test(priority = 0)
	public void EdgeBrowserTest() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void EdgeBrowserTest1() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
	}

	@Test(priority = 2)
	public void EdgeBrowserTest2() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
	}

	@Test(priority = 3)
	public void EdgeBrowserTest3() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.freecrm.com/");
		driver.manage().window().maximize();
	}

	@Test(priority = 4)
	public void EdgeBrowserTest4() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.chase.com/");
		driver.manage().window().maximize();
	}

	@Test(priority = 5)
	public void EdgeBrowserTest5() {
		WebDriver driver = new EdgeDriver();
		driver.get("http://altoro.testfire.net/");
		driver.manage().window().maximize();
	}

	@Test(priority = 6)
	public void EdgeBrowserTest6() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	}

	@Test(priority = 7)
	public void EdgeBrowserTest7() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
	}

	@Test(priority = 8)
	public void EdgeBrowserTest8() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
	}
}

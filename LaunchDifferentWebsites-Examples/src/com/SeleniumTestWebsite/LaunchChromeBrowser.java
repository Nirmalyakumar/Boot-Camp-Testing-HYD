package com.SeleniumTestWebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test(priority = 0)
public class LaunchChromeBrowser {
	public void ChromeBrowserTest() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void ChromeBrowserTest1() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
	}

	@Test(priority = 2)
	public void ChromeBrowserTest2() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
	}

	@Test(priority = 3)
	public void ChromeBrowserTest3() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/");
		driver.manage().window().maximize();
	}

	@Test(priority = 4)
	public void ChromeBrowserTest4() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.chase.com/");
		driver.manage().window().maximize();
	}

	@Test(priority = 5)
	public void ChromeBrowserTest5() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://altoro.testfire.net/");
		driver.manage().window().maximize();
	}

	@Test(priority = 6)
	public void ChromeBrowserTest6() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	}

	@Test(priority = 7)
	public void ChromeBrowserTest7() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
	}

	@Test(priority = 8)
	public void ChromeBrowserTest8() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
	}

}

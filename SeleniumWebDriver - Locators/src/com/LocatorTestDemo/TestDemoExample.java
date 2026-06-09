package com.LocatorTestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestDemoExample {
		@Test
		public void IDLocator() {
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
			driver.manage().window().maximize();
			String Title = driver.getTitle();
			System.out.println(Title);
			// Locator ID
			//driver.findElement(by.id("username")).sendKeys("student");
			driver.findElement(By.id("username")).sendKeys("student");
			driver.findElement(By.id("password")).sendKeys("Password123");
			driver.findElement(By.xpath("/html/body/div/div/section/section/div[1]/button")).click();
			
			String title = driver.getTitle();
			System.out.println(title);

	}

}

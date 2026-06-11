package com.ScreenShotDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Library.Reusability;

public class TestScreenShot {
	@Test
	public void Browser() throws Exception {
		ChromeDriver driver = new ChromeDriver ();
		driver.navigate().to("https://www.hollandandbarrett.com/");
		driver.manage().window().maximize();
		
		Reusability.captureScreenShot(driver, "A. Launch Application - Take SceenShot");
		
		driver.findElement(By.id("username")).sendKeys("raghu.astepahead@gamil.com");
		driver.findElement(By.name("password")).sendKeys("raghuBN@123");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@name='action']")).click();
		
		Reusability.captureScreenShot(driver, "B. Click Sign In Button - TakeScreenShot");
		
		driver.quit();
	}

}

package com.MultipleFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class MultipleFramesTestDemo {
	@Test
	public void Frames() throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("file:///C:/Users/Nirmalya.Mohanta/Downloads/index.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		int totalnoofframes = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of Frames: " + totalnoofframes);
		
		driver.switchTo().frame("easycalculation");
		driver.get("https://www.login.hiox.com/login?referrer=easycalculation.com");
		driver.findElement(By.id("log_email")).sendKeys("6371996914");
		driver.findElement(By.id("log_password")).sendKeys("Helloburger@123");
		driver.findElement(By.xpath("//*[@id=\"log_frm\"]/div[4]/input[1]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.switchTo().frame("Practise Automation");
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.name("username")).sendKeys("student");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);

	}

}

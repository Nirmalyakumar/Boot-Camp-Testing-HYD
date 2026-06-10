package com.AlertsDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DemoAlerts {
	@Test
	public void TestPopups() throws Exception{
		WebDriver driver = Helper.startBrowser("GC");
		driver.get("https://www.ksrtc.in/");
		driver.findElement(By.name("proceed")).click(); // Click on Go Button
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		String text = alert.getText();
		
		if (text.equals("Please enter a valid Nirmalya))
	}

}

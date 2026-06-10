package com.RadioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButtonTest {
	WebDriver driver;
	String url = "https://www.spicejet.com/";
	
	@Test
	public void setUp () {
		driver = new ChromeDriver ();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/div[2]/div")).click();
	
	}

}

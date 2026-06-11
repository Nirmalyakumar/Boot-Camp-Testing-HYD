package com.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragandDrop {
	WebDriver driver;
	String url = ("https://jqueryui.com/droppable/");
	
	@Test
	public void setUp() {
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		Actions action = new Actions (driver);
		action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]"))).moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]"))).release().build().perform();
	}

}

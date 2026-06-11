package com.Library;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Reusability {
	public static void captureScreenShot(WebDriver driver, String screenshot) {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./ScreenShots/" + screenshot + ".png"));
			
			System.out.println("Captured Screenshot - By Selenium WebDriver");
		}catch (Exception e) {
			System.out.println("Exception while taking Screenshot" + e.getMessage());
		}
	}

}

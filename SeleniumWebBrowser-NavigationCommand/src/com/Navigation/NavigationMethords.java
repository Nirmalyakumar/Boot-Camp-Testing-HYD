package com.Navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class NavigationMethords {
	WebDriver driver;
	@Test(priority=0)
	public void NavigateTo() {
		driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		String URL = driver.getCurrentUrl();
		driver.quit();
		
	}
	@Test(priority=1)
	public void Navigateback() {
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		driver.navigate().refresh();
		URL = driver.getCurrentUrl();
		System.out.println(URL);
	}
	@Test(priority=2)
	public void RefreshMethod() {
		driver = new ChromeDriver();
		driver.get("https://www.edge.com");
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		driver.navigate().refresh();
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		driver.navigate().refresh();
		URL = driver.getCurrentUrl();
		System.out.println(URL);
	}
	
	@Test(priority=3)
	public void NavigateForward() {
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		String Title = driver.getTitle();
		System.out.println(Title);
		
		driver.navigate().to("https://login.yahoo.com/");
		URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		driver.navigate().back();
		URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		driver.navigate().forward();
		URL = driver.getCurrentUrl();
		System.out.println(URL);
	}

}
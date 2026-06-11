package com.EasyCalculationsTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.EasyCalculationPages.LoginEasyCalculation;
import com.Helper.BrowserFactory;

public class ExecuteLoginPage {
	@Test
	public void CheckValidUser() {
		WebDriver driver = BrowserFactory.BrowserOptions("Chrome",
				"https://www.login.hiox.com/login?referrer=easycalculation.com");
		LoginEasyCalculation initElements = PageFactory.initElements(driver, LoginEasyCalculation.class);
		initElements.login_EasyCal("9740673180", "raghubn@123");
	}

}

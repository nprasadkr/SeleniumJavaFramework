package com.perfsfm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPage {
	WebDriver driver;
	@BeforeTest
	public void initialSetUp()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@Test
	public void loginverify(){
		driver.get("https://test.salesforce.com/");		
	}

}

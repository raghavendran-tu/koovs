package com.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.openqa.selenium.OutputType;


public class Tools {
	public static WebDriver driver;
	public static WebDriverWait webDriverWait;
		
	@BeforeMethod(alwaysRun=true)
	public void tools() throws IOException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		Properties properties = new Properties();
		FileInputStream fileInputStream = new FileInputStream(".\\src\\test\\\\resources\\\\configuration.properties");
		properties.load(fileInputStream);
		driver.get(properties.getProperty("URL"));
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--disable-notifications");
		driver.findElement(By.xpath("//div[text()='Accept']")).click();
		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		}
	
	
	public void takeScreenshotAtEndOfTest() throws IOException {
		java.io.File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}
	
	
	
}
	

package koovs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.qa.base.Tools;

public class KoovsContactUs extends Tools 
	{
		@Test
			
			
			public void koovsContactUs() throws InterruptedException, IOException
			{
				Properties properties = new Properties();
				FileInputStream fileInputStream = new FileInputStream(".//src//test//resources//configuration.properties");
				properties.load(fileInputStream);
				driver.get(properties.getProperty("URL"));
				driver.findElement(By.xpath("//div[text()='Accept']")).click();
				Thread.sleep(1000);
				webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Login']")));
				driver.findElement(By.xpath("//a[text()='Login']")).click();
				Thread.sleep(1000);
				webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-email")));
				driver.findElement(By.id("login-email")).sendKeys("raghavendran_tu@yahoo.co.in");
				Thread.sleep(1000);
				webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-pswd")));
				driver.findElement(By.id("login-pswd")).sendKeys("MultiUse@89");
				Thread.sleep(1000);
				webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				Thread.sleep(3000);
		        JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("window.scrollBy(0,1000)");
		        Thread.sleep(3000);
				driver.findElement(By.linkText("Contact Us")).click();
				Thread.sleep(3000);
				
		}
		}





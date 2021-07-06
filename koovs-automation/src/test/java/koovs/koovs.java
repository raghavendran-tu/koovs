package koovs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class koovs {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait webDriverWait = new WebDriverWait(driver,10);
		driver = new ChromeDriver();
		driver.get("https://www.koovs.com/");

	webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign Up")));
	driver.findElement(By.linkText("Sign Up")).click();
	webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("reg-name")));
	driver.findElement(By.id("reg-name")).sendKeys("raghavendran");
	webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("reg-email")));
	driver.findElement(By.id("reg-email")).sendKeys("raghavendran_tu@yahoo.co.in");
	webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("reg-pswd")));
	driver.findElement(By.id("reg-pswd")).sendKeys("MultiUse@89");
	webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("reg-mobile")));
	driver.findElement(By.id("reg-mobile")).sendKeys("9790734703");
	webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Male']")));
	driver.findElement(By.xpath("//span[text()='Male']")).click();
	webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='SIGN UP']")));
	driver.findElement(By.xpath("//button[text()='SIGN UP']")).click();
	}
}

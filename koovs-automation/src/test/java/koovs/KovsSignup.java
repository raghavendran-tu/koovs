//package koovs;
//
//import java.io.FileInputStream;
////import java.io.FileInputStream;
////import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.Properties;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.Test;
//
//import utilities.ReadExcel;
//import utilities.Tools;
//
//public class KovsSignup extends Tools 
//
//{
//		
//	@Test(dataProvider = "KoovsData",dataProviderClass = ReadExcel.class)
//	public void kovsSignup(String Fullname, String  Email, String password, String mobile) throws InterruptedException, IOException {
//			
//		Properties properties = new Properties();
//		FileInputStream fileInputStream = new FileInputStream(".//src//test//resources//configuration.properties");
//		properties.load(fileInputStream);
//		driver.get(properties.getProperty("URL"));
//		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign Up")));
//		driver.findElement(By.linkText("Sign Up")).click();
//		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("reg-name")));
//		driver.findElement(By.id("reg-name")).sendKeys(Fullname);
//		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("reg-email")));
//		driver.findElement(By.id("reg-email")).sendKeys(Email);
//		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("reg-pswd")));
//		driver.findElement(By.id("reg-pswd")).sendKeys(password);
//		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("reg-mobile")));
//		driver.findElement(By.id("reg-mobile")).sendKeys(mobile);
//		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Male']")));
//		driver.findElement(By.xpath("//span[text()='Male']")).click();
//		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='SIGN UP']")));
//		driver.findElement(By.xpath("//button[text()='SIGN UP']")).click();
//		
//		
//
//		
//	}
//		
//}
//	
//	

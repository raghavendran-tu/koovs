package koovs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.base.Tools;
//@Listeners(Listener.ListenerTest.class)
public class KoovsAddToCart extends Tools {
	@Test
	
	
	public void koovsaddtocart() throws IOException, InterruptedException
	{
//		Properties properties = new Properties();
//		FileInputStream fileInputStream = new FileInputStream(".//src//test//resources//configuration.properties");
//		properties.load(fileInputStream);
//		driver.get(properties.getProperty("URL"));
//		String title = driver.getTitle();
//		Assert.assertEquals(title,"Online Shopping - Shop for Clothing, Shoes & Accessories in India at Koovs");
//		SoftAssert softAssert = new SoftAssert();
//		softAssert.assertEquals(title, "Koovs.com");
		driver.findElement(By.xpath("//div[text()='Accept']")).click();
		Thread.sleep(2000);
		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Login']")));
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(2000);
		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-email")));
		driver.findElement(By.id("login-email")).sendKeys("raghavendran_tu@yahoo.co.in");
		Thread.sleep(2000);
		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-pswd")));
		driver.findElement(By.id("login-pswd")).sendKeys("MultiUse@89");
		Thread.sleep(3000);
		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search-input-field")));
		driver.findElement(By.id("search-input-field")).sendKeys("tshirt");
		driver.findElement(By.xpath("//div[@class='sprite-item h_searchIcon']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Future Abstract Print T-shirt']")).click();
		String mainWindow = driver.getWindowHandle();
		Thread.sleep(3000);
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> list = new ArrayList<String>();
		list.addAll(windowHandles);
		for (int i = 0; i < list.size(); i++) {
			if (!mainWindow.equals(list.get(i))) {
				driver.switchTo().window(list.get(i));
										}
		}
		driver.findElement(By.xpath("//span[text()='L']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='add-to-bag-btn add-to-bag-btn-half']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='go-to-bag-btn-buynow']")).click();
		Thread.sleep(5000);

}
}
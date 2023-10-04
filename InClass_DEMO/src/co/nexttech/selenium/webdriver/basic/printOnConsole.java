package co.nexttech.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class printOnConsole {
	
	public static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\\\\\\\Driver\\\\\\\\chromedriver.exe");
		driver = new ChromeDriver();
				
		//Launching Google WebPage..
		driver.get("https://www.google.com/");
				
		//Maximizing the window..
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#APjFqb")).sendKeys("FaceBook");
		//driver.findElement(By.cssSelector("body:nth-child(2) div.L3eUgb:nth-child(2) div.o3j99.ikrT4e.om7nvf:nth-child(3) form:nth-child(3) > div:nth-child(1)")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("body:nth-child(2) div.L3eUgb:nth-child(2) div.o3j99.ikrT4e.om7nvf:nth-child(3) form:nth-child(3) > div:nth-child(1)")).click();
		
		
		//Printing the current page title on Console..
		System.out.println(driver.getTitle());
		
		//Java Thread Sleep..
		Thread.sleep(500);
		
		//Selenium Implicit Wait..
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Explicit Wait 
		//WebDriverWait wait = new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("")));
		
		//Fluent Wait 
		//WebDriverWait wait1 = new WebDriverWait(driver,20);
		//wait1.until(ExpectedConditions.elementToBeClickable(By.id("")));
		//Start-------5sec-----5sec----5sec-----20sec
				
		//Closing the Browser
		driver.quit();

	}

}

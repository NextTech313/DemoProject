package co.nexttech.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSession {

	public static void main(String[] args) throws InterruptedException {
		
		
		//Below is how you set the property of the BrowserDriver.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NextT\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//Invoking the Driver.
		ChromeDriver driver = new ChromeDriver();
		//Launching the Site.
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();
		driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']")).click();
		driver.findElement(By.xpath("//button[@id='remove-sauce-labs-bike-light']")).click();
		
		driver.findElement(By.xpath("//button[@id='continue-shopping']")).click();
		
		
		String ele = driver.findElement(By.xpath("//span[contains(text(),'Products')]")).getText();
		Thread.sleep(2000);
		System.out.println(ele);
		//driver.quit();
		driver.close();
		
		
		
		
	}
	
	//driver.findElement(By.xpath("")).click();
	//driver.findElement(By.xpath("")).sendKeys("");
}

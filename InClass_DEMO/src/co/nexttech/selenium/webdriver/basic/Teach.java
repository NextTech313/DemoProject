package co.nexttech.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teach {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NextT\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Going to a specific site
		driver.get("https://www.facebook.com");
		//Maximizing the browser
				driver.manage().window().maximize();
				//Waiting for 10Sec
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//Clicking the AboutUs Page
				driver.findElement(By.linkText("Create new account")).click();
				
				//Closing the browser
				//driver.quit();
	}

}

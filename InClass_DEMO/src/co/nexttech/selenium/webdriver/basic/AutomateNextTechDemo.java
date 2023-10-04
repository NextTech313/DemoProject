package co.nexttech.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateNextTechDemo {

	public static void main(String[] args) {
		
	
		
		//Invoking the Browser
		WebDriver driver = new ChromeDriver();
		//Setting the Driver Property
		System.setProperty("webdriver.chrome.driver", ".\\\\\\\\Driver\\\\\\\\chromedriver.exe");
		//Going to a specific site
		driver.get("https://nexttechtraining.com/");
		//Maximizing the browser
		driver.manage().window().maximize();
		//Waiting for 10Sec
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Clicking the AboutUs Page
		driver.findElement(By.xpath("//span[contains(text(),'About Us')]")).click();
		//Closing the browser
		driver.quit();

	}

}

package co.nexttech.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class searchForPizzaDemo {
	
	public static WebDriver driver = null;
	Element_Locators EL = new Element_Locators();

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".\\\\\\\\Driver\\\\\\\\chromedriver.exe");
		
		
		driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("#APjFqb")).sendKeys("Pizza Store Near Me",Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement tab = driver.findElement(By.cssSelector("body.srp:nth-child(4) div.main:nth-child(11) div.e9EfHf div.GyAeWb:nth-child(18) div.s6JM6d:nth-child(3) div.eqAnXb:nth-child(1) div.v7W49e div.MjjYud:nth-child(1) div.g.Ww4FFb.vt6azd.tF2Cxc.asEBEc:nth-child(9) div.kvH3mc.BToiNc.UK95Uc div.Z26q7c.UK95Uc.jGGQ5e:nth-child(1) div.yuRUbf:nth-child(1) a:nth-child(1) > h3.LC20lb.MBeuO.DKV0Md:nth-child(2)"));
		
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).moveToElement(tab).click().perform();
		System.out.println(driver.getTitle());
	
		
		driver.close();
	}

}

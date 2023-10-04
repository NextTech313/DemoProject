package co.nexttech.selenium.webdriver.basic;


import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class searchGoogle {
	
	//() Method sign, {}Building block/curlybrace, []Array sign, | Pipesign, ~ tilde
	//A method must have Method sign and Building block, must end with semicolen 
	
	
	/*Searching for Pizza Store near me in google and then ctrl+click on the top link
	to be able to open the search in  new tab*/
	
	public static WebDriver driver = null;
	
	public static void kurbaniMeat() {
		
	}

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
		driver.get(null);
		
		
		Element_Locators el = new Element_Locators();
		
		System.setProperty(el.webDriver, el.chromeDriver);
		driver = new ChromeDriver();

		
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Explicit Wait example
		WebDriverWait w = new WebDriverWait(driver,10);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\\\\\"rso\\\\\\\"]/div[1]/div/div/div[1]/div[1]/a/h3")));
		
		driver.findElement(By.cssSelector("#APjFqb")).sendKeys("Pizza Store Near Me",Keys.ENTER);
		WebElement firstLink = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div[1]/a/h3"));
		
		
		//Opening new tab to start the search.
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).moveToElement(firstLink).click().perform();
		
		//Putting focus on the new tab.
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		//Getting title for each tabs opened using Java.Set and Java Iterator.
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		
		//We have to loop through each page first and then grab the title.
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		
		
		System.out.println("We are Currently In - " + driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();

	}

}

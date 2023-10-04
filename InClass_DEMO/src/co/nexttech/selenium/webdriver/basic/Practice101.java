package co.nexttech.selenium.webdriver.basic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.tuple.Pair;
import org.openqa.selenium.*;

public class Practice101 {

	public static void main(String[] args) throws InterruptedException {
		
		//https://www.xfinity.com/
		
		
		System.setProperty("webdriver.chrome.driver", ".\\\\\\\\Driver\\\\\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.xfinity.com/overview");
		Thread.sleep(2000);
		
	// target menus "//a[contains(text(),'Internet Essentials')]" verify 'internet-essentials' and "//a[contains(text(),'Internet Deals')]" and Internet
		// //a[contains(text(),'Gig-speed Internet')] and 'gig'
		

		HashMap<String,String> hmap=new HashMap<String,String>();
		hmap.put("Internet Essentials", "internet-essentials");
		hmap.put("Internet Deals", "Internet");
		hmap.put("Gig-speed Internet", "modems-and-routers");
		
		// Mouse hover on Internet menu
		
		//Iterator<Entry<String,String>> itr=hmap.entrySet().iterator();
		
		for(Map.Entry<String, String> pairValue1 : hmap.entrySet())
		{
			String locatorSubstring=pairValue1.getKey();
			String urlSubstring=pairValue1.getValue();
			
			
			WebElement elemnt=driver.findElement(By.xpath("//xc-header/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/button[1]"));
		
					
			Actions action=new Actions(driver);
			action.moveToElement(elemnt).perform();
			
			WebElement targetElement =driver.findElement(By.xpath("//a[contains(text(),'"+locatorSubstring+"')]"));
			
			targetElement.click();
			
			String url=driver.getCurrentUrl();
			boolean test=url.contains(urlSubstring);
			System.out.println("test result"+ test+ " for "+locatorSubstring);
			Thread.sleep(1000);
		}
		
	/*	while(itr.hasNext())
		{
			Map.Entry<String, String> pairValue= (Map.Entry<String, String>)itr.next();
			
			
			WebElement elemnt=driver.findElement(By.xpath("//xc-header/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/button[1]"));
			
			Actions action=new Actions(driver);
			action.moveToElement(elemnt).perform();
			
			WebElement targetElement =driver.findElement(By.xpath("//a[contains(text(),'"+pairValue.getKey()+"')]"));
			
			targetElement.click();
			
			String url=driver.getCurrentUrl();
			boolean test=url.contains(pairValue.getValue());
			System.out.println("test result"+ test+ " for "+pairValue.getKey());
			
		}*/
		

		
		/*WebElement elemnt=driver.findElement(By.xpath("//xc-header/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/button[1]"));
		
		Actions action=new Actions(driver);
		action.moveToElement(elemnt).perform();
		
		// Click on Internet Deals
		
		WebElement internetDealsElement =driver.findElement(By.xpath("//a[contains(text(),'Internet Deals')]"));
		
		internetDealsElement.click();
		
		// verify the user is on Internet deals page
		
		//WebElement targetPage= driver.findElement(By.xpath("//h2[contains(text(),'Xfinity Internet Deals')]"));
		//boolean test=targetPage.getText().contains("Internet Deals");
		//System.out.println("test result"+ test);
		
		String url=driver.getCurrentUrl();
		boolean test=url.contains("Internet");
		System.out.println("test result"+ test);*/
		
		
				
	}

}

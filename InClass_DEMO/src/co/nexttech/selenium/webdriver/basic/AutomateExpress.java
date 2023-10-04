package co.nexttech.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import okio.Timeout;

public class AutomateExpress {
	
	//WebDriver driver;
	
	
	
	//Opening ChromeBrowser and going to Express.com
	//Clicking some of the footer and header pop-ups
	public void openBrowser() throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\NextT\\Downloads\\chromedriver-win64\\chromedriver-win64");
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://nexttechtraining.com/");
	//driver.findElement(By.xpath("//*[@id=\"onetrust-close-btn-container\"]/button")).click();
	//driver.findElement(By.xpath("//*[@id=\"signinpop\"]/div/a[1]/img")).click();	
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/nav[1]/ul[1]/li[1]/a[1]/span[2]")).click();
	driver.quit();
	
	/*
	WebElement firstResult = new WebDriverWait(driver, 10)
					.until(ExpectedConditions.elementToBeClickable(By.xpath(null)));
	System.out.println(firstResult.getText());
	
	int list = driver.findElements(By.xpath("//body/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/ol[1]/li/a[1]")).size();
	WebDriverWait wait=new WebDriverWait(driver, 10);
	for(int i = 1; i<=list; i++) {
		driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/ol[1]/li["+i+"]/a[1]")).click();
		driver.navigate().back();
		
		try{
			if(wait.until(ExpectedConditions.alertIsPresent())!=null)
		{driver.switchTo().alert().dismiss();
    }
		}catch(Exception e)
	{
			System.out.println();
		}
	}
	driver.quit();*/
}
	
	

	public static void main(String[] args) throws InterruptedException {
		AutomateExpress p = new AutomateExpress();
		p.openBrowser();
		
		
		
		

	}

}

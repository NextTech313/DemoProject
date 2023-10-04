
package co.nexttech.selenium.webdriver.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		/*Selenium provided us with a Manage class inside which- we have a windows class 
		  which provides us a Maximize method.*/
		
		driver.manage().window().maximize();

	}

}

package co.nexttech.selenium.webdriver.basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class Element_Locators {
	
	//WebDriver path
	public static String webDriver = "webdriver.chrome.driver";
	
	//ChromeDriver path
	public static String chromeDriver = ".\\\\Driver\\\\chromedriver.exe";
	
	//Application URL
	public static String appURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	//Locator for the Admin button.
	public static String adminXpath = "//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[1]//span";
	
	//Locator for the PIM button.
	public static String pimXpath = "//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[2]//span";
	
	//Locator for the Leave button.
	public static String leaveXpath = "//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[3]//span";
	
	//Locator for the Time button.
	public static String timeXpath = "//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[4]//span";
	
	

}

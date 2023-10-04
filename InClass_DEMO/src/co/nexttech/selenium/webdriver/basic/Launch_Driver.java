package co.nexttech.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Driver {
	
	public static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		
		
		// Creating the Object of the Element_Locators class to extend->this will allow us to use everything from that class.
		Element_Locators EL = new Element_Locators();

		// First Step is to set Property of the WebDriver and Chrome Driver in order for you to launch any browser.
		System.setProperty(EL.webDriver, EL.chromeDriver);
		
		//Then you have to create a Instance of the Driver within the method to use it.
		driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Opening the Application.
		driver.get(EL.appURL);	
		Thread.sleep(20);
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();
		
		// Below command verifies that you are in DashBoard.
		String dashboardHeaderText = driver.findElement(By.tagName("h6")).getText();
		boolean pageLoadSuccess= dashboardHeaderText.equals("Dashboard");
		System.out.println("Correct Dashboard page loaded - "+pageLoadSuccess);
		System.out.println("Dashboard header text is - "+dashboardHeaderText);
		
		// Click Admin and verify landing page.
		WebElement adminLink=driver.findElement(By.xpath(EL.adminXpath));
		adminLink.click();
		String adminHeaderText=driver.findElement(By.tagName("h6")).getText();
		boolean adminPageLoaded= adminHeaderText.equals("Admin");
		System.out.println("Correct Admin page loaded - "+adminPageLoaded);
		System.out.println("Admin header text is - "+adminHeaderText);
		
		// Click PIM and verify landing page.
		WebElement PIMLink=driver.findElement(By.xpath(EL.pimXpath));
		PIMLink.click();
		String PIMHeaderText=driver.findElement(By.tagName("h6")).getText();
		boolean PIMPageLoaded= PIMHeaderText.equals("PIM");
		System.out.println("Correct Dashboard page loaded - "+PIMPageLoaded);
		System.out.println("PIM header text is - "+PIMHeaderText);
		
		// Click Leave and verify landing page.
		WebElement LeaveLink=driver.findElement(By.xpath(EL.leaveXpath));
		LeaveLink.click();
		String LeaveHeaderText=driver.findElement(By.tagName("h6")).getText();
		boolean LeavePageLoaded= LeaveHeaderText.equals("Leave");
		System.out.println("Correct Leave page loaded - "+LeavePageLoaded);
		System.out.println("Leave header text is - "+LeaveHeaderText);
		
		// Click Time and verify landing page.
		WebElement TimeLink=driver.findElement(By.xpath(EL.timeXpath));
		TimeLink.click();
		String TimeHeaderText=driver.findElement(By.tagName("h6")).getText();
		boolean TimePageLoaded= TimeHeaderText.equals("Time");
		System.out.println("Correct Time page loaded - "+TimePageLoaded);
		System.out.println("Time header text is - "+TimeHeaderText);
		
		// Verify the carrot icon on side menu
		System.out.println("Verify the side menu is default opened");
		WebElement carretlink=driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/div[1]/div[1]/button[1]/i"));
		String classAttributeValue=carretlink.getAttribute("class");
		boolean isSidemenuDefaultOpened= classAttributeValue.contains("left");
		System.out.println("Sidemenu is Default Opened - "+isSidemenuDefaultOpened);
		carretlink.click();
		Thread.sleep(1000);
		carretlink=driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/div[1]/div[1]/button[1]/i"));
		classAttributeValue=carretlink.getAttribute("class");
		boolean isSideMenuCollapsed= classAttributeValue.contains("right");
		System.out.println("Sidemenu is Collapsed - "+isSideMenuCollapsed);
		
		//Thread.sleep(3000);
		
		// Closing the Browser
		driver.close();
		driver.quit();

	}

}

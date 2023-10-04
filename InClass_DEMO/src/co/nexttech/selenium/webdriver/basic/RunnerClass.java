package co.nexttech.selenium.webdriver.basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class RunnerClass {
	
	static ChromeDriver driver = new ChromeDriver();

	
	

	public static void main(String[] args) {
		/*Below is the way we create an Object of a class. So that we could start calling all the methods from 
		that class. Bare minimum we need to create an Object > 1st- Initialize the classname. 2nd- give it a new
		variable name. 3rd- '=' operator. 4th-'new' keyword. 5th - name of the class again.6th- method sign and 
		semicolon*/
		//We create an Object so that we could call all the properties from the other class.
		Demo d = new Demo();
		//int y = d.dipuDemo(9, 8)+7;
		
		System.setProperty("", "");
		int y = d.addNumbers3(3,3)*3;
		System.out.println(y);
		String changedLastName = d.dipuLastName().concat("Chawdhury");
		System.out.println(changedLastName);
		d.dipuLastName1();
		
		
		
		
		//Car c = new Tesla();
		//c.speed();
		
		//BeTech b = new BeTech();
		//b.mulTwoNumbers();
		//b.printName();
		//b.addNumbers(22, 11);
		//b.printName("John", "Marry");
		//b.add();

	}

}

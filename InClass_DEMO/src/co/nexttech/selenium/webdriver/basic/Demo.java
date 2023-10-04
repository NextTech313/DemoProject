package co.nexttech.selenium.webdriver.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	float f = 3.3f;
	long l = 1222L;
	char c = 'A';
	
	static boolean B;
	
	//Class Name = PascalCase > Naming convention - EX > DemoClass ( public class JavaTutorial ) 
	//Method name = camelCase > Naming convention - EX > addTwoNumber ( public class javaTutorial ) 
	//Variable name = camelCase > Naming convention - EX > addTwoNumber
	
	//Method sign - ()
	//Building blocks - {}
	//Array signs - []
	
	//Variables are just like a container, that holds something.
	
	/*Variables - We could create a variable with the value or without the value. If you dont assign
	  value to a global variable-by default it has a value(int=0, String=null and boolean=false)*/
	
	//DataTypes
	
	int x;
	int d;
	String name = "John"; //This is also known as Instance variable --> Position wise>its a global variable.
	
	/*Creating a method-->Minimum requirement 1.You need a return type. 2.You need a method name.
	  3.You need a method sign(). and 4. You need building blocks {}. We create methods to perform
	  some actions.*/
	//Q1-Take  9 and 11 then add them..?
	
	public void addTwoNumber(int a, int b) {
		a = 9;
		b = 8;
		System.out.println(a+b);
	}
	
	//This consider as performing an action. Same x if you put "" what would be the value..?
	//Action fixed "VOID", Value of the variable fixed "NO PARAMETER"
	//Data Type and Variable in the method sign is called Parameterized.
	void addNumber() {
		int y = 22; //Local variable. Because its within the method.
		int t;//Local variable does not have any value if you dont assign one.
		System.out.println(x);
	}
	//Now if i say - I want to print 2 numbers. Do i know the numbers..? Do i know the action..?
	public static void addTwoNum(int a, int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		addTwoNum(9,8);
		System.out.println(B);
	}
	
	public void dipuDemo(int a, int b) {
		System.out.println(a*b);
	}
	
	//Do something with 2 number?
	public int addNumbers3(int a, int b) {
		int x = a+b;
		System.out.println(a+b);
		return x;	
	}
	public String dipuLastName() {
		String lastName = "Mir";
		System.out.println(lastName);
		return lastName;
		
	}
	public void dipuLastName1() {
		String lastName = "Mir";
		System.out.println(lastName);
	}
	//I dont know what will i do after adding 2 and 8..?
	
	public int letsDoSomethingWithThese2Num() {
		int a = 2;
		int b = 8;
		int c = a*b;
		System.out.println(c);
		return c;
	}
	
	private static void methodName2200() {
		
	}
	
}

package co.nexttech.selenium.webdriver.basic;

public class BeTech {
	
	//Do something with any 2 large numbers..?
	//If the Action is not given, You put the DataType as your Return type.
	//Return type means - whatever the action you perform > the value of that action will be stored in that method name.
	public static int add() {
		int x = 33;
		int y = 44;
		return x+y;
	}
	public static void main(String[] args) {
		int sum = add();
		System.out.println(sum);
	}
	
	
	//Global Variables - Position wise they are outside the method, but inside the class.
	int a = 10;
	int b = 33;
	int c; //Global variables by default has a value.
	long t = 10L;
	char name = 'D';
	String name1 = "New York";
	
	//The bare minimum you need to write a Methods - 1st - Access Modifier. 2nd- Return type. 3rd - Method name. 
	//4th - method sign. 5th - building blocks
	//A return type depends on an Action of that method.
	/*Parameterized means - You initialize the DataType and Variable name in the method sign of the method only. 
	The Value will be provided at the runtime*/
	public void multipleNumbers(int c, int d) {
		
	}
	
	//Add any 2 numbers..?
	
	//Method1
	public void add2Numbers(int a, int b) {
		System.out.println(a + b);
	}
	//Multiply 22 and 33..?
	//Method2
	public void mulTwoNumbers() {
		int a = 22;
		int b = 33;
		int c = a * b;
		System.out.println(c);
	}
	//Print the name John Ross..?
	//Method3
	public void printName1() {
		String name = "John Ross";
		System.out.println(name);
	}
	
	//If the Action is fixed, the return type is always VOID. 
	//If the value is fixed, then we use variables.
	/*If the value is not fixed, then we have to parameterize the method. 
	We will input the value when we run the method.*/
	//When you use parameter for your methods, You only need to initialize the data type and variable.
	
	//Add any 2 numbers..?
	//Method4
	public void addNumbers(int a,int b ) {
		System.out.println(a+b);
	}
	
	//Add the number 44 and 55..?
	//Method5
	public void addTwoNumber() {
		int x = 44;
		int y = 55;
		System.out.println(x + y);
	}
	//Method6
	public void subTwoNumber() {
		System.out.println(a-b);
	}
	//Print any 2 names..?
	//Method7
	public void printName(String a,String b) {
		System.out.println(a);
		System.out.println(b);
	}

	

}

package co.nexttech.selenium.webdriver.basic;

public class EncapsulationDemo {
	
	//Encapsulation = setting and retrieving variables.
	//In Java encapsulation means all the settings of variables are inside a method.
	//All Java Object has Attributes and things it can do.
	//So here name will have 2 methods(Get Name and Set Name) and age will have 2 methods(Set age and get age).
	/*Static means- you dont have to create an object to call the method. But in this case we are going to 
	  create an EncapsulationDemo object to retrieve the methods.*/
	
	private String name;
	int age;
	
	public void setEncapsulationDemo(String newName) {
		name = newName;
	}
	public String setEncapsulationDemo() {
		return name;
	}

}

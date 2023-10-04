package co.nexttech.selenium.webdriver.basic;

public class Tesla extends Car{
	
	
	/*Based on "IS A" relationship. Here we are saying that a "Tesla is a Car". You can not
	 * say A car is a Tesla.So when we Inherit > all the methods from Car class is now in Tesla class.
	 * However, the implementation going to be different, because a Car is common-could be any car.
	 * But a Tesla is a specific type of car. That means, we have to override the methods from 
	 * the Car class based on Tesla's attributes. To be able to change the implementations - We 
	 * get introduced to Method OverRiding. In method OverRiding - you can only change the body of 
	 * the method nothing else. The name of the method, return type, access modifies and parameter 
	 * has to stay the same. Now - by changing the body doesn't mean that its overridden. We have to 
	 * verify and to do that > there are 2 ways 1) By using the "Override" annotation(@Override)
	 * {if it didnt then there will be a red mark on the Override 2) We will create an Object of 
	 * Child class using the reference of the parent class ( Car c = new Tesla();)and then call a 
	 * method from the parent class and hover over it-if it shows that the method coming from the child 
	 * class then the override happened. If you over over and it shows that the method coming from 
	 * the parent class then the over ride didn't happen.
	 */
	
	public static void speed() {
		System.out.println("500");
	}
	public static void colors() {
		System.out.println("Color is Blue");
	}
	

	public static void main(String[] args) {
		
	}
}

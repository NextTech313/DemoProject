package co.nexttech.selenium.webdriver.basic;

public class PenClass {
	
	
	static String color = "blue";
	static int ballPoint = 10;
	static 	boolean clicked =true;
	static boolean cap =true;
	
	public static void makeSureTheColorIsBlue() {
		
		if(color =="") {
			System.out.println("Wrong color");
		}else {
			System.out.println("Color is blue");
		}
	}
	

	public static void main(String[] args) {
		makeSureTheColorIsBlue();
	}

}

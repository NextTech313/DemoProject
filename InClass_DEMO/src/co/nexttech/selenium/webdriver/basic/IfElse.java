package co.nexttech.selenium.webdriver.basic;

public class IfElse {
	
	static int age = 44;
	static String studentName = "Shohag";
	
	public static void letsJustCheck() {
		
		if(studentName =="Mary") {
			System.out.println("Its not Shohag");
		}else {
			System.out.println("WrongName");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		letsJustCheck();
	}
}

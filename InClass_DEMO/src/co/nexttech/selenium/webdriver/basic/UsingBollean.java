
package co.nexttech.selenium.webdriver.basic;



public class UsingBollean {
	
	static String name;
	static String name1 = "Emon";
	static int a = 7;
	
	
	/*public void giveMeTheNameOfURL()
	url = www.google.com
	/*{if(url =="google.com")
	driver.findelement().click()}
	*/
	/*public static void isTheNumberCorrect() {
		
		if(a>=7) {
			System.out.println("TrueStatement");
		}else{
			System.out.println("A is not grater then 7");
		}
	}*/
	
	public static void nameIncorrect(String name) {
		
		if(name =="Abeer") {
			System.out.println("The name is correct");
		}else{
			System.out.println("Wrong name");
		}
	}

	
	
	public static void main(String[] args) {
		//isTheNumberCorrect();
		nameIncorrect("Abeer");

	}

}

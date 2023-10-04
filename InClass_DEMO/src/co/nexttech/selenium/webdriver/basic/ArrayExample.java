package co.nexttech.selenium.webdriver.basic;

public class ArrayExample {

	public static void main(String[] args) {
		
		int [] studentID = {3,4,7,8,9};
		System.out.println(studentID[4]);
		
		
		
		String student1 = "Kseniia";
		String student2 ="Dipu";
		String student3 = "Tahmina";
		String student4 = "Nadia";
		String student5 = "Nabil";
		String student6 = "Asif";
		
		String [] studentName = {"Dipu","Kseniia","Asif","Nadia","Tahmina","Nabil"};
		
		System.out.println("Retrieving single Array value - " + studentName[2]);
		
		
		/*What is an Array[]..? An Array is a container that holds multiple values and its easier 
		 to retrieve.*/
		//How to declare an Array..? See below
		
		char[] singleCharacter = {'A','V','D'};
		
		int [] studentNum = {1, 2, 3, 4};
		System.out.println(studentNum[3]);
		
		
		
		
		/*How to retrieve its value..? You can retrieve a value from an Array by calling the 
		 index number.*/
		//Example shown below..
		
		
		
		System.out.println("Retrieving multiple Array value below - ");
		
		/*If you would like to retrieve all value from an Array all at once - then you have to 
		 utilize FOR Loop.*/
		//Example below..
		for(int i =0; i < studentName.length; i++) {
			System.out.println(studentName[i]);
		}

	}

}

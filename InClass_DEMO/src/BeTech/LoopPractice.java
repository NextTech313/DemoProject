

package BeTech;



public class LoopPractice {
	
	//Lets go ahead and print every Students name from today's class..?
	public static void printStudentsName() {
		
		String[] studentName = {"Dipu","Nadia","Tahmina","Kseniia","Nabil","Asif","Sima"};
		
		for(int i=0;i<studentName.length;i++) {
			System.out.println(studentName[i]);		
			
		}
		
		
		
	}
	public static void studentNumbers() {
		
		int[]studentNumbers = {11,12,13,14,15,16,17};
		for(int i=1;i<studentNumbers.length;i++) {
			System.out.println(studentNumbers[i]);
		}
		
	}
	
	public static void main(String[] args) {
		printStudentsName();
		studentNumbers();
		
		
	}

}

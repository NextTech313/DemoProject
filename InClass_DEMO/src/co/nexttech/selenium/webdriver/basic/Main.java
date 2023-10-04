package co.nexttech.selenium.webdriver.basic;

public class Main {

	public static void main(String[] args) {
		
		EncapsulationDemo e = new EncapsulationDemo();
		e.setEncapsulationDemo("Emon");
		
		//System.out.println(e.name);
		
		/*So basically what we just did is - we created a EncapsulationDemo object as 'e', now 'e' know everything that 
		  is in the EncapsulationDemo class. So when we enter e.setEncapsulationDemo - it knows that there is a method 
		  calls setEncapsulationDemo which requires you to set a name. So above we set a name "Emon" and then we just 
		  print that name*/
		
		Demo d = new Demo();
		//d.addTwoNum(0, 0);
	}

}

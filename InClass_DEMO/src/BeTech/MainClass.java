package BeTech;

import co.nexttech.selenium.webdriver.basic.Car;

public class MainClass{

	public static void main(String[] args) {
		
		CarClass d = new CarClass();
		
		//TeslaClass t = new TeslaClass();
		//t.speedOfACar();
		
		CarClass c = new CarClass();
		c.speedOfACar(300);
	}

}

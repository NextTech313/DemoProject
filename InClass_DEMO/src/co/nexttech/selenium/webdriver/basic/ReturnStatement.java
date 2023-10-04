
package co.nexttech.selenium.webdriver.basic;



public class ReturnStatement {

	/*In Java method we have RETURN types that dictates what the method is going to do after the execution. 
	  If we have VOID as a return type - That means the method is garbage after the execution. However, if we 
	  add a RETURN statement AKA data type that method will return - then that method could be reused even 
	  after the execution.*/
	/*When you return a method - the last line of the body would be the return statement and the value of that 
	  method will dictate the return type. If the value is number related then the return type would be int.
	  When you are creating the return method - you are not performing the action. You will perform the action 
	  when you call the method.*/
	
	public static int addNum(int a, int b) {
		
		return a+b;
	}
	
	
	
	public static void main(String[] args) {
		int sum = addNum(3,5)+9;
		System.out.println(sum);

	}

}

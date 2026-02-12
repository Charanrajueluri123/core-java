package daily_practice;

public class TestStatic {
	
	static {
		System.out.println("static block called");
	}
	
	static TestStatic t=new TestStatic();

	void main(String[] args) {
		System.out.println("Main Method Working.");
	}
	
	{
		System.out.println("instacnce blokc called");
	}
	
//	public TestStatic(int a) {
//		System.out.println("construted called"+ a);
//	}
	
	/* order is first static blocks executed wtever theri if we instance the object then
	 * only instance block executed
	 * static variable
	 * static block
	 * main method
	 *  if we static block is first declared then varibale declared order is
	 *  static block
	 *  static variable 
	 *  main method
	 *  
	 *  instance block only called when the object is intialised unless it is not called
	 *  in java 25 jvm creates object but before static varibale are assigned so order
	 * static block
	 * instance block
	 * main method
	 */
	
}

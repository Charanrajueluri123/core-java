package upgraded1;

public class Methods {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		firstMethod(a,b);
		
	}
	static void firstMethod(int a,int b) {
		System.out.println("first Method called"+(a+b));
		secondMethod(a,(a+b));
	}
	static void secondMethod(int a, int b) {
		System.out.println("Second Method called"+(a+b));
		Methods m=new Methods();
		m.thirdMethod(b,(a+b));
	}
	 void thirdMethod(int a,int b) {
		System.out.println("Third Method called"+(a+b));
		fourthMethod(b,(a+b));
	}
	void fourthMethod(int a,int b) {
		System.out.println("first Method called"+(a+b));
	}
}

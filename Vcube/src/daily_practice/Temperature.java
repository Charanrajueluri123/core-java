package daily_practice;

public class Temperature {
	public static void main(String[] args) {
		double cel=30;
		double f= ((cel*9/5)+32);
		System.out.printf("Fahren heit: %.2f\n",f);
//		System.out.println(cel);
		Temperature t=new Temperature();
		t.test(cel);
		test1(cel);
		
	}
	void test(double cel) {
		double f= ((cel*9/5)+32);
		System.out.printf("Fahren heit: %.2f\n",f);
	}
	static void test1(double cel) {
		double f= ((cel*9/5)+32);
		System.out.printf("Fahren heit: %.2f\n",f);
	}
}

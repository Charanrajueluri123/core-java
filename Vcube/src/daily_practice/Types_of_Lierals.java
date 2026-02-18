package daily_practice;

public class Types_of_Lierals {
	/*
	 * we have 5 types of literals 1.integral literal 2.floating point literals
	 * 3.character literals 4.string literals 5.null lieteral
	 */
	public static void main(String[] args) {
//		1.Integral literals
		System.out.println("Integral literals...");
//		a.binary literals these are starts with 0b which is having base 2
		System.out.println("Binary literals...");
		int b=0b1011;
		int b1=0b10001;
		System.out.println(b);
		System.out.println(b1);
		
//		b.decimal lireals these range is 0 to 9 base is 10
		System.out.println("Decimal literals...");
		int d=23456;
		int d1=425;
		System.out.println(d);
		System.out.println(d1);
		
//		3.octal literals these range is 0 to 7 base is 8. start with 0.
		System.out.println("Octal literals...");
		int o= 0123;
		int o1= 0321;
		//int o2= 0329; // The literal 0329 of type int is out of range 
		System.out.println(o);
		System.out.println(o1);
		
//		4.hexa decimal thes range is 0 to 9 and a to f starts with 0x or 0X
		System.out.println("hexa decimal literals...");
		int h=0x123;
		int h1=0X321F;
		
		System.out.println(h);
		System.out.println(h1);
		
//		2.floating point literals
		/*
		 * System.out.println("floating point literals..."); float f=100; //float
		 * f1=100.0; it gives error because of right hand side is storing the double
		 * value float f2=100.0f; float f3=0123; // this is octal it is stoered in int
		 * so stored in float float f6=0123.5f; // float f7=0123.5; error because rhs
		 * having double can not store float value float f4=0b1011; float f5=0x456;
		 * //float f6=0x456.5f; because at end f means that is float but hexa aslo
		 * hacing f so // confused. invalid hex literal error ginvig float f8=0x456f;
		 * System.out.println(f); System.out.println(f2); System.out.println(f3);
		 * System.out.println(f4); System.out.println(f5); System.out.println(f6);
		 * System.out.println(f8);
		 */
		
		
		double f=100;
		//float f1=100.0;  it gives error because of right hand side is storing the double value 
		double f2=100.0f;
		double f3=0123; // this is octal it is stoered in int so stored in float
		double f6=0123.5f;
		double f7=0123.5;  
		double f4=0b1011;
		double f5=0x456;
		//double f6=0x456.5f;  because at end f means that is float but hexa aslo hacing f so 
//		confused. invalid hex literal error ginvig
		double f8=0x456f;
		
//		3.Character literals
		System.out.println("Character literals...");
		char c='A';

		char c1='a';
		char c2= '6';
		char c3= 65;
		char c4= 90;
		char c5= 97;
		char c6= 122;
		char c7= (int) 'A';
		char c8= (int)  'B';
		int x='a';
		char c9 = 'A'+'B';
		int c10 = 'A'+'B';
		
		
		System.out.println(c);
		System.out.println((int)c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c7);
		System.out.println((int)c8);
		System.out.println(c1+c);
		System.out.println("hi"+c9);
		System.out.println(c10);
		
		
	}
}

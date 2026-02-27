package upgraded1;
import java.util.*;
public class StringReadingProblem {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=s.nextInt();
		System.out.println("Enter a String");
//		s.nextLine();
		String str=s.nextLine();
		int b=s.nextInt();
		System.out.println("Enter 2nd number");
		System.out.println(a+str+b);
		
	}
}

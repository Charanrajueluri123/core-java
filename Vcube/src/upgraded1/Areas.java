package upgraded1;
import java.util.*;
public class Areas {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
//		Area of triangle
		System.out.println("Enter base and height of triange:");
		double d=areaOfTri(s.nextDouble(),s.nextDouble());
		System.out.printf("Area of Triangle is:%.2f",d);
		System.out.println();
//		area of circle
		System.out.println("Enter radius of the circle:");
		double d1=areaOfCircle(s.nextDouble());
		System.out.printf("Area of Circle: %.2f",d1);
		System.out.println();
		System.out.println("Enter length and breadth of rectangle");
		double d2=areaOfRec(s.nextDouble(),s.nextDouble());
		System.out.printf("Area of Rectangle: %.2f",d2);
		System.out.println();
		System.out.println("Enter the Side of the Square:");
		double d3=areaOfSqa(s.nextDouble());
		System.out.printf("Area of the Square:%.2f",d3);
	}
	
	static double areaOfTri(double b,double h) {
		return 0.5*b*h;
	}
	static double areaOfCircle(double r) {
		return Math.PI*r*r;
	}
	static double areaOfRec(double l,double b) {
		return l*b;
	}
	static double areaOfSqa(double s) {
		return s*s;
	}
}

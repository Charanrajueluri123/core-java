package daily_practice;

import java.util.Scanner;

public class Pencil_Concept {
	
void main(String[] args) {
	
	    System.out.println("Main args method called..");
		Scanner s=new Scanner(System.in);	
		int amount=s.nextInt();
		int myPen=amount/7;
		System.out.println("No.of pencils I am Getting for Amount:"+(myPen));
		System.out.println("Remaning Amount left for my chocolates:"+(amount-(myPen*7)));	
	}

}

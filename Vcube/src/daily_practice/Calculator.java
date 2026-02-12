package daily_practice;

import java.util.*;

public class Calculator {

	static Scanner s = new Scanner(System.in);
	int a;
	int b;

	public static void main(String[] args) {
		System.out.println("Welcome to Calcultor.");
		while (true) {
			System.out.println("Enter u r operation");
			System.out.println("Enter only + - * / for stop enter E");
			char operation = s.next().charAt(0);
			if (operation == 'E')
				break;
			System.out.println("Enter numbers.");
			Calculator c = new Calculator();
			c.a = s.nextInt();
			c.b = s.nextInt();
			switch (operation) {
			case '+':
				System.out.println(c.a + c.b);
				break;
			case '-':
				System.out.println(c.a - c.b);
				break;
			case '*':
				System.out.println(c.a * c.b);
				break;
			case '/':
				System.out.println(c.a / c.b);
				break;
			default:
				System.out.println("Something Went Wrong give Correct information/");
			}
		}

	}
}

package daily_practice;

import java.util.Scanner;

public class BankAutoCOunt {
	static int count=123450;
	String username;
	long phn;
	long balance;
	
	public BankAutoCOunt(String username,long phn,long balance) {
		this.username=username;
		this.phn=phn;
		this.balance=balance;
	}
	
	public String toString() {
		return  "Account No:"+count+" ,User Name: "+username+ " ,Phone No:"+phn+" ,Balance: "+balance;
	}
	

	public static void main(String[] args) {
//		BankAutoCOunt b1=new BankAutoCOunt("charan",466888888,100000);
//		b1.count= ++count;
//		System.out.println(b1);
//		BankAutoCOunt b2=new BankAutoCOunt("charan",466888888,100000);
//		b2.count= ++count;
//		System.out.println(b2);
		
		Scanner s=new Scanner(System.in);
		BankAutoCOunt b[]=new BankAutoCOunt[5];
		for(int i=0;i<5;i++) {
			b[i]=new BankAutoCOunt(s.next(),s.nextLong(),s.nextLong());
			b[i].count= ++count;
			System.out.println(b[i]);
		}
		
	}
}

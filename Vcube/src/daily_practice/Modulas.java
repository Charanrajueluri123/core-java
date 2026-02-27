package daily_practice;

public class Modulas {
	public static void main(String[] args) {
		int a=6888,c=0;
		if(a>2000) {
			c=a/2000;
			a=a-(c*2000);
			System.out.println("2000 notes are:"+(c));
			c=0;
		}
		else {
			System.out.println("2000 notes are:"+(c));
			c=0;
		}
		if(a>500) {
			c=a/500;
			a=a-(c*500);
			System.out.println("500 notes are:"+(c));
			c=0;
		}
		else {
			System.out.println("500 notes are:"+(c));
			c=0;
		}
		
		if(a>200) {
			c=a/200;
			a=a-(c*200);
			System.out.println("200 notes are:"+(c));
			c=0;
		}
		else {
			System.out.println("200 notes are:"+(c));
			c=0;
		}
		
		if(a>100) {
			c=a/100;
			a=a-(c*100);
			System.out.println("100 notes are:"+(c));
			c=0;
		}
		else {
			System.out.println("100 notes are:"+(c));
			c=0;
		}
		
		if(a>50) {
			c=a/50;
			a=a-(c*50);
			System.out.println("50 notes are:"+(c));
			c=0;
		}
		else {
			System.out.println("50 notes are:"+(c));
			c=0;
		}
		
		if(a>20) {
			c=a/20;
			a=a-(c*20);
			System.out.println("20 notes are:"+(c));
			c=0;
		}
		else {
			System.out.println("20 notes are:"+(c));
			c=0;
		}
		
		if(a>10) {
			c=a/10;
			a=a-(c*10);
			System.out.println("10 notes are:"+(c));
			c=0;
		}
		else {
			System.out.println("10 notes are:"+(c));
			c=0;
		}
		
		if(a>5) {
			c=a/5;
			a=a-(c*5);
			System.out.println("5 notes are:"+(c));
			c=0;
		}
		else {
			System.out.println("5 notes are:"+(c));
			c=0;
		}
		
		if(a>2) {
			c=a/2;
			a=a-(c*2);
			System.out.println("2 notes are:"+(c));
			c=0;
		}
		else {
			System.out.println("2 notes are:"+(c));
			c=0;
		}
		if(a>=1) {
			c=a/1;
			a=a-(c*1);
			System.out.println("1 notes are:"+(c));
			c=0;
		}
		else {
			System.out.println("1 notes are:"+(c));
			c=0;
		}
	}
}

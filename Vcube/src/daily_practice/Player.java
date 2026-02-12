package daily_practice;

public class Player {
	
	static String board;
	String playerName;
	int jersyNo;
	int age;
	int highestScore;
	public static void main(String[] args) {
		int n=1;
		board="BCCI";
		System.out.println("The Most awaited Indian Cricket Team Annouced By BCCI.");
		System.out.println("Player No:"+n);
		
		
		Player p10=new Player();
		p10.playerName="Abhishek Sharma";
		p10.jersyNo=8;
		p10.age=27;
		p10.highestScore=100;
		print(p10);
		System.out.println();
		
		
		System.out.println("Player No:"+(++n));
		Player p=new Player();
		p.playerName="Virat.";
		p.jersyNo=18;
		p.age=36;
		p.highestScore=200;
		print(p);
		System.out.println();
		
		System.out.println("Player No:"+(++n));
		Player p1=new Player();
		p.playerName="Rohit Sharma.";
		p.jersyNo=24;
		p.age=36;
		p.highestScore=150;
		print(p);
		System.out.println();
		
		System.out.println("Player No:"+(++n));
		Player p2=new Player();
		p.playerName="Hardik Pandya.";
		p.jersyNo=52;
		p.age=30;
		p.highestScore=120;
		print(p);
		System.out.println();
		
		System.out.println("Player No:"+(++n));
		Player p3=new Player();
		p.playerName="Surya Kumar Yadav.";
		p.jersyNo=20;
		p.age=33;
		p.highestScore=110;
		print(p);
		System.out.println();
		
		System.out.println("Player No:"+(++n));
		Player p4=new Player();
		p.playerName="Tilak Varma.";
		p.jersyNo=29;
		p.age=27;
		p.highestScore=100;
		print(p);
		System.out.println();
		
		System.out.println("Player No:"+(++n));
		Player p5=new Player();
		p.playerName="Shubman Gill.";
		p.jersyNo=8;
		p.age=27;
		p.highestScore=170;
		print(p);
		System.out.println();
		
		System.out.println("Player No:"+(++n));
		Player p6=new Player();
		p.playerName="Abhishek Sharma.";
		p.jersyNo=8;
		p.age=27;
		p.highestScore=100;
		print(p);
		System.out.println();
		
		System.out.println("Player No:"+(++n));
		Player p7=new Player();
		p.playerName="Abhishek Sharma.";
		p.jersyNo=8;
		p.age=27;
		p.highestScore=100;
		print(p);
		System.out.println();
		
		System.out.println("Player No:"+(++n));
		Player p8=new Player();
		p.playerName="Abhishek Sharma.";
		p.jersyNo=8;
		p.age=27;
		p.highestScore=100;
		print(p);
		System.out.println();
		
		System.out.println("Player No:"+(++n));
		Player p9=new Player();
		p.playerName="Abhishek Sharma.";
		p.jersyNo=8;
		p.age=27;
		p.highestScore=100;
		print(p);
		System.out.println();
		
		System.out.println("Player No:"+(++n));
		Player p11=new Player();
		p.playerName="Abhishek Sharma.";
		p.jersyNo=8;
		p.age=27;
		p.highestScore=100;
		print(p);
		System.out.println();	
	}
	static void print(Player p10) {
		System.out.println("Player Name: "+p10.playerName+" "+"\nJersey No: "+p10.jersyNo+" "+"\nAge: "+p10.age+" "+"\nBoard: "+board);
	}
}

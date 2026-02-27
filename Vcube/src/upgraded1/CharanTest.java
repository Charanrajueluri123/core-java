package upgraded1;

public class CharanTest {
	public static void main(String[] args) {
//		CharanTest1 c=new CharanTest1();
//		c.main(args);
		System.out.println("main method started..");
		args= new String[1];
		args[0]=Thread.currentThread().getName();
		CharanTest1.main(args);
		System.out.println();
		System.out.println("main method ended..");
	}
}

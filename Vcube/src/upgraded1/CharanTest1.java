package upgraded1;

public class CharanTest1 {
	public static void main(String[] args) {
		String s=Thread.currentThread().getName();
		if(args[0] == s)
			System.out.println("true");
		System.out.println(s);
		System.out.println("hello charantest1");
	}
}
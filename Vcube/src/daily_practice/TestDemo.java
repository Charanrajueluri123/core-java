package daily_practice;

public class TestDemo {
	public static void main(String[] args) throws ClassNotFoundException{
		Class.forName("com.mysql.cj.jdbc.Driver");  // ✅ correct
		System.out.println("Successfully loaded");
	}
}

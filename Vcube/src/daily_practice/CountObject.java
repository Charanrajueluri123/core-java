package daily_practice;

public class CountObject {
	static int a=0;
	{
		a++;
	}
//	void main(int names) {
//		System.out.println(names);
//	}
	public static void main(String[] args) {
		CountObject countObject1=new CountObject();
		CountObject countObject2=new CountObject();
//		countObject1.main(1);
		System.out.println(a);
	}
}

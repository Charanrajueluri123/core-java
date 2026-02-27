package daily_practice;

public class Middle {
	public static void main(String[] args) {
		String s1=new String("Java");
		String s2=s1;
		
		System.out.println(s2);
		System.out.println(s1.intern());
		System.gc();
		
//		int num=7865345;
//		int r=num%10000;
//		System.out.println(r);
//		int res=r/1000;
//		System.out.println(res);
		
	}

//	@Override
//	protected void finalize() throws Throwable {
//		// TODO Auto-generated method stub
//		System.out.println("Finalized called..");
//	}
}

package daily_practice;

public class GarbageCollector {

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Finalized called..");
	}

	public static void main(String[] args) {

		System.out.println("Main Method Started...");
//		1.nullifying objects
//		@5acf9800
//		GarbageCollector g = new GarbageCollector();
//		System.out.println(g);
//		g=null;
//		2.reassigning objects
//		@4617c264
//		GarbageCollector g1 = new GarbageCollector();
//		System.out.println(g1);
//		g1 = g;
//		@5acf9800
//		System.out.println(g1);
//		System.out.println(g);
		
//		3.inside methods objects are cleread because they use stack clearing stack menas cleraing obj
//		test();
//		@5acf9800
		GarbageCollector g2 = new GarbageCollector();
//		@4617c264
		GarbageCollector g3 = new GarbageCollector();
//		@36baf30c
		GarbageCollector g4 = new GarbageCollector();
		System.out.println(g2);
		System.out.println(g3);
		System.out.println(g4);
		g2=null;
		System.out.println(g2);
		System.out.println(g3);
		System.out.println(g4);
		
		System.gc();
	}
	
	static void test() {
		GarbageCollector g= new GarbageCollector();
		System.out.println();
	}
}

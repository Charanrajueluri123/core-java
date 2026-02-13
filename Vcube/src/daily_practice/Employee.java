package daily_practice;

public class Employee {
	int eid;
	String ename;
	double salary;
	public static void main(String[] args) {
		Employee e=new Employee();
		e.eid=1;
		e.ename="charan";
		e.salary=150000;
		e.bonus();
		
		
	}
	void bonus() {
		float sal=(float) ((salary)+(salary*(1/5.0)));
		System.out.println("salary after bonus "+sal);
	}
}

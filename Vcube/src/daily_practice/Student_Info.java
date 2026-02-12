package daily_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student_Info {
	String s_name;
	static int s_id;
	int age;
	float maths;
	float biology;
	char gender;
	
	public Student_Info(String s_name, int age, float maths, float biology,char gender) {
		this.s_name = s_name;
		this.age = age;
		this.maths = maths;
		this.biology = biology;
		this.gender=gender;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		List<Student_Info> l = new ArrayList<>();
		l.add(new Student_Info(s.next(),s.nextInt(),s.nextFloat(),s.nextFloat(),s.next().charAt(0)));
		l.add(new Student_Info(s.next(),s.nextInt(),s.nextFloat(),s.nextFloat(),s.next().charAt(0)));
		display(l);
	}

	private static void display(List<Student_Info> l) {
		for(Student_Info l1:l) {
			System.out.println(l1);
			System.out.println("Sum of the total subject marks: "+(l1.maths+l1.biology));
			System.out.println("Avg of the total subject marks: "+((l1.maths+l1.biology)/2));
		}
		
	}

	@Override
	public String toString() {
		return "\nStudent_Info\ns_name=" + s_name + "\nage=" + age +"\nGender: "+gender+"\nmaths=" + maths + "\nbiology=" + biology;
	}
}

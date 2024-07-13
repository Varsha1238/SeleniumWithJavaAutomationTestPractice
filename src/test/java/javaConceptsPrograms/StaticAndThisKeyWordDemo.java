package javaConceptsPrograms;

public class StaticAndThisKeyWordDemo {
	int rollno; // instance variables
	String name;
	float fee;
	static String college; // static variable or class variable
	static int i;

	static {
		college = "MIT"; // static block is used to initialize static variables
		i = 0;
	}

	 StaticAndThisKeyWordDemo(int rollno, String name, float fee) {
		this.rollno = rollno;
		this.name = name; // local variables
		this.fee = fee;
		i++;
		System.out.println(i);
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee + " " + college);
	}

	static void getdata() {
		System.out.println(college); // static or class methods
	}

	public static void main(String[] args) {
		StaticAndThisKeyWordDemo td = new StaticAndThisKeyWordDemo(1234, "varsha", 15000f);
		StaticAndThisKeyWordDemo td1 = new StaticAndThisKeyWordDemo(12345, "advait", 15000f);
		td.display();
		td1.display();
		StaticAndThisKeyWordDemo.college = "Modern";
		td.display();
		td1.display();
		StaticAndThisKeyWordDemo.getdata();
	}
}

package javaConceptsPrograms;

public class StaticDemo {
	
	static int a =0;  //class variable or static variable 	
	StaticDemo()
	{
		a++;
		System.out.println(a);
	
	}
	
	public static void demo()
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo s =new StaticDemo();
		StaticDemo s1 =new StaticDemo();
		StaticDemo s2 =new StaticDemo();
		//demo();
	
		

	}
}



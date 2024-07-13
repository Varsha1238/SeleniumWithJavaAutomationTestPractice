package javaConceptsPrograms;

public class ConstructorDemo {
    
	ConstructorDemo()
	{
		System.out.println("Default Constructor");
	}
	
	ConstructorDemo(int a,int b)
	{
		System.out.println("Parameter Constructor "+(a+b));

	}
	ConstructorDemo(String str)
	{   
		System.out.println(str);
	}
	public static void main(String[] args) 	
	{
		// TODO Auto-generated method stub
		ConstructorDemo cd = new ConstructorDemo();
		ConstructorDemo cd1 = new ConstructorDemo(10,20);
		ConstructorDemo cd2 = new ConstructorDemo("hello");
	}
}

package javaConceptsPrograms;

public class MultipleMainMethodsDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub	
		System.out.println("JVM start point");
		MultipleMainMethodsDemo.main(10);
		MultipleMainMethodsDemo.main(500f);	
	}
	
	public static void main(int a)
	{		
		System.out.println(a);
	    

	}
	
	public static void main(float a)
	{
		System.out.println(a);	

	}
	

}

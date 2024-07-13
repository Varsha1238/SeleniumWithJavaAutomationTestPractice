package javaConceptsPrograms;

public abstract class BankAbstractClass {

	public abstract int getRateOfInterest();
	
	
	static
	{
		int a=10;
		System.out.println("Static block" +a);
	}
	public static void show()
	{
		System.out.println("Abstract class");
	}
	
}

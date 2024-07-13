package javaConceptsPrograms;

public class AddGlobalAndLocal {

	int a =10; //global variable /instance variable 
	
	void sum() 
	{
		int a=30; //local variable 
	    System.out.println("Addition of numbers " + (a + this.a));
	}
		
	public static void main(String[] args) 
	{
		AddGlobalAndLocal ad =new AddGlobalAndLocal();
		ad.sum();
		System.out.println(ad.a);

	}
}

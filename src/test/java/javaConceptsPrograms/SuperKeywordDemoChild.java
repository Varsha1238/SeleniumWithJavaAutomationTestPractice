package javaConceptsPrograms;

public class SuperKeywordDemoChild extends SuperKeywordDemoParent {

	String name = "VarshaChildClass";

	public void display() 
	{
		System.out.println("This method is from child class");

	}
	public SuperKeywordDemoChild()
	{   super();
		System.out.println("This is child class Constructor");
	}
	public void showSuperKeywordUsage() 
	{
		display();
		super.display();
		System.out.println(name);
		System.out.println(super.name);

	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		SuperKeywordDemoChild sk = new SuperKeywordDemoChild();
		sk.showSuperKeywordUsage();

	}

}

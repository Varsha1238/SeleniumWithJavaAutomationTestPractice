package javaConceptsPrograms;

public class SuperKeywordDemoParent {

	String name ="VarshaParentClass";// Data member same in child class

	public void display() // Method same in child class
	{
		System.out.println("This method is from parent class");
	}

	public SuperKeywordDemoParent() // Parent class constructor
	{
		System.out.println("This is parent class Constructor");
	}

}

package javaConceptsPrograms;

public class MethodOverridingDemo extends InheritanceDemo1 {

	int a = 200;	

	public void show() // same method is present in parent class as well
	{
		System.out.println("Method overriding - child class method -show");
		System.out.println(this.a);
		System.out.println(super.a);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InheritanceDemo1 in = new MethodOverridingDemo(); //UpCasting
		//MethodOverridingDemo in = new MethodOverridingDemo(); //UpCasting
		System.out.println(in.a);// Runtime polymorphism can't be achieved by data members.
		in.show();
		

		

	}

}

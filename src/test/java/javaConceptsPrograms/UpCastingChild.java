package javaConceptsPrograms;

public class UpCastingChild extends UpCastingParent{
   
	int a =200;
	public void display()
	{
		System.out.println("Child class method");
	}
	public static void main(String[] args) 
	{
		UpCastingParent up = new UpCastingChild(); //UpCasting
		up.display();
		up.show();
		System.out.println(up.a);
		
		UpCastingChild ch = (UpCastingChild) up;   //DownCasting 
		ch.display();
		ch.show();
		System.out.println(ch.a);

	}

}

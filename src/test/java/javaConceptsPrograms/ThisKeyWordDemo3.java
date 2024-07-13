package javaConceptsPrograms;

public class ThisKeyWordDemo3 {


	public ThisKeyWordDemo3 show()
	{
		return this;
	}
	public void display()
	{
		System.out.println("return current class instance");
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 new ThisKeyWordDemo3().show().display();
		
	}

}

package javaConceptsPrograms;

public class ThisKeyWordDemo2 {

	
	public void show(ThisKeyWordDemo2 obj)
	{
		System.out.println("method is invoked");
	}
	 public void display()	 
	 {
		 show(this);
	 }
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ThisKeyWordDemo2 demo = new ThisKeyWordDemo2();
		demo.display();
	}

}

package javaConceptsPrograms;

public class MethodOverloading {

	public int add(int a,int b)
	{
		return a+b;
		
	}
	
	public float add(int a,int b,float d)
	{
		return a+b+d;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading m =new MethodOverloading();
		System.out.println(m.add(10, 23, 10.5f));
		System.out.println(m.add(10, 20));
		

	}

}

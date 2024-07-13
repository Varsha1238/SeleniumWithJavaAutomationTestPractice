package javaConceptsPrograms;

public class ExceptionHandling2 {

	public static void main(String[] args) {

		try {

//			String str = null;
//			System.out.println(str.length());
			System.out.println(10/0);
		} 
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		finally {
			//System.exit(0);
			System.out.println("finally block is always executed");
		}
		System.out.println("next code exuted");
	}

}

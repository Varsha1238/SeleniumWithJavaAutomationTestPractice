package allJavaPrograms;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fact=1,num=6;
		
		for(int i=1;i<=num;i++)
		{
			fact =fact*i;
		}
		
		System.out.println("Factorial of number " + fact);
	}

}

package allJavaPrograms;

import java.util.Scanner;

public class CheckGivenNumberIsPrime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		int number = sc.nextInt();
		
		if(number==0 | number ==1 )
		{
			System.out.println("Invalid number");
		}
		else
		{
		int count =0 ;
		for(int i=2;i<=number/2;i++)
		{
			if(number%i==0)
			{
				count++;
				break;
			}
		}
		
		
		if(count==0)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");

	}
	}

}

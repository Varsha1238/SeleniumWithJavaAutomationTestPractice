package allJavaPrograms;

import java.util.Scanner;

public class CheckGivenNumberIsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		
		int count =0;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		
		if(count==0)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}

	}

}

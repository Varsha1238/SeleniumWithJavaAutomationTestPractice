package allJavaPrograms;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		int temp,fact,sum=0,digit;
		temp=num;
		while(temp>0)
		{
			
			digit = temp%10;
			fact =1;
			for(int i=1;i<=digit;i++)
			{
				fact =fact*i;
			}
			
			sum=sum+fact;
			temp=temp/10;	
		}
		
		System.out.println(sum);
		System.out.println(num);
		
		if(sum==num)
		{
			System.out.println("Number is strong");
		}
		else
		{
			System.out.println("Number is Not strong");
		}
	}

}

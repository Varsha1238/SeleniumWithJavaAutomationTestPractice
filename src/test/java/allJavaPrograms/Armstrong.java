package allJavaPrograms;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		int number = sc.nextInt();
		int digits = 0,sum = 0,temp;
		temp = number;
		while(temp>0)
		{
			temp=temp/10;
			digits++;
		}
		
		temp = number;
		while(temp>0)
		{
			int last = temp%10;
			sum+=Math.pow(last, digits);
			temp=temp/10;
		}
		
		if(sum==number)
		{
			System.out.println("Armstrong Number");
		}
		else

		{
			System.out.println("Not Armstrong Number");
		}
	}

}

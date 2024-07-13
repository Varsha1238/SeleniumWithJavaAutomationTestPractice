package allJavaPrograms;

import java.util.Scanner;

public class ArmstrongNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		
		int temp,digits = 0;
		int last,sum=0;
		temp=num;
		while(temp>0)
		{
			temp=temp/10;
			digits++;
		}
		
		temp=num;
		
		while(temp>0)
		{
			last=temp%10;
			sum+=Math.pow(last, digits);
			temp=temp/10;
			
		}
		
		System.out.println(num);
		System.out.println(sum);
		
		

	}

}

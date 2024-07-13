package allJavaPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temp,rev = 0,digit;
		Scanner sc =new Scanner(System.in);
		int num= sc.nextInt();
		temp=num;
		while(temp>0)
		{
			digit=temp%10;
			rev=rev*10+digit;
			temp=temp/10;
		}
		
		System.out.println("Reverse number "+rev);

	}

}

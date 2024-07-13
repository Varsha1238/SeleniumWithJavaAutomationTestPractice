package allJavaPrograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rev=0,temp,digit;
		
		Scanner sc =new Scanner (System.in);
		int num = sc.nextInt();
		temp=num;
		while(temp>0)
		{
			digit =temp%10;
			rev=rev *10+digit;
			temp=temp/10;
		}
		
		
		if(rev==num)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}

	}

}

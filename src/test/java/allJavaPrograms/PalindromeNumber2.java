package allJavaPrograms;

import java.util.Scanner;

public class PalindromeNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		int number = sc.nextInt();
		int temp,rev=0,digit;
		temp=number;
		while(temp>0)
		{
			digit = temp%10;
			rev =rev*10+digit;
			temp=temp/10;
		}
		
		if(rev==number)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}

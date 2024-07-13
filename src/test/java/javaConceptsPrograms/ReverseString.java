package javaConceptsPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		String str = sc.nextLine(); //madam for palindrome
		String reversestring = "" ;
		
		for (int i = 0; i < str.length(); i++) 
		{
			reversestring = str.charAt(i)+ reversestring;
		}	
		
		System.out.println("Reverse String-->" +reversestring);	
		if(str.equals(reversestring))
	       System.out.println("String is Palindrome");
		else
		 System.out.println("String is not Palindrome");
	
	}

}

package javaConceptsPrograms;

import java.util.HashSet;
import java.util.Set;

public class FindOccuranceOfNumbers2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 6, 2, 11, 5, 6, 7, 11, 5, 2, 6, 2 };

		Set<Integer> al = new HashSet<Integer>();
		
		for (int i = 0; i < arr.length; i++)
		{
			al.add(arr[i]);
		}
	System.out.println(al);
	
	for (int s : al) 
	{
		int count =0 ;
		for (int i = 0; i < arr.length; i++) 
		{
			if (s==arr[i])
			{
				count++;
			}
			
		}
		System.out.println("occurance of "+s+ " is "+count+" times");
	}

	}
}
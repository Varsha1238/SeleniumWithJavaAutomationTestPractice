package javaConceptsPrograms;

import java.util.Arrays;
import java.util.Iterator;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {3000,5,5,61,9,0,12,56,199,21,44,23,890};
		
		for (int i = 0; i < arr.length; i++)
		{
		  for (int j = i+1; j < arr.length; j++) 
		  {
			if (arr[j]<arr[i]) 
			{
			          int temp = arr[i];
			          arr[i]=arr[j];
			          arr[j]=temp;
			}
		  }
		}
		
		
		for (int k = 0; k < arr.length; k++) 
		{
			System.out.print(arr[k]+"\t");
			
		}
		
		System.out.println("min value "+arr[0]);
		System.out.println("max value "+arr[arr.length-1]);
		
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}

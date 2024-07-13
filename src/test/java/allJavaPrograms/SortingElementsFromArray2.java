package allJavaPrograms;

import java.util.Arrays;

public class SortingElementsFromArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10,56,34,11,34,22,10,77};
		int temp;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]>arr[i])
				{
					temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}

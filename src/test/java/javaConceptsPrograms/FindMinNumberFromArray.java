package javaConceptsPrograms;

public class FindMinNumberFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {4,1,100,1,2,8,10,5,102};
		
		int min =arr[0];
		
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]<min)
				min= arr[i];
			{
				
			}
		}
		System.out.println(min);
	}

}

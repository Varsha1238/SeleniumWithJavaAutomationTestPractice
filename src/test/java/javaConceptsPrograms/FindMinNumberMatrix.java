package javaConceptsPrograms;

public class FindMinNumberMatrix
{
public static void main(String[] args) 
{
	int arr[][] = {{3,4,5},{2,10,7},{8,0,7}};
	int min =arr[0][0];
	for (int i = 0; i < 3; i++) 
	{
		for (int j = 0; j < 3; j++) 
			
		{
			if (arr[i][j]<min) 
			{
				min=arr[i][j];
			}
		}
	}	
	System.out.println(min);
}
}

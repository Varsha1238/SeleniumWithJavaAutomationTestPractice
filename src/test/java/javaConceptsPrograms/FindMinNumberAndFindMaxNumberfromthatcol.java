package javaConceptsPrograms;

public class FindMinNumberAndFindMaxNumberfromthatcol
{
public static void main(String[] args) 
{
  /*9 2 7
	5 77 19
	88 677 10*/
	
	int[][] arr = {{9,2,7},{5,77,19},{88,677,10}};
	int min =arr[0][0];
	int colnumber =0;
	for (int i = 0; i < arr.length; i++)
	{
		for (int j = 0; j < arr.length; j++)
		{
			if(arr[i][j]<min)
			{
				min=arr[i][j];
				colnumber =j;
			}
		}
		
	}	
	int max = arr[0][colnumber];
	for (int k= 0; k< arr.length; k++) 
	{
		if(arr[k][colnumber]>max)
		{
			max=arr[k][colnumber];
		}
	}
	System.out.println(min);
	System.out.println(max);
}
}

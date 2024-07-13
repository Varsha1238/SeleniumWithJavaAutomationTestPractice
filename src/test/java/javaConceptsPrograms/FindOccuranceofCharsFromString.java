package javaConceptsPrograms;

public class FindOccuranceofCharsFromString {

	public static void main(String[] args)
	{	
	String str ="Selenium testing";
	
	int c = countChars(str,'i');
	
	System.out.println(c);
	
		
	}
	
	
	public static int countChars(String str ,char c)
	{
	
		int count =0 ;
		for (int i = 0; i <str.length(); i++) 
			
		{		
			if (str.charAt(i)==c) //find occurrence of o letter 
			{
				count++;
			}
		}		
		
		return count;
		
	}
	
}

package javaConceptsPrograms;
public class FindLengthWithoutInbuiltLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		int i = 0;
		for (char c : str.toCharArray()) 
		{
			i++;
		}
		System.out.println("Length of the given string " +i);
	}
}
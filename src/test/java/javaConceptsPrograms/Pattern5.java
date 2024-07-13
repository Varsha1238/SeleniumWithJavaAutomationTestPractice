package javaConceptsPrograms;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=2;
		for (int i = 1; i < 5; i++)
		{
			for (int j =1; j <=i; j++) 
			{
				System.out.print(k);
				System.out.print("\t");
				k=k+2;
			}
			System.out.println(" ");
		}

	}

}

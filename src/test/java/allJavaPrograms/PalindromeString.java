package allJavaPrograms;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="My name is Varsha";   //o/P  -->ahsraV si eman yM
		String strRev="";
		
		for(int i=0;i<str.length();i++)
		{
			strRev =str.charAt(i)+strRev;
		}
		
		System.out.println(strRev);
		
		if(strRev==str)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}

	}

}

package allJavaPrograms;

public class ReverseWordsOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="My name is Varsha";   //o/P  -->yM eman si ahsraV 
		String strRev="",strRev1="";
		
		for(int i=0;i<str.length();i++)
		{
			strRev =str.charAt(i)+strRev;
		}
		
		String [] words = strRev.split("\\s");
		for(String w : words )
		{
			strRev1 = w +" "+ strRev1;
		}
		System.out.println(strRev1);
		

	}

}

package allJavaPrograms;

public class ReverseOrderOFWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="My name is Varsha";   //o/P  -->Varsha is name My  
		String strRev="";
		
		String [] words = str.split("\\s");
		for(String w : words )
		{
			strRev = w +" "+ strRev;
		}
		System.out.println(strRev);
		
			
	}

}

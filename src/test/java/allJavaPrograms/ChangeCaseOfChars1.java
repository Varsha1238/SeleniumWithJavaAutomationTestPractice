package allJavaPrograms;

public class ChangeCaseOfChars1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="My Name is VarsHA";
		
		StringBuffer sb =new StringBuffer(str);
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
			     sb.setCharAt(i, Character.toLowerCase(str.charAt(i)));	
			}
			else
			{
			     sb.setCharAt(i, Character.toUpperCase(str.charAt(i)));	
			}
		}

		System.out.println(sb);
	}

}

package javaConceptsPrograms;

public class StringClassMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "automation testing java";
		
		System.out.println(str.charAt(2)); 
		System.out.println(str.indexOf("te"));//index start from 0
		System.out.println(str.concat(" Test NG"));
		System.out.println(str.substring(12));
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.trim());
		System.out.println(str.replace(" ",""));
		String[] split = str.split("\\s");
		  
		System.out.println(split[0]);
		System.out.println(split[1]);
		System.out.println(split[2]);
		//Count number of words in string
		System.out.println("number of words"+str.split("\\s").length);
		for (String string : split) {
			System.out.println(string);
		}
		
			

	}

}

package javaConceptsPrograms;

public class StringLiteralvsobject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String is prebuilt class in java from java.lang package
		String str1 = "Selenium automation";  //String Literal 
		String str2 ="Selenium automation";  //String Literal 
		String str3 = new String("Selenium automation"); //String object 
	
		System.out.println(str1==str2); //true
		System.out.println(str1==str3); //false
		System.out.println(str1.equals(str3)); //true
		
		// == operator is used for reference/address comparison 
		// equals() method is used for content(value of string) comparison 
	
	}

}

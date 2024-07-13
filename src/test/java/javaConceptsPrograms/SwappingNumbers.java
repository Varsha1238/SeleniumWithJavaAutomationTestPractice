package javaConceptsPrograms;

public class SwappingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a=10;
	int b =20;
	
	int temp = a;
	a=b;
	b=temp;
	
	System.out.println(a);
	System.out.println(b);
	
//Without using temp variables
	
	int x= 40,y =50;
    x=x+y; 
    y=x-y;  
    x=x-y;
    System.out.println(x);
    System.out.println(y);
	}

}

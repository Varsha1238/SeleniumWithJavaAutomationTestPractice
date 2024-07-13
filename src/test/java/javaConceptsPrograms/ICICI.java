package javaConceptsPrograms;

public class ICICI implements Bank{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank ic = new ICICI();
		System.out.println(ic.rateOfInterest());

	}
	@Override
	public float rateOfInterest() {
		// TODO Auto-generated method stub
	return 8.9f;
	
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}

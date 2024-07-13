package javaConceptsPrograms;
public class ICICIAbstract extends BankAbstractClass{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ICICIAbstract b = new ICICIAbstract();
		System.out.println(b.getRateOfInterest());
		show();
	

	}

	@Override
	public int getRateOfInterest() 
	{
		// TODO Auto-generated method stub
		return 10;
	}
	
	

}

package javaConceptsPrograms;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Calendar cl = Calendar.getInstance();
		SimpleDateFormat sdff = new SimpleDateFormat("MM/dd/YYYY hh:mm:ss");	
		System.out.println(sdff.format(cl.getTime()));
		System.out.println(cl.get(Calendar.YEAR));
		System.out.println(cl.get(Calendar.DAY_OF_MONTH));
		System.out.println(cl.get(Calendar.AM_PM));
		System.out.println(cl.get(Calendar.MINUTE));
	}

}

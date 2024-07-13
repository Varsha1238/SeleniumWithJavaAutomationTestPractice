package javaConceptsPrograms;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFunctionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d =new Date();
		System.out.println(d.toString());
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(simpleDateFormat.format(d));
		SimpleDateFormat st = new SimpleDateFormat("MM/dd/yyyy HH:MM:SS");
		System.out.println(st.format(d));
	
	}

}

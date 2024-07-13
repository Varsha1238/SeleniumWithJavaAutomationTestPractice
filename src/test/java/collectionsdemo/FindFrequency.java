package collectionsdemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		String str ="Varshaaa";
		String[] split = str.split("");
		
		List<String> asList = Arrays.asList(split);
		
		for (int i = 0; i < asList.size(); i++) 
		{	
		System.out.println("Frequency of letter "+asList.get(i)+" is "+Collections.frequency(asList, asList.get(i)));
		
		}
		
		
	
	}

}

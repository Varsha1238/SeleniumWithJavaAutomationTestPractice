package allJavaPrograms;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicateCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="Varsha";
		ArrayList<Character> al =new ArrayList<Character>();
		HashSet<Character> hs =new HashSet<Character>();
		for(int i=0;i<str.length();i++)
		{
			if(!al.contains(str.charAt(i)))
			{
				al.add(str.charAt(i));
			}
			else
			{
				hs.add(str.charAt(i));
			}
		}
		
		   System.out.println("Unique chars" + al);
		   System.out.println("Duplicate chars" + hs);
		
		for(Character i : hs)
		{
			for(int j=0;j<al.size();j++)
			{
				if(al.contains(i))
				{
					al.remove(i);
				}
			}
		}
		
		System.out.println(al);
		
		System.out.println("After removing duplicate chars");
		 for(Character i : al)
	     {
	    	 System.out.print(i);
	     }

	}

}

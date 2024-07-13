package allJavaPrograms;

import java.util.ArrayList;
import java.util.HashSet;

public class FindDuplicateFromString {

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
		
		System.out.println(al);
		System.out.println(hs);
		
		for(Character i : al)
		{
			System.out.print(i);
		}
		
		System.out.print("\n");
		for(Character i : hs)
		{
			System.out.print(i);
		}
	}
}

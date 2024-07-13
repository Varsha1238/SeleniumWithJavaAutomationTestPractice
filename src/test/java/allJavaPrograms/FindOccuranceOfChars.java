package allJavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class FindOccuranceOfChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="aaafffdddeee";   //o/p --> a3d3e3f3
		HashMap<Character,Integer> hm =new HashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++)
		{
			if(hm.containsKey(str.charAt(i)))
			{
				hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
			}
			else
			{
				hm.put(str.charAt(i), 1);
			}
		}
		
		System.out.println(hm);
		
		for( Character m : hm.keySet())
		{
			System.out.print(m);
			System.out.print(hm.get(m));
		}

	}

}

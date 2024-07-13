package allJavaPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateFromArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10,20,10,40,2,40,11,30,11};
		ArrayList<Integer> al = new ArrayList<Integer>();
		Set<Integer> st = new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(!(al.contains(arr[i])))
				al.add(arr[i]);
			else
				st.add(arr[i]);
		}
		
		System.out.println(al);
		System.out.println(st);
		
	}

}

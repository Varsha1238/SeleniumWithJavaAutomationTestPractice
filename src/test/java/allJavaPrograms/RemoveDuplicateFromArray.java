package allJavaPrograms;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10,30,10,45,32,10,60,30};
		
		ArrayList<Integer> al =new ArrayList<Integer>();
		HashSet<Integer> hs =new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(!al.contains(arr[i]))
			{
				al.add(arr[i]);
			}
			else
			{
				hs.add(arr[i]);
			}
				
		}
			
     System.out.println("Unique elements" + al);
     System.out.println("Duplicate elements" + hs);
     
     for(Integer i : hs)
     {
    	 for(int j =0;j<al.size();j++)
    	 {
    		 if(al.contains(i))
    		 {
    			al.remove(i);
    		 }
    	 }
     }
     
     System.out.println(al);

	}

}

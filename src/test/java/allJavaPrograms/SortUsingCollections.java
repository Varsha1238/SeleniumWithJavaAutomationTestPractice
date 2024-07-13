package allJavaPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortUsingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> al = Arrays.asList(10,30,10,34,77,1,87,34);
		Collections.sort(al);
		System.out.println(Collections.min(al));
		System.out.println(Collections.max(al));
		
		
	}

}

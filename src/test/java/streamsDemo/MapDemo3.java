package streamsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {

	public static void main(String[] args) {

		List<Integer> numlist = Arrays.asList(3,5,6,7);
		List<Integer> result = new ArrayList<Integer>();
		
		result = numlist.stream().map(n->n*3).collect(Collectors.toList());
		System.out.println(result);
		numlist.stream().map(n->n*3).forEach(n->System.out.println(n));
		numlist.stream().map(n->n*3).forEach(System.out::println);
	
	}

}

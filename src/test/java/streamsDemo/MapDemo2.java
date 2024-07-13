package streamsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo2 {

	public static void main(String[] args) {

	List<String> names = Arrays.asList("Varsha","Advait","John","Geeta") ;	
	
	List<Integer> result = names.stream().map(n->n.length()).collect(Collectors.toList());
	System.out.println(result);
	names.stream().map(n->n.length()).forEach(n->System.out.println(n));
	names.stream().map(n->n.length()).forEach(System.out::println);

	
	}

}

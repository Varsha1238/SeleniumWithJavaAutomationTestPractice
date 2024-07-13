package streamsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {

	List<String> names = Arrays.asList("Varsha","Advait","John","Geeta") ;	
	
	List<String> result = names.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
	System.out.println(result);
	}

}

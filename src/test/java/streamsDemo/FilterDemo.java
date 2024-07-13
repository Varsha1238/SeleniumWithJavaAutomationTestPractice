package streamsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numlist = Arrays.asList(19,20,30,44);
		List<Integer> evenNumbersList = new ArrayList<Integer>();
		
		evenNumbersList = numlist.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evenNumbersList);
		numlist.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		numlist.stream().filter(n->n%2==0).forEach(System.out::println);
		
		
		//------------------------------
		
		List<String> nameList = Arrays.asList("Varsha","John","Manisha","Kiran","Seeta","Adi");
		List<String> nameListLong =new ArrayList<String>();
		nameListLong= nameList.stream().filter(str->str.length()>3 && str.length()<5).collect(Collectors.toList());
		System.out.println(nameListLong);
		nameList.stream().filter(str->str.length()>3 && str.length()<5).forEach(str->System.out.println(str));
		nameList.stream().filter(str->str.length()>3 && str.length()<5).forEach(System.out::println);

		//------------------------------
		List<String> words = Arrays.asList("cup","Laptop",null,"mouse",null,"book");
		List<String> wordsAfterRemoveNull = words.stream().filter(str->str!=null).collect(Collectors.toList());
		System.out.println(wordsAfterRemoveNull);
		
	}

}

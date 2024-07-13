package collectionsdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public void show() {
		System.out.println("Access modifiers show method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al = new ArrayList<>();
		al.add("100");
		al.add("200");
		al.add("500");
		al.add("300");
		al.add("1000");
		System.out.println(al);
		al.remove(1);
		al.remove("1000");
		System.out.println(al);
		al.set(1, "300updated");
		System.out.println(al);
		System.out.println(al.contains("1000"));
		System.out.println(al);
		System.out.println(al.get(1));
		List<String> al1 = new ArrayList<>();
		al1.add("100");
		al1.add("8000");
		al.addAll(al1);
		System.out.println(al);

		Iterator<String> it = al1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
  
	
		}
}
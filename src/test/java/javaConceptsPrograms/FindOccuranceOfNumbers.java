package javaConceptsPrograms;

import java.util.ArrayList;

public class FindOccuranceOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 6, 2, 11, 5, 6, 7, 11, 5, 2, 6, 2 };

		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			int k = 0;
			if (!al.contains(arr[i])) {
				al.add(arr[i]);
				k++;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
					k++;
				}
				}
				System.out.println("occurance of "+arr[i]+ " is "+k+" times");
			}
		}
	}
}

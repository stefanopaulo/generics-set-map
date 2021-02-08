package application;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> myStrs = Arrays.asList("Maria", "Bob", "Alex");
		printList(myStrs);
		
		List<Integer> myInts = Arrays.asList(1, 2, 3);
		printList(myInts);

	}
	
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

}

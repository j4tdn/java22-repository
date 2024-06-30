package view.set;

import java.util.HashSet;
import java.util.Set;

public class Ex01BasiDemo {
	public static void main(String[] args) {
		Set<String> elements = new HashSet<>();
		elements.add("A88");
		elements.add("Z22");
		elements.add("D44");
		elements.add("K77");
		elements.add("C55");
		// elements.add(null);
		
		elements.add("D44");
		
		loop("1. elements", elements);;
	}
	private static void loop(String prefix, Set<String> elements ) {
		System.out.println(prefix + " --> ");	
		for (String element: elements) {
			System.out.println(element + " ");
		}
		System.out.println("\n");
	}

}

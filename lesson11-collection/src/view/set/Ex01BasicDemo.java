package view.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex01BasicDemo {
	
	/*
	 Generic: Parameterized Type
	        : WildCard
	        
	 Collection<E>
	 
	 List<E>   ==> ArrayList, LinkedList
	           ==> contains, remove --> override equals
	           
     Set<E>    ==> HashSet, LinkedHashSet, TreeSet
               ==> add(e), principle of duplication E
                   --> override hashcode, equals of E data type
	 
	 Map<K, V> ==> HashMap, LinkedHashMap, TreeMap
	           ==> put(k, v), principle of duplication entry
	               --> override hashcode, equals of K data type
	 
	 */
	
	public static void main(String[] args) {
		Set<String> elements = new TreeSet<>();
		elements.add("A88");
		elements.add("Z22");
		elements.add("D44");
		elements.add("K77");
		elements.add("C55");
		// elements.add(null);
		
		elements.add("D44");
		
		loop("1. elements", elements);
	}
	
	private static void loop(String prefix, Set<String> elements) {
		System.out.println(prefix + " {");
		for (String element: elements) {
			System.out.println("  --> " + element);
		}
		System.out.println("}");
	}
	
}
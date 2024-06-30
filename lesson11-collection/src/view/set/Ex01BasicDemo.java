package view.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex01BasicDemo {
	
	/*
	  Generic : Parameterized Type
	  		  : WildCard
	  		  
	  Collection<E>
	  
	  List<E> --> ArrayList, LinkedList
	  			--> contains, remove --> override equals
	  
	  Set<E>  --> HashSet, LinkedHashSet, TreeSet
	  		--> Add(e)
	  			
	  Map<K,V> -- > HashMap, LinkedHashMap, TreeMap 
	 */
	public static void main(String[] args) {
		//Set<String> elements = new HashSet<>();
		//Set<String> elements = new LinkedHashSet<>();
		Set<String> elements = new TreeSet<>();
		elements.add("K45");
		elements.add("Las5");
		elements.add("A65");
		elements.add("ER26");
		
		elements.add("AEF6");
		
		
		System.out.println("size = " + elements.size());
		loop("1. elements", elements);
	}
	
	private static void loop(String prefix, Set<String> elements) {
		System.out.println(prefix + " { ");
		for(String element: elements) {
			System.out.println(" --> " +element);
		}
		System.out.println("}");
	}
}

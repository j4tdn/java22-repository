package utils;

import java.util.Collection;

public class PrintUtils {

	private PrintUtils() {
		
	}
	public static<E> void generate(String prefix, Collection<E> data) {
		System.out.println(prefix + " --> {");
		if(data.isEmpty()) { 
			System.out.println(" *** There is no data" );
		}
		else {
		for(var t: data) {
			System.out.println(" + " + t);
			
		}
		System.out.println("}\n");
	} 
		}
}

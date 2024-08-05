package utils;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

public class PrintUtils {
	
	private PrintUtils() {
	}
	
	public static <E> void generate(String prefix, E[] data) {
		generate(prefix, Arrays.asList(data));
	}
	
	public static <K, V> void generate(String prefix, Map<K, V> data) {
		generate(prefix, data.entrySet());
	}
	
	public static <E> void generate(String prefix, Collection<E> data) {
		System.out.println(prefix + " --> {");
		if(data.isEmpty()) {
			System.out.println("   *** There is no data");
		}else {
			for (var t: data) {
				System.out.println("   -> " + t);
			}
		}
		System.out.println("}\n");
	}
}

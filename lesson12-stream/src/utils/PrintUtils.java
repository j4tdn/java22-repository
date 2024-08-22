package utils;

import java.util.Collection;
import java.util.Map;

public class PrintUtils {

	public PrintUtils() {
		// TODO Auto-generated constructor stub
	}
	public static<K,V> void generate(String prefix, Map<K,V> data) {
		generate(prefix, data.entrySet());
	}
	public static<E> void generate(String prefix, Collection<E> list) {
		System.out.println(prefix + "--> {");
		if(list.isEmpty()) {
			System.out.println("There is no data");
		}
		for (var e: list) {
			System.out.println("   + "+ e);
		}
		System.out.println("}");
	}
}
package utils;

import java.util.Collection;

public class PrintUtils {

	public PrintUtils() {
		// TODO Auto-generated constructor stub
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

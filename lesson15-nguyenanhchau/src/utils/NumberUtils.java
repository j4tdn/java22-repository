package utils;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;

public class NumberUtils {

	private NumberUtils() {

	}

	public static BigDecimal bd(double val) {
		return new BigDecimal(String.valueOf(val));
	}
	
	public static <K, V> void printMap(String prefix, Map<K, V> data) {
        System.out.println("\n" + prefix + " -->{");
        for (Map.Entry<K, V> entry : data.entrySet()) {
            System.out.println("   -> Item: " + entry.getKey());
            printCollection((Collection<V>) entry.getValue());
        }
        System.out.println("}");
    }

    public static <T> void printCollection(Collection<T> data) {
        for (T item : data) {
            System.out.println("     " + item);
        }
    }
    public static <K, V> void printMapp(String title, Map<K, V> map) {
        System.out.println(title + ":");
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
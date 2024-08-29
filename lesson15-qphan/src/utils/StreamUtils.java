package utils;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamUtils {
	
	private StreamUtils() {
	}
	
	public static <E, K, V> Map<K, V> toMap(Collection<E> collection, Function<E, K> keyMapper, Function<E, V> valueMapper) {
		return collection.stream().collect(Collectors.toMap(keyMapper, valueMapper));
	}
	
}

package view.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex02StreamSource {

	public static void main(String[] args) {
		// Source: Collection, Array
		//       : Stream.of, Stream.iterate
		
		// Object Type Stream: Stream<E>
		// Primitive Stream  : IntStream, DoubleStream, LongStream

		// Object Type
		var list = List.of(1, 2, 3, 4);
		var set = Set.of(1, 2, 3, 4);
		var map = Map.of(1, "A", 2, "B");
		
		Stream<Integer> s1 = list.stream();
		Stream<Integer> s2 = set.stream();
		Stream<Entry<Integer, String>> s3 = map.entrySet().stream();
		
		// Array: primitive/object array
		int[] pa = {1, 2, 3, 4};
		Integer[] po = {1, 2, 3, 4};
		
		IntStream s4 = Arrays.stream(pa);
		Stream<Integer> s5 = Arrays.stream(po);
		
		Stream<Integer> s6 = Stream.of(1, 2, 3, 4);
		s6.forEach(n -> System.out.print(n + " "));
	}

}

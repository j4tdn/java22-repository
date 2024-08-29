package utils;

import static utils.NumberUtils.bd;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.function.Function;

public class NumberUtils {

	private NumberUtils() {

	}
	
	public static <E> BigDecimal calcAverage(Collection<E> collection, Function<E, BigDecimal> mapper) {
		return bd(collection.stream()
				.map(mapper)
				.filter(NumberUtils::isNonNullAndZero)
				.mapToDouble(BigDecimal::doubleValue)
				.average().getAsDouble());
	}
	
	public static boolean isNonNullAndZero(BigDecimal number) {
		return !isNullOrZero(number);
	}
	
	public static boolean isNullOrZero(BigDecimal number) {
		return number == null || number.compareTo(BigDecimal.ZERO) == 0;
	}

	public static BigDecimal bd(double val) {
		return new BigDecimal(String.valueOf(val));
	}

}
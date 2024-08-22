package utils;

import java.math.BigDecimal;

public class NumberUtils {

	private NumberUtils() {

	}

	public static BigDecimal bd(double val) {
		return new BigDecimal(String.valueOf(val));
	}

	public static BigDecimal bd(String val) {
		return new BigDecimal(val);
	}
}
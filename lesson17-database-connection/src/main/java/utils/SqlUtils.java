package utils;

public class SqlUtils {

	private SqlUtils() {
	}

	public static void close(AutoCloseable... objectsTobeClosed) {
		try {
			for (AutoCloseable object : objectsTobeClosed) {
				if (object != null) {
					object.close();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
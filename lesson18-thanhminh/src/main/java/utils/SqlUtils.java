package utils;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Objects;


public class SqlUtils {
	
	private SqlUtils() {
	}
	
	public static java.sql.Date toSqlDate(LocalDate ldate){
		Objects.requireNonNull("ldate", "ldate should not be null");
		return java.sql.Date.valueOf(ldate);
	}
	
	public static void close(AutoCloseable... objectsTobeClosed) {
		try {
			for (AutoCloseable object: objectsTobeClosed) {
				if (object != null) {
					object.close();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void rollback(Connection connection) {
		if (connection != null) {
			try {
				connection.rollback();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}

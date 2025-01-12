package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection {

	private static Connection connection;

	private DbConnection() {
	}

	public static Connection getConnection() {
		if (connection == null) {
			Properties props = DbProvider.getProperties();
			try {
				connection = DriverManager.getConnection(
						props.getProperty("DB_CONFIG_URL"), 
						props.getProperty("DB_USER"),
						props.getProperty("DB_PASS"));
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return connection;
	}

}
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
						"jdbc:mysql://localhost:3306/LESSON17_VANANH", 
						props.getProperty("DB_USER"),
						props.getProperty("DB_PASS"));
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return connection;
	}

}

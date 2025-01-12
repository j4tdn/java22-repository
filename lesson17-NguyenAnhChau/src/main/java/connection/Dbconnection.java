package connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class Dbconnection {
	private static Connection connection;
	
	private Dbconnection() {
		
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
	
	public static void main (String[] args) {
		System.out.println(Driver.class.getName());
	}
}

package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;
import java.util.Properties;
import java.sql.SQLException;
public class DbConnection {

	private static Connection connection;
	
	public DbConnection() {
		
	}
	
	public static Connection getConnection() {
//		if (connection == null) {
//			try {
//				Class.forName(Driver.class.getName());
//				
//			} catch (ClassNotFoundException e) {
//				e.printStackTrace();
//			}
//		}
//		return connection;
		
			if (connection == null) {
			
			Properties props = DbProvider.getProperties();
			try {
				
				connection = DriverManager.getConnection(
							props.getProperty("DB_CONFIG_URL"),
							props.getProperty("DB_USER"),
							props.getProperty("DB_PASS")
						);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		return connection;
	}
	
	public static void main(String[] args) {
		System.out.println("Mysql Connection: " + DbConnection.getConnection());
	}
	
}

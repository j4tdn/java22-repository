package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	
	private static Connection connection;
	
	private DbConnection() {
		
	}
	
	public static Connection getConnetion() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/lesson17_exam",
					"root",
					"ta0943568819");
		} catch (ClassNotFoundException | SQLException  e) {

			e.printStackTrace();
		}
		return connection;
	}
	public static void main(String[] args) {
		Connection c = getConnetion();
		System.out.println(c);
	}
}

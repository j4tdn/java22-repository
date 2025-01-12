package view;

import connection.DbConnection;

public class view {
	
	public static void main(String[] args) {
		System.out.println("MySqlConnection: "+ DbConnection
				.getConnection());

	}
}

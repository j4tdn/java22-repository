package view;

import Connection.DBConnection;

public class Ex01TestDbConnection {
	
	public static void main(String[] args) {
		
		System.out.println("MySql Connection: " + DBConnection.getConnection1());
		
	}
	
}
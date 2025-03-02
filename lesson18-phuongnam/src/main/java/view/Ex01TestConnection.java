package view;

import org.hibernate.SessionFactory;

import connection.DbConnection;

public class Ex01TestConnection {
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = DbConnection.getSessionFactory();
		
		System.out.println("sessionFactory: " + sessionFactory);
	}
}

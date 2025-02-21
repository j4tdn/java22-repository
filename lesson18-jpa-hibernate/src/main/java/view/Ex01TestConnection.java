package view;

import org.hibernate.SessionFactory;

import connection.DbConnection;

public class Ex01TestConnection {
	
	public static void main(String[] args) {
		SessionFactory sessionFactory = DbConnection.getSessionFactory();
		
		System.out.println("sessionFactory " + sessionFactory);
		
		// Sử dụng openSession khi trong 1 service/method cần nhiều session/thread
		// để thực thi
		System.out.println("s1: " + sessionFactory.openSession());
		System.out.println("\ns2: " + sessionFactory.openSession());
		
		//Hầu hết dùng getCurrentSession
		System.out.println("\ns3: " + sessionFactory.getCurrentSession());
		System.out.println("\n43: " + sessionFactory.getCurrentSession());
	}

}

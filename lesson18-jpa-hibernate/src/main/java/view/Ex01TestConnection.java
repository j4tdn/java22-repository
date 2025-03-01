package view;

import org.hibernate.SessionFactory;

import connection.DbConnection;

public class Ex01TestConnection {
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = DbConnection.getSessionFactory();
		
		System.out.println("SessionFactory: " + sessionFactory);
		
		//Sử dụng openSession khi 1 service/,ethod cần nhiều session/thread thực thi
		System.out.println("\ns1: " + sessionFactory.openSession());
		System.out.println("s2: " + sessionFactory.openSession());
		
		//Hầu hết dùng getCurrentSession 
		System.out.println("\ns3: " + sessionFactory.getCurrentSession());
		System.out.println("s4: " + sessionFactory.getCurrentSession());
	}

}

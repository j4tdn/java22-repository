package connection;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DbConnection {
	
	private static String path = "hibernate.cfg.xml";
	
	private static SessionFactory sessionFactory;
	
	private DbConnection() {		
	}
	
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			Configuration configuration = new Configuration();
			sessionFactory = configuration.configure(path).buildSessionFactory();
		}
		return sessionFactory;
	}

}

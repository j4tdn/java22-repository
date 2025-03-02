package dao;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import persistence.OrderDetail;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import connection.DbConnection;

public class HibernateOrderDetail implements OrderDetailDAO {

	public List<Object[]> getItemsSoldOnDate(LocalDate date) {
	    List<Object[]> result = null;

	    try (Session session = DbConnection.getSessionFactory().openSession()) {
	    	 Query<Object[]> query = session.createQuery(
	    	            "SELECT DISTINCT od.itemDetail.item.id, od.itemDetail.item.name, od.order.orderTime " +
	    	            "FROM OrderDetail od " +
	    	            "WHERE DATE(od.order.orderTime) = :orderDate " +
	    	            "ORDER BY od.order.orderTime DESC, od.itemDetail.item.id ASC", 
	    	            Object[].class
	    	        );
	        
	        query.setParameter("orderDate", Date.valueOf(date));

	        result = query.getResultList();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return result;
	}
}

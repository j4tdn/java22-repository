package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import connection.DbConnection;

public class HibernateStoreItem implements StoreItemDAO{
	public List<Object[]> getInventoryByStore() {
        List<Object[]> result = null;

        try (Session session = DbConnection.getSessionFactory().openSession()) {
            Query<Object[]> query = session.createQuery(
                "SELECT si.store.id, si.store.name, si.item.id, si.item.name, SUM(si.amount) " +
                "FROM StoreItem si " +
                "GROUP BY si.store.id, si.store.name, si.item.id, si.item.name " +
                "ORDER BY si.store.id ASC, SUM(si.amount) DESC",
                Object[].class
            );

            result = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}

package dao;

import java.util.List;

import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import dao.base.GenericDao;
import persistence.Item;
import persistence.dto.ItemDto;

public class HibernateItemDao extends GenericDao implements ItemDao {
	
	
	private static final String Q_GET_ORDER_TIME_DETAILS = ""
	        + "SELECT t01.C01_ITEM_GROUP_ID " + ItemDto.PROP_ID + ",\n"
	        + "       t01.C01_ITEM_NAME " + ItemDto.PROP_NAME + ",\n"
	        + "       TIME(t04.C04_ORDER_TIME) " + ItemDto.PROP_CREATED_TIME + "\n"
	        + "  FROM t01_item t01\n"
	        + "  JOIN t03_item_detail t03 ON t01.C01_ITEM_ID = t03.C03_ITEM_ID\n"
	        + "  JOIN t05_order_detail t05 ON t05.C05_ITEM_DETAIL_ID = t03.C03_ITEM_DETAIL_ID\n"
	        + "  JOIN t04_order t04 ON t04.C04_ORDER_ID = t05.C05_ORDER_ID\n"
	        + " WHERE DATE(t04.C04_ORDER_TIME) = :orderDate\n"
	        + " GROUP BY t01.C01_ITEM_GROUP_ID, t01.C01_ITEM_NAME, TIME(t04.C04_ORDER_TIME)\n"
	        + " ORDER BY TIME(t04.C04_ORDER_TIME) DESC;";

	@Override
	@SuppressWarnings({ "unchecked", "deprecation" })
    public List<ItemDto> getOrderTimeDetails(String orderDate) {
        return openSession().createNativeQuery(Q_GET_ORDER_TIME_DETAILS)
                .setParameter("orderDate", orderDate)  // Truyền tham số ngày vào SQL
                .addScalar(ItemDto.PROP_ID, StandardBasicTypes.INTEGER)
                .addScalar(ItemDto.PROP_NAME, StandardBasicTypes.STRING)
                .addScalar(ItemDto.PROP_CREATED_TIME, StandardBasicTypes.STRING) // Thời gian dưới dạng chuỗi
                .setResultTransformer(Transformers.aliasToBean(ItemDto.class))
                .getResultList();
    }
	public Class<Item> getEntityClass() {
		return Item.class;
	}
	@Override
	public List<Item> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
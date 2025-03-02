package dao;

import java.util.List;

import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import dao.base.GenericDao;
import persistence.Item;
import persistence.dto.ItemDateDto;

public class HibernateItemDao extends GenericDao implements ItemDao{
	
	private static final String Q_GET_ITEM_BY_CREATED_TIME = ""
			+ "SELECT t1.C01_ITEM_ID "+ ItemDateDto.PROP_IT_ID +", \n"
			+ "		  t1.C01_ITEM_NAME " + ItemDateDto.PROP_IT_NAME + ", \n"
			+ "		  TIME(t4.C04_ORDER_TIME) " + ItemDateDto.PROP_OD_CREATED_AT + "\r\n"
			+ "FROM t01_item t1\r\n"
			+ "JOIN T03_ITEM_DETAIL t3\r\n"
			+ "ON t1.C01_ITEM_ID = t3.C03_ITEM_ID\r\n"
			+ "JOIN T05_ORDER_DETAIL t5\r\n"
			+ "ON t3.C03_ITEM_DETAIL_ID = t5.C05_ITEM_DETAIL_ID\r\n"
			+ "JOIN T04_ORDER t4\r\n"
			+ "ON t4.C04_ORDER_ID = t5.C05_ORDER_ID\r\n"
			+ "GROUP BY C01_ITEM_ID";
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<ItemDateDto> getItemsByCreatedTime(String createdTime) {
		return ((NativeQuery) openSession()
				.createNativeQuery(Q_GET_ITEM_BY_CREATED_TIME)
				.addScalar(ItemDateDto.PROP_IT_ID, StandardBasicTypes.STRING)
				.addScalar(ItemDateDto.PROP_IT_NAME, StandardBasicTypes.STRING)
				.addScalar(ItemDateDto.PROP_OD_CREATED_AT, StandardBasicTypes.STRING)
				.setParameter(createdTime, StandardBasicTypes.STRING))
				.setResultTransformer(Transformers.aliasToBean(ItemDateDto.class))
				.getResultList();
	}

}

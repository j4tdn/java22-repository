package dao;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import dao.base.GenericDao;
import persistence.dto.ItemDto;
import persistence.dto.ItemGroupDto;

public class HibernateItemDao extends GenericDao implements ItemDao{

	
	private static final String Q_GET_ITEM_BY_SALES_DATE = ""
	        + "SELECT t1.C01_ITEM_ID AS " + ItemDto.PROP_ID + ", "
	        + "t1.C01_ITEM_NAME AS " + ItemDto.PROP_NAME + ", "
	        + "CAST(t4.C04_ORDER_TIME AS TIME) AS " + ItemDto.PROP_CREATED_AT + " "
	        + "FROM t01_item t1 "
	        + "JOIN t04_order t4 ON t1.C01_ITEM_ID = t4.C04_ORDER_ID "
	        + "WHERE DATE(t4.C04_ORDER_TIME) = :date "
	        + "ORDER BY t4.C04_ORDER_ID DESC, t1.C01_ITEM_ID ASC";

	@Override
	public List<ItemDto> getItemBySalesDate(LocalDate date) {
		return openSession().createNativeQuery(Q_GET_ITEM_BY_SALES_DATE)
				.addScalar(ItemDto.PROP_ID, StandardBasicTypes.INTEGER)
				.addScalar(ItemDto.PROP_NAME, StandardBasicTypes.STRING)
				.addScalar(ItemDto.PROP_CREATED_AT, StandardBasicTypes.STRING)
				.setParameter("date", date, StandardBasicTypes.DATE)
				.setResultTransformer(Transformers.aliasToBean(ItemDto.class)).getResultList();
	}

	@Override
	public List<ItemGroupDto> getItemsOfItemGroup() {
		return null;
	}

}

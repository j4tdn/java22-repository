package dao;

import java.util.List;

import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import dao.base.GenericDao;
import persistence.ItemGroup;
import persistence.dto.ItemGroupDto;

public class HibernateItemGroupDao extends GenericDao implements ItemGroupDao {

	private static final String Q_GET_ITEM_GROUP_DETAILS = ""
			+ "SELECT t2.C02_ITEM_GROUP_ID " + ItemGroupDto.PROP_ID + ",\n"
			+ "       t2.C02_ITEM_GROUP_NAME " + ItemGroupDto.PROP_NAME + ",\n"
			+ "       COUNT(*) " + ItemGroupDto.PROP_AMOUNT_OF_ITEMS + "\n"
			+ "  FROM t01_item t1\n"
			+ "  JOIN t02_item_group t2\n"
			+ "    ON t1.C01_ITEM_GROUP_ID = t2.C02_ITEM_GROUP_ID\n"
			+ " GROUP BY C01_ITEM_GROUP_ID";


	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<ItemGroupDto> statisticItemGroupDetails() {
		return openSession()
				.createNativeQuery(Q_GET_ITEM_GROUP_DETAILS)
				.addScalar(ItemGroupDto.PROP_ID, StandardBasicTypes.INTEGER) // get(PROP_ID), get(id)
				.addScalar(ItemGroupDto.PROP_NAME, StandardBasicTypes.STRING)
				.addScalar(ItemGroupDto.PROP_AMOUNT_OF_ITEMS, StandardBasicTypes.INTEGER)
				.setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class))
				.getResultList();
	}

	private Class<ItemGroup> getEntityClass() {
		return ItemGroup.class;
	}

}

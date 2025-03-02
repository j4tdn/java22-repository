package dao;

import java.util.List;

import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import dao.base.GenericDao;
import persistence.dto.ItemGroupDto;

public class HinernateItemGroupDao extends GenericDao implements ItemGroupDao{
	
	private static final String Q_COUNT_ITEMS_BY_ITEM_GROUP = ""
			+ "SELECT itg.C02_ITEM_GROUP_ID " + ItemGroupDto.PROP_IG_ID + " ,\n"
			+ "	      itg.C02_ITEM_GROUP_NAME " + ItemGroupDto.PROP_IG_NAME + ",\n"
			+ "       sum(itd.C03_AMOUNT) " + ItemGroupDto.PROP_TOTAL_OF_ITEMS + ",\n"
			+ "	      group_concat(concat(it.C01_ITEM_ID, '-', it.C01_ITEM_NAME, '-', itd.C03_SIZE_ID, '-', itd.C03_AMOUNT) SEPARATOR ', ') " + ItemGroupDto.PROP_ITEMS + "\n"
			+ "  FROM T02_ITEM_GROUP itg\n"
			+ "  JOIN T01_ITEM it\n"
			+ "    ON itg.C02_ITEM_GROUP_ID = it.C01_ITEM_GROUP_ID\n"
			+ "  JOIN T03_ITEM_DETAIL itd\n"
			+ "    ON itd.C03_ITEM_ID = it.C01_ITEM_ID\n"
			+ " GROUP BY itg.C02_ITEM_GROUP_ID, itg.C02_ITEM_GROUP_NAME";
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<ItemGroupDto> countItemsByItemGroup() {
		return openSession()
				.createNativeQuery(Q_COUNT_ITEMS_BY_ITEM_GROUP)
				.addScalar(ItemGroupDto.PROP_IG_ID, StandardBasicTypes.STRING) 
				.addScalar(ItemGroupDto.PROP_IG_NAME, StandardBasicTypes.STRING)
				.addScalar(ItemGroupDto.PROP_TOTAL_OF_ITEMS, StandardBasicTypes.STRING)
				.addScalar(ItemGroupDto.PROP_ITEMS, StandardBasicTypes.STRING)
				.setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class)) 
				.getResultList();
		}
	}

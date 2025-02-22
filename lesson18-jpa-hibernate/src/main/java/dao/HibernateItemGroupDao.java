package dao;

import java.util.List;

import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import dao.base.GenericDao;
import persistence.ItemGroup;
import persistence.dto.ItemGroupDto;

public class HibernateItemGroupDao extends GenericDao implements ItemGroupDao{
	
	// native query --> dự án chỉ kết nối đến duy nhất 1 loại csdl
	// hibernate query -> thay vì viết câu truy vấn sử dụng cú pháp của HQT CSDL
	// 				      dùng HQL truy vấn mapping entities, attributes ...
	//				      sử dụng cho bất kỳ HQL CSDL
	
	
	// hạn chế --> phụ thuộc vào HQLParser
	
	// Hoạt động với bất kỳ Table nào
	// createNativeQuery
	
	// Hoạt động với Table có mapping Entity
	// createQuery
	
	// createNamedQuery
	// HQL: @NamedQueries, @NamedQuery
	// Native: @NamedNativeQueries, @NameNativeQuery
	// hoạt động với native, hql
	
	private static final String PARAM_IG_NAME = "igName";
	
	private static final String SQL_PARAM_IG_NAME = ":" + PARAM_IG_NAME;
	
	private static final String Q_GET_ITEM_GROUP_DETAILS = ""
			+ "SELECT t2.C02_ITEM_GROUP_ID " + ItemGroupDto.PROP_ID + ",\n"
			+ "	   t2.C02_ITEM_GROUP_NAME " + ItemGroupDto.PROP_NAME +",\n"
			+ "	   COUNT(*) " + ItemGroupDto.PROP_AMOUNT_OF_ITEMS + ",\n"
			+ "       GROUP_CONCAT(C01_ITEM_NAME SEPARATOR ', ') "+ ItemGroupDto.PROP_DETAILS +"\n"
			+ " FROM t01_item t1\n"
			+ " JOIN t02_item_group t2 ON t1.C01_ITEM_GROUP_ID = t2.C02_ITEM_GROUP_ID\n"
			+ " GROUP BY C01_ITEM_GROUP_ID";
			
	private static final String Q_GET_ITEM_GROUP_BY_NAME = ""
			+ "SELECT *"
			+ " FROM T02_ITEM_GROUP"
			+ " WHERE C02_ITEM_GROUP_NAME = " + SQL_PARAM_IG_NAME;
	
	@Override
	public List<ItemGroup> getAll() {
		return openSession()
				.createNamedQuery(ItemGroup.Q_GET_ALL, getEntityClass())
				.getResultList();
	}
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<ItemGroupDto> statisticItemGroupDetails() {
		// 1 hàng trả về = 1 Object[]
		// N rows
		// 1 rows = Object[]
		// column[o] =Object[0]
		
		// Cách 1
		/*
		List<Object[]> rawList =  openSession()
				.createNamedQuery(Q_GET_ITEM_GROUP_DETAILS)
				.getResultList();
		
		return rawList.stream()
				.map(this::transformToItemGroupDto)
				.toList();
				*/
		
		return openSession()
				.createNativeQuery(Q_GET_ITEM_GROUP_DETAILS)
				.addScalar(ItemGroupDto.PROP_ID, StandardBasicTypes.INTEGER)  // get(PROP_ID), get(id)
				.addScalar(ItemGroupDto.PROP_NAME, StandardBasicTypes.STRING)
				.addScalar(ItemGroupDto.PROP_AMOUNT_OF_ITEMS, StandardBasicTypes.INTEGER)
				.addScalar(ItemGroupDto.PROP_DETAILS, StandardBasicTypes.STRING)
				.setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class))
				.getResultList();
		
	}

	@Override
	public ItemGroup get(Integer id) {
		return openSession().get(getEntityClass(), id);
	}

	@Override
	public ItemGroup get(String name) {
		return openSession()
				.createNativeQuery(Q_GET_ITEM_GROUP_BY_NAME, getEntityClass())
				.setParameter(PARAM_IG_NAME, name, StandardBasicTypes.STRING)
				.uniqueResult(); // getSingleResult
	}
	
	private Class<ItemGroup> getEntityClass(){
		return ItemGroup.class;
	}
	
	public ItemGroupDto transformToItemGroupDto(Object[] object) {
		return new ItemGroupDto(
				Integer.parseInt(String.valueOf(object[0])),
				String.valueOf(object[1]),
				Integer.parseInt(String.valueOf(object[2])),
				String.valueOf(object[3])		
		);
	}
	
}

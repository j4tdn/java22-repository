package dao;

import java.util.List;

import org.hibernate.type.StandardBasicTypes;

import dao.base.GenericDao;
import persistence.ItemGroup;

public class HibernateItemGroupDao extends GenericDao implements ItemGroupDao {

	// native query --> dự án chỉ kết nối đến duy nhất 1 loại csdl
	// hibernate query -> thay vì viết câu truy vấn sử dụng cú pháp của HQT CSDL
	//                    dùng HQL truy vấn các mapping entities, attributes ...
	//                    sử dụng cho bất kỳ HQT CSDL
	
	// hạn chế --> phụ thuộc HQLParser
	
	// Hoạt động với bất kỳ Table nào
	// createNativeQuery
	
	// Hoạt động với Table có mapping Entity
	// createQuery
	
	// createNamedQuery
	// HQL: @NamedQueries, @NamedQuery
	// Native: @NamedNativeQueries, @NamedNativeQuery
	// hoạt động với native, hql
	
	private static final String PARAM_IG_NAME = "igName";
	
	private static final String SQL_PARAM_IG_NAME = ":" + PARAM_IG_NAME;
	
	
	private static final String Q_GET_ITEM_GROUP_BY_NAME = ""
			+ "SELECT *"
			+ "  FROM T02_ITEM_GROUP"
			+ " WHERE C02_ITEM_GROUP_NAME = " + SQL_PARAM_IG_NAME;
	
	@Override
	public List<ItemGroup> getAll() {
		return openSession()
				.createNamedQuery(ItemGroup.Q_GET_ALL, getEntityClass())
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

	private Class<ItemGroup> getEntityClass() {
		return ItemGroup.class;
	}
	
}

package dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.hibernate.HibernateException;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import dao.base.GenericDao;
import persistence.ItemGroup;
import persistence.dto.ItemGroupDto;

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
	
	private static final String PARAM_IG_ID = "igId";
	private static final String PARAM_IG_NAME = "igName";
	
	private static final String SQL_PARAM_IG_ID = ":" + PARAM_IG_ID;
	private static final String SQL_PARAM_IG_NAME = ":" + PARAM_IG_NAME;
	
	private static final String Q_GET_ITEM_GROUP_DETAILS = ""
			+ "SELECT t2.C02_ITEM_GROUP_ID " + ItemGroupDto.PROP_ID + ",\n"
			+ "       t2.C02_ITEM_GROUP_NAME " + ItemGroupDto.PROP_NAME + ",\n"
			+ "       COUNT(*) " + ItemGroupDto.PROP_AMOUNT_OF_ITEMS + ",\n"
			+ "       GROUP_CONCAT(C01_ITEM_NAME SEPARATOR ', ') " + ItemGroupDto.PROP_DETAILS + "\n"
			+ "  FROM t01_item t1\n"
			+ "  JOIN t02_item_group t2\n"
			+ "    ON t1.C01_ITEM_GROUP_ID = t2.C02_ITEM_GROUP_ID\n"
			+ " GROUP BY C01_ITEM_GROUP_ID";
	
	private static final String Q_GET_ITEM_GROUP_BY_NAME = ""
			+ "SELECT *"
			+ "  FROM T02_ITEM_GROUP"
			+ " WHERE C02_ITEM_GROUP_NAME = " + SQL_PARAM_IG_NAME;
	
	private static final String Q_DELETE_ITEM_GROUP_BY_ID = ""
			+ "DELETE FROM T02_ITEM_GROUP WHERE C02_ITEM_GROUP_ID = " + SQL_PARAM_IG_ID;
	
	/*
	 * Với các thao tác liên quan đến cập nhật dữ liệu
	 * THÊM - SỬA - XÓA
	 * ----
	 * Luôn cần transaction
	 * Có 2 cách làm
	 * 1. Dùng các hàm đơn giản có sẵn của Java với Entity
	 * 2. Tự viết truy vấn
	 */
	
	@Override
	public void testHibernateCache() {
		var session1 = openSession();
		var session2 = openSession();
		
		var group1 = session1.get(getEntityClass(), 8); // database
		System.out.printf("group1%s\n\n", group1);
		
		var group2 = session1.get(getEntityClass(), 28); // database
		System.out.printf("group2%s\n\n", group2);
		
		var group3 = session1.get(getEntityClass(), 8); // 1st level cache
		System.out.printf("group3%s\n\n", group3);
		
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		var group4 = session2.get(getEntityClass(), 28); // 2nd level cache, database
		System.out.printf("group4%s\n\n", group4);
	}
	
	@Override
	public void save(ItemGroup group) {
		execute(session -> session.persist(group));
	}
	
	@Override
	public void update(ItemGroup group) {
		execute(session -> session.merge(group));
	}
	
	@Override
	public void delete(Integer groupId) {
		execute(session -> {
			var query = session.createNativeQuery(Q_DELETE_ITEM_GROUP_BY_ID);
			query.setParameter(PARAM_IG_ID, groupId, StandardBasicTypes.INTEGER);
			query.executeUpdate();
		});
		
		/*
		execute(session -> {
			var entity = session.get(getEntityClass(), groupId);
			if (entity != null) {
				session.remove(entity);
			}
		});
		*/
	}
	
	@Override
	public void delete(Set<Integer> groupIds) {
		execute(session -> {
			session.doWork(connection -> {
				var sql = "DELETE FROM T02_ITEM_GROUP WHERE C02_ITEM_GROUP_ID = ?";
				try (var pst = connection.prepareStatement(sql)) {
					int batchCount = 0;
					for (var groupId: groupIds) {
						pst.setInt(1, groupId);
						pst.addBatch();
						if (++batchCount % 1000 == 0) {
							pst.executeBatch();
						}
					}
					pst.executeBatch();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			});
		});
	}
	
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
		// Cách 1
		/*
		List<Object[]> rawList = openSession()
				.createNativeQuery(Q_GET_ITEM_GROUP_DETAILS)
				.getResultList();
		
		return rawList.stream()
				.map(this::transformToItemGroupDto)
				.toList();
		*/
		
		return openSession()
				.createNativeQuery(Q_GET_ITEM_GROUP_DETAILS)
				.addScalar(ItemGroupDto.PROP_ID, StandardBasicTypes.INTEGER) // get(PROP_ID), get(id)
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

	private Class<ItemGroup> getEntityClass() {
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

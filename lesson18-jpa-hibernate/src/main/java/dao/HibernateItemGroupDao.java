package dao;

import java.util.List;

import org.hibernate.type.StandardBasicTypes;

import dao.base.GenericDao;
import persistence.ItemGroup;

public class HibernateItemGroupDao extends GenericDao implements ItemGroupDao {
	
	private static String Q_GET_ALL =""
			+ "FROM ItemGroup";
	
	// native dự án chỉ kết nối với 1 loại cơ sở dữ liệu 
	// có thêr dùng hibernate quẻy -> thay vì dùng cú pháp của hệ cơ sở dữ liệu  
	// dùng hql để truy vấn các mapinmg entities 
	// sử dụng cho bất kì hệ cơ sở dữ liệu nào
	// hạn chế đnag phụ thuộc vào cơ chế hql parser
	
	// hoạt động với bất kì table nào 
	//createnativeQuẻy
	
	// hgoatj đônghjk với table có mapping entity
	// creatQUery
	
	//createNameQuery
	//
	private static final String PARAM_IG_NAME = "igName";
	private static final String Q_GET_ITEM_GROUP_BY_NAME =""
			+"SELECT *"
			+"FROM T02_ITEM_GROUP"
			+"WHERE C02_ITEM_GROUP_NAME = " + PARAM_IG_NAME;
	
	@Override
	public ItemGroup get(String name) {
		return openSession()
				.createNativeQuery(Q_GET_ITEM_GROUP_BY_NAME, ItemGroup.class)
				.setParameter(PARAM_IG_NAME, name,StandardBasicTypes.STRING)
				.uniqueResult(); // getSingleResult
	}
	@Override
	public ItemGroup get(Integer id) {
		// TODO Auto-generated method stub
		return openSession().get(ItemGroup.class, id);
	}
	
	
	@Override
	public List<ItemGroup> getAll() {
		return openSession()
				.createQuery(Q_GET_ALL,ItemGroup.class)
				.getResultList();
	}
	 
	/*
	 * với các thao tác cập nhật dữ liệu sẽ luôn cần transaction 
	 * có 2 cách làm 
	 * 1 dùng các hàm đơn giản có sẵn với java với entity
	 * 2 tự viết truy vấn
	 */
	@Override
	public void delete(ItemGroup group) {
		execute(sesson -> sesson.remove(group));
		
	}
	@Override
	public void save(ItemGroup group) {
		execute(sesson -> sesson.persist(group));
		
	}
	@Override
	public void update(ItemGroup group) {
		execute(sesson -> sesson.merge(group));
		
	}

}

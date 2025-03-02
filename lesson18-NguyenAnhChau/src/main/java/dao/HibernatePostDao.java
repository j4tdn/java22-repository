package dao;

import java.util.List;

import dao.base.GenericDao;
import persistence.Post;

public class HibernatePostDao extends GenericDao implements PostDao {
	
	// KHI THỰC HIỆN THÊM SỬA XÓA
	// getCurrentSession: báo lỗi nếu thiếu
	// openSession: nếu thiếu transaction, nó ko thực thi thay vì báo lỗi
	// --> cả 2 đều yêu cầu transaction
	
	// KHI THỰC HIỆN GET DỮ LIỆU
	// getCurrentSession: yêu cầu transaction
	// openSession: không yêu cầu transaction
	
	@Override
	public void save(Post post) {
		execute(session -> session.persist(post));
	}
	
	@Override
	public List<Post> getAll() {
		return openSession()
				.createQuery("FROM Post", Post.class)
				.getResultList();
	}
	
}
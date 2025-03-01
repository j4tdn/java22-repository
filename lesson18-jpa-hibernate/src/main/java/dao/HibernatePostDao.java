package dao;

import java.util.List;

import dao.base.GenericDao;
import persistence.Post;

public class HibernatePostDao extends GenericDao implements PostDao{
	
	// Khi thực hiện thêm sửa xóa
	// getCurrentSession: báo lỗi nếu thiếu
	// openSession: nếu thiếu transaction, nó ko thực thi thay vì báo lỗi
	// --> cả 2 đều yêu cầu transaction
	
	// Khi thực hiện get dữ liệu
	// getCurrentSession: yêu cầu transaction
	// openSession: không yêu cầu transaction
	
	@Override
	public void save(Post post) {
		//openSession().persist(post);
		execute(session -> session.persist(post));
	}
	
	@Override
	public List<Post> getAll() {
		return openSession().createQuery("FROM Post", Post.class)
				            .getResultList();
	}

}

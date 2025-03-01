package service;

import java.util.List;
import java.util.Objects;

import dao.HibernatePostDao;
import dao.PostDao;
import persistence.Post;

public class PostServiceImpl implements PostService {
	
	private PostDao postDao;
	
	public PostServiceImpl() {
		postDao = new HibernatePostDao();
	}
	
	@Override
	public void save(Post post) {
		Objects.requireNonNull(post, "post should not be null");
		postDao.save(post);		
	}
	
	@Override
	public List<Post> getAll() {
		return postDao.getAll();
	}

}

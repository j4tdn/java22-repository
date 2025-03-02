package service;

import java.util.List;

import persistence.Post;

public interface PostService {

	/**
	 * Save the given post
	 * 
	 * @param post the post
	 */
	void save(Post post);
	
	/**
	 * Get all posts
	 * 
	 * @return list of {@link Post}
	 */
	List<Post> getAll();

}

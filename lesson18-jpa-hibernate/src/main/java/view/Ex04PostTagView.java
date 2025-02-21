package view;

import persistence.Post;
import service.PostService;
import service.PostServiceImpl;

public class Ex04PostTagView {
	
	private static PostService postService;
	
	static {
		postService = new PostServiceImpl();
	}
	
	public static void main(String[] args) {
		/*
		Post post1 = new Post("Post 01");
	 
	    Tag tag1 = new Tag("Tag 01: Java");
	    Tag tag2 = new Tag("Tag 02: Hibernate");
	    Tag tag3 = new Tag("Tag 02: Spring Boot");
	 
	    post1.addTag(tag1);
	    post1.addTag(tag2);
	    post1.addTag(tag3);
	 
	    postService.save(post1);
	    */
		
		/*
		Post post1 = new Post("Post 02");
	    Tag tag1 = new Tag("Tag 01: Java22");
	    post1.addTag(tag1);
	    postService.save(post1);
	    */
	    
	    System.out.println("\nLiệt kê các bài đăng ...");
	    var posts = postService.getAll();
	    for(Post post: posts) {
	    	System.out.println(post + ", tagSize = " + post.getTags().size());
	    }
	}
}

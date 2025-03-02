package view;

import persistence.Post;
import service.PostService;
import service.PostServiceImpl;

public class Ex04PostTagView {
	
	private static PostService postService;
	
	static {
		postService = new PostServiceImpl();
	}
	
	/*
	 Hibernate: insert into T14_POST (C14_POST_TITLE) values (?)
	 Hibernate: insert into T16_TAG (C16_TAG_NAME) values (?)
	 Hibernate: insert into T16_TAG (C16_TAG_NAME) values (?)
	 Hibernate: insert into T15_POST_TAG (C15_POST_ID,C15_TAG_ID) values (?,?)
	 Hibernate: insert into T15_POST_TAG (C15_POST_ID,C15_TAG_ID) values (?,?)
	*/
	
	public static void main(String[] args) {
		/*Post post1 = new Post("Post 02");
	    Tag tag1 = new Tag("Tag 01: Java22");
	    post1.addTag(tag1);
	    postService.save(post1);*/
	    
	    System.out.println("\nLiệt kê các bài đăng ...");
	    var posts = postService.getAll();
	    for (Post post: posts) {
	    	System.out.println(post + ", tagSize = " + post.getTags().size());
	    }
	}
	
}
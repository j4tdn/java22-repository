package view;

import bean.Book;

@FunctionalInterface
public interface Condition {
	
	boolean test(Book book);

}

package p1_strategy;

import p1_strategy_bean.Book;

@FunctionalInterface
public interface Condition {
	
	boolean test(Book book);
	
}

package functional;

import bean.Transaction;

@FunctionalInterface
public interface TransactionStrategy {
	
	boolean test(Transaction transaction);
	
}

package functional;

import bean.Transaction;

@FunctionalInterface
public interface TransactionCon {
	 boolean test (Transaction t);
}
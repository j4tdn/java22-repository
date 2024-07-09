package utils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import bean.Trader;
import bean.Transaction;
import functional.TransactionCon;

public class TransactionUtils {
	
	public TransactionUtils() {
	}
	
	// 1, 2, 6, 7
	public static List<Transaction> getTransactionsAndSort(List<Transaction> transactions,TransactionCon con, Comparator<Transaction> comparator) {
		List<Transaction> result = new ArrayList<>();
		for (var t : transactions) {
			if (con.test(t)) {
				result.add(t);
			}
		}
		result.sort(comparator);
		return result;
	}
	
	//3
	public static Set<String> getUniqueCitis(List<Transaction> transactions) {
		Set<String> result = new HashSet<>();
		for (var transaction : transactions) {
			result.add(transaction.getTrader().getCity());
		}
		return result;
	}
	// 4 
	public static Set<Trader> getTrader(List<Transaction> transactions, TransactionCon con, Comparator<Trader> comparator) {
		Set<Trader> result = new HashSet<>();
		for (var t : transactions) {
			if (con.test(t)) {
				result.add(t.getTrader());
			}
		}
//		result.sort(comparator);
		return result;
	}
	// 5
	public static String getUniqueName(List<Transaction> transactions) {
		Set<String> result = new TreeSet<>();
		for (var transaction : transactions) {
			result.add(transaction.getTrader().getName());
		}
		return String.join(", ", result);
	}
	// 8 9 10
	public static List<Integer> getValueTransaction(List<Transaction> transactions, TransactionCon con, Comparator<Integer> comparator) {
		List<Integer> result = new ArrayList<>();
		for (var t : transactions) {
			if (con.test(t)) {
				result.add(t.getValue());
			}
		}
		result.sort(comparator);
		return result;
	}
	
}

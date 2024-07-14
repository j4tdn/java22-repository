package utils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import bean.Trader;
import bean.Transaction;

public class TransactionUtils {

	private TransactionUtils() {
	}
	
	public static Transaction getTransactionWithSmallestValue(List<Transaction> transactions) {
		Transaction tWithSmallestValue = null;
		for (Transaction transaction: transactions) {
			// gán cho phần tử đầu tiên
			if (tWithSmallestValue == null) {
				tWithSmallestValue = transaction;
				continue;
			}
			
			// kiểm tra điều kiện
			if (transaction.getValue() < tWithSmallestValue.getValue()) {
				tWithSmallestValue = transaction;
			}
		}
		return tWithSmallestValue;
	}
	
	public static int getHighestTransactionValue(List<Transaction> transactions) {
		int highestValue = Integer.MIN_VALUE;
		for (Transaction transaction: transactions) {
			int value = transaction.getValue();
			if (value > highestValue) {
				highestValue = value;
			}
		}
		return highestValue;
	}
	
	public static Set<Integer> getTransactionValuesFrom(List<Transaction> transactions, String city) {
		Set<Integer> tValues = new HashSet<>();
		for (Transaction transaction: transactions) {
			if (city != null && city.equals(transaction.getTraderCity())) {
				tValues.add(transaction.getValue());
			}
		}
		return tValues;
	}

	public static int countTradersIn(List<Transaction> transactions, String city) {
		Set<Trader> uniqueTradersIn = new HashSet<>();
		for (Transaction transaction: transactions) {
			if (city != null && city.equals(transaction.getTraderCity())) {
				uniqueTradersIn.add(transaction.getTrader());
			}
		}
		return uniqueTradersIn.size();
	}
	
	public static boolean anyTradersBasedIn(List<Transaction> transactions, String city) {
		for (Transaction transaction: transactions) {
			if (city != null && city.equals(transaction.getTraderCity())) {
				return true;
			}
		}
		return false;
	}
	
	public static Set<String> getUniqueCities(List<Transaction> transactions) {
		Set<String> result = new HashSet<>();
		for (Transaction transaction: transactions) {
			result.add(transaction.getTraderCity());
		}
		return result;
	}
	
	public static String getUniqueNames(List<Transaction> transactions) {
		Set<String> uniqueNames = new TreeSet<>();
		for (Transaction transaction: transactions) {
			uniqueNames.add(transaction.getTraderName());
		}
		return String.join(", ", uniqueNames);
	}
	
	public static Set<Trader> getTradersByCityAndSort(List<Transaction> transactions, String city,
			Comparator<Trader> comparator) {
		Set<Trader> result = new HashSet<>();
		for (var t : transactions) {
			if (city != null && city.equals(t.getTraderCity())) {
				result.add(t.getTrader());
			}
		}
		return result;
	}
	
	public static List<Transaction> getTransactionsByYearAndSort(List<Transaction> transactions, int year,
			Comparator<Transaction> comparator) {
		List<Transaction> result = new ArrayList<>();
		for (var t : transactions) {
			if (t.getYear() == year) {
				result.add(t);
			}
		}
		result.sort(comparator);
		return result;
	}
	
	public static List<Transaction> getTransactionsByValueAndSort(List<Transaction> transactions, int value,
			Comparator<Transaction> comparator) {
		List<Transaction> result = new ArrayList<>();
		for (var t : transactions) {
			if (t.getValue() > value) {
				result.add(t);
			}
		}
		result.sort(comparator);
		return result;
	}

}

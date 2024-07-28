package view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import bean.Trader;
import bean.Transaction;
import model.DataModel;

public class TransactionApp {
	
	private static List<Transaction> transactions = DataModel.getTransactions();
	
	public static void main(String[] args) {
 		
 		
 		// 1. Find all transactions in the year 2011 and sort them by value (small to high).
		printf(
			"1. Find all transactions in the year 2011 and sort them by value (small to high)",
			getTransactionsAndSort(2011, (t1, t2) -> t1.getValue() - t2.getValue())
		);
		
 		// 2. Find all transactions have value greater than 300 and sort them by trader’s city
 		
		printf(
				"2. Find all transactions have value greater than 300 and sort them by trader’s city",
				getTransactionsByvalueAndSort(300, (t1, t2) -> t1.getTrader().getCity().compareTo(t2.getTrader().getCity()))
			);
 		// 3. What are all the unique cities where the traders work?
		printf(
				" 3. What are all the unique cities where the traders work?",
				getCity(transactions)
			);
 		// 4. Find all traders from Cambridge and sort them by name desc.
//		printf(
//				" 4. Find all traders from Cambridge and sort them by name desc.",
//				getCyti("Cambridge", null)
//			);
 		// 5. Return a string of all traders’ names sorted alphabetically.
		printf(
				"5. Return a string of all traders’ names sorted alphabetically.",
				getNameAndSort(transactions, (t1, t2) -> t1.getTrader().getName().compareTo(t2.getTrader().getName()))
			);
 		// 6. Are any traders based in Milan?
		printf(
				"6. Are any traders based in Milan?",
				getCity(transactions)
			);
 		// 7. Count the number of traders in Milan.
 		
 		// 8. Print all transactions’ values from the traders living in Cambridge.
 		
 		// 9. What’s the highest value of all the transactions?
 		
 		// 10. Find the transaction with the smallest value.
	}
	
	private static List<Transaction> getTransactionsAndSort(int year, Comparator<Transaction> comparator) {
		List<Transaction> result = new ArrayList<>();
		for (var t: transactions) {
			if (t.getYear() == year) {
				result.add(t);
			}
		}
		result.sort(comparator);
		return result;
	}
	private static List<Transaction> getNameAndSort(  List<Transaction> transactions ,Comparator<Transaction> comparator) {
		List<Transaction> result = new ArrayList<>();
		for (var t: transactions) {
			if (t.getTrader() != null) {
				result.add(t);
			}
		}
		result.sort(comparator);
		return result;
	}
	
	private static List<Transaction> getTransactionsByvalueAndSort(int value, Comparator<Transaction> comparator) {
		List<Transaction> result = new ArrayList<>();
		for (var t: transactions) {
			if (t.getValue() > value) {
				result.add(t);
			}
		}
		result.sort(comparator);
		return result;
	}
	private static List<Transaction> getCyti(String city, Comparator<Transaction> comparator) {
		List<Transaction> result = new ArrayList<>();
		for (var t: transactions) {
			if (city!= null && city.equals(t.getTrader().getCity())) {
				result.add(t);
			}
		}
		result.sort(comparator);
		return result;
	}
	
	private static Set<String> getCity(String value,List<Transaction> transactions){
		Set<String> result = new HashSet<String>();
		for (var t : transactions) {
			if(t.getTrader().getCity().equalsIgnoreCase(value)) {
				result.add(t);
			}
		
		}
		return result;
	}
	
	private static <E> void printf(String prefix, Collection<E> data) {
		System.out.println(prefix + " --> {");
		for (var t: data) {
			System.out.println("   -> " + t);
		}
		System.out.println("}");
	}
	
}
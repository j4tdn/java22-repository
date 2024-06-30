package view;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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
 		
 		// 3. What are all the unique cities where the traders work?
 		
 		// 4. Find all traders from Cambridge and sort them by name desc.
 		
 		// 5. Return a string of all traders’ names sorted alphabetically.
 		
 		// 6. Are any traders based in Milan?
 		
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
	
	private static void printf(String prefix, List<Transaction> data) {
		System.out.println(prefix + " --> {");
		for (var t: data) {
			System.out.println("   -> " + t);
		}
		System.out.println("}");
	}
	
}

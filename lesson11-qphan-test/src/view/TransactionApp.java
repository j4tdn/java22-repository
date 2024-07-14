package view;

import static utils.TransactionUtils.*;

import java.util.Collection;
import java.util.List;

import bean.Transaction;
import model.DataModel;

public class TransactionApp {
	
	private static List<Transaction> transactions = DataModel.getTransactions();
	
	public static void main(String[] args) {
		printf(
			"1. Find all transactions in the year 2011 and sort them by value (small to high)",
			getTransactionsByYearAndSort(transactions, 2011, (t1, t2) -> t1.getValue() - t2.getValue())
		);
		
		printf(
			"2. Find all transactions have value greater than 500 and sort them by trader’s city",
			getTransactionsByValueAndSort(transactions, 500, (t1, t2) -> t1.getTraderCity().compareTo(t2.getTraderCity()))
		);
 		
		printf(
			"3. What are all the unique cities where the traders work",
			getUniqueCities(transactions)
		);
 		
		printf(
			"4. Find all traders from Cambridge and sort them by name desc",
			getTradersByCityAndSort(transactions, "Cambridge", (t1, t2) -> t2.getName().compareTo(t1.getName()))
		);
 		
		System.out.println("5. Return a string of all traders’ names sorted alphabetically --> " + getUniqueNames(transactions) + "\n");
 		
		System.out.println("6. Are any traders based in Milan --> " + (anyTradersBasedIn(transactions, "Milan") ? "YES" : "NO") + "\n");
 		
		System.out.println("7. Count the number of traders in Cambridge --> " + countTradersIn(transactions, "Cambridge"));
 		
		printf(
			"8. Print all transactions’ values from the traders living in Cambridge",
			getTransactionValuesFrom(transactions, "Cambridge")
		);
 		
		System.out.println("9. What’s the highest value of all the transactions --> " + getHighestTransactionValue(transactions));
 		
		System.out.println("10. Find the transaction with the smallest value --> " + getTransactionWithSmallestValue(transactions));
	}
	
	private static <E> void printf(String prefix, Collection<E> data) {
		System.out.println(prefix + " --> {");
		for (var t: data) {
			System.out.println("   -> " + t);
		}
		System.out.println("}\n");
	}
	
}

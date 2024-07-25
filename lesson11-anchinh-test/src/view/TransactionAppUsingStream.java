
package view;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import bean.Transaction;
import model.DataModel;

public class TransactionAppUsingStream {
	private static List<Transaction> transactions = DataModel.getTransactions();

	public static void main(String[] args) {

		// 1. Find all transactions in the year 2011 and sort them by value (small to
		// high).
		printf("1. Find all transactions in the year 2011 and sort them by value (small to high)",
				transactions.stream().filter(t -> t.getYear() == 2011).
				sorted(Comparator.comparing(Transaction::getValue)).toList());

		// 2. Find all transactions have value greater than 300 and sort them by
		// trader’s city
		printf("2. Find all transactions have value greater than 300 and sort them by trader’s city  ",
				transactions.stream().filter(t -> t.getValue() > 300)
						.sorted((t1, t2) -> t1.getTrader().getCity().compareTo(t2.getTrader().getCity())).toList());

		// 3. What are all the unique cities where the traders work?
		printf("3. What are all the unique cities where the traders work?",
				transactions.stream().map(t -> t.getTrader().getCity())
						.distinct().collect(Collectors.toSet()));

		// 4. Find all traders from Cambridge and sort them by name desc.
		printf("4. Find all traders from Cambridge and sort them by name desc.",
				transactions.stream().map(Transaction::getTrader).filter(trader -> "Cambridge".equals(trader.getCity()))
						.distinct().sorted((t1, t2) -> t2.getName().compareTo(t1.getName())).toList());

		// 5. Return a string of all traders’ names sorted alphabetically.
		System.out.println("5. Return a string of all traders’ names sorted alphabetically --> " + transactions.stream()
				.map(t -> t.getTrader().getName()).distinct().sorted().collect(Collectors.joining(", ")));

		// 6. Are any traders based in Milan?
		System.out.println("6. Are any traders based in Milan? --> " + 
                transactions.stream().anyMatch(t -> "Milan".equals(t.getTrader().getCity())));
		
		// 7. Count the number of traders in Milan.
		System.out.println("7. Count the number of traders in Milan --> " +
				transactions.stream()
				.map(Transaction::getTrader).filter(trader -> "Milan".equals(trader.getCity())).distinct().count());

		// 8. Print all transactions’ values from the traders living in Cambridge.
		printf("8. Print all transactions’ values from the traders living in Cambridge ",
				transactions.stream().filter(t -> "Cambridge".equals(t.getTrader().getCity()))
						.map(Transaction::getValue).collect(Collectors.toSet()));

		// 9. What’s the highest value of all the transactions?
		System.out.println("9. What’s the highest value of all the transactions? --> " + 
				transactions.stream().map(Transaction::getValue)
	        			.reduce(Integer.MIN_VALUE, Integer::max));
		
		// 10. Find the transaction with the smallest value.
		System.out.println("10. Find the transaction with the smallest value.--> " +
				transactions.stream().map(Transaction::getValue)
		            	.reduce(Integer.MAX_VALUE,Integer::min));
		
	}

	private static <E> void printf(String prefix, Collection<E> data) {
		System.out.println(prefix + " --> {");
		for (var t : data) {
			System.out.println("   -> " + t);
		}
		System.out.println("}");
	}
}

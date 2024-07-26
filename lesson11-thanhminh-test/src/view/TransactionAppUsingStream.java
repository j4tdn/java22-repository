package view;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;
import model.DataModel;

public class TransactionAppUsingStream {
	private static List<Transaction> transactions = DataModel.getTransactions();

	public static void main(String[] args) {
		printf("1. Find all transactions in the year 2011 and sort them by value (small to high)",
		transactions.stream()
		.filter(t -> t.getYear() == 2011)
		.sorted(Comparator.comparing(Transaction::getValue))
		.toList());
		
		printf("\n2. Find all transactions have value greater than 300 and sort them by trader’s city",
		transactions.stream()
		.filter(t -> t.getValue() > 300)
		.sorted(Comparator.comparing(t->t.getTrader().getCity()))
		.toList());
		
		printf("\n3. What are all the unique cities where the traders work?", 
		transactions.stream()
		.map((t) -> t.getTrader().getCity())
		.distinct()
		.toList());
		
		printf("\n4. Find all traders from Cambridge and sort them by name desc.", 
		transactions.stream()
		.filter(t -> t.getTrader().getCity() == "Cambridge")
		.map((t) -> t.getTrader())
		.sorted(Comparator.comparing(Trader::getName).reversed())
		.distinct()
		.toList());
		
		System.out.println("\n5. Return a string of all traders’ names sorted alphabetically. --> " + 
		transactions.stream()
		.map(t -> t.getTrader().getName())
		.distinct()
		.sorted()
		.collect(Collectors.joining(", ")));
		
		System.out.print("\n6. Are any traders based in Milan? --> " +
		transactions.stream()
		.anyMatch(t -> "Milan".equals(t.getTrader().getCity())));

		System.out.print("\n7. Count the number of traders in Milan. --> " + 
		transactions.stream().map(Transaction::getTrader)
		.filter(trader -> "Milan".equals(trader.getCity()))
		.distinct()
		.count());
		
		printf("\n8. Print all transactions’ values from the traders living in Cambridge.",
		transactions.stream()
		.filter(t->t.getTrader().getCity()=="Cambridge")
		.map((t)->t.getValue())
		.sorted()
		.distinct()
		.toArray(Integer[]::new));

		System.out.print("\n9. What’s the highest value of all the transactions? -> " +
		transactions.stream()
		.map((t)->t.getValue())
		.reduce(Integer.MIN_VALUE, Integer::max));

		printf("\n10. Find the transaction with the smallest value. ", 
		transactions.stream()
		.min(Comparator.comparingInt(Transaction::getValue)));
	}

	public static <E> void printf(String prefix, Optional<Transaction> optional) {
		printf(prefix, Arrays.asList(optional));
	}
	public static <E> void printf(String prefix, E[] data) {
		printf(prefix, Arrays.asList(data));
	}
	
	private static<E> void printf(String prefix, Collection<E> data) {
		System.out.println(prefix + " --> {");
		for (var t : data) {
			System.out.println("   -> " + t);
		}
		System.out.println("}");
	}
}

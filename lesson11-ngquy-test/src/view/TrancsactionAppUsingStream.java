
package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import bean.Trader;
import bean.Transaction;
import model.DataModel;

import static utils.TransactionUtils.*;;

public class TrancsactionAppUsingStream {

	private static List<Transaction> transactions = DataModel.getTransactions();

	public static void main(String[] args) {
		printf("1. List Transaction: ", transactions);
		// 1. Find all transactions in the year 2011 and sort them by value (small to
		// high).
		printf("1. Find all transactions in the year 2011 and sort them by value (small to high)",
				transactions.stream()
				.filter(t-> t.getYear()== 2011)
				.sorted(Comparator.comparing(Transaction::getValue))
				.toList());
		
		// 2. Find all transactions have value greater than 300 and sort them by
		// trader’s city
		printf("2. Find all transactions have value greater than 300 and sort them by trader’s city  ",
				transactions.stream()
				.filter(t-> t.getValue()> 300)
				.sorted(Comparator.comparing(t->t.getTrader().getCity()))
				.toList());
		
		// 3. What are all the unique cities where the traders work?
		printf("3. What are all the unique cities where the traders work? ", 
				transactions.stream()
				.map((t)->t.getTrader().getCity())
				.distinct()
				.toList());
		
		// 4. Find all traders from Cambridge and sort them by name desc.
		printf("4. Find all traders from Cambridge and sort them by name desc.  ", 
				transactions.stream()
				.filter(t->t.getTrader().getCity()=="Cambridge")
				.map((t)->t.getTrader())
				.sorted(Comparator.comparing(Trader::getName).reversed())
				.distinct()
				.toList());
		
		// 5. Return a string of all traders’ names sorted alphabetically.
		System.out.println("\n5. Return a string of all traders’ names sorted alphabetically.  ");
		String[] names = transactions.stream()
				.map((t)->t.getTrader().getName())
				.sorted()
				.distinct()
				.toArray(String[]::new);
		System.out.println(String.join(", ", names));
		
		// 6. Are any traders based in Milan?
		System.out.print("\n6. Are any traders based in Milan?  --> ");
		List<Trader> list6 = transactions.stream()
				.map((t)->t.getTrader())
				.filter(t->t.getCity()=="Milan")
				.distinct()
				.toList();
		System.out.println(list6.size() > 0 ? true : false);

		// 7. Count the number of traders in Milan.
		System.out.print("\n7. Count the number of traders in Milan.  --> ");
		System.out.println(list6.size());

		// 8. Print all transactions’ values from the traders living in Cambridge.
		printf("\n8. Print all transactions’ values from the traders living in Cambridge. ",
				transactions.stream()
				.filter(t->t.getTrader().getCity()=="Cambridge")
				.map((t)->t.getValue())
				.sorted()
				.distinct()
				.toArray(Integer[]::new));


		// 9. What’s the highest value of all the transactions?
		System.out.print("\n9. What’s the highest value of all the transactions?  ");
		
		System.out.println(transactions.stream()
				.map((t)->t.getValue())
				.reduce(Integer.MIN_VALUE, Integer::max));

		// 10. Find the transaction with the smallest value.
		System.out.print("\n10. Find the transaction with the smallest value. ");
		System.out.println(transactions.stream()
				.map((t)->t.getValue())
				.reduce(Integer.MAX_VALUE, Integer::min));
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

package view;

import java.util.Collection;
import java.util.List;
import bean.Transaction;
import model.DataModel;

import static utils.TransactionUtils.*;;

public class TransactionApp {

	private static List<Transaction> transactions = DataModel.getTransactions();

	public static void main(String[] args) {
		printf("1. List Transaction: ", transactions);
		// 1. Find all transactions in the year 2011 and sort them by value (small to
		// high).
		printf("1. Find all transactions in the year 2011 and sort them by value (small to high)",
				getTransactionsAndSort(transactions, t-> t.getYear() == 2011, (t1, t2) -> t1.getValue() - t2.getValue()));
		
		// 2. Find all transactions have value greater than 300 and sort them by
		// trader’s city
		printf("2. Find all transactions have value greater than 300 and sort them by trader’s city  ",
				getTransactionsAndSort(transactions, t-> t.getValue() > 300,
						(t1, t2) -> t1.getTrader().getCity().compareTo(t2.getTrader().getCity())));
		
		// 3. What are all the unique cities where the traders work?
		printf("3. What are all the unique cities where the traders work? ", 
				getUniqueCitis(transactions));
		
		// 4. Find all traders from Cambridge and sort them by name desc.
		printf("4. Find all traders from Cambridge and sort them by name desc.  ", 
				getTrader(transactions,t -> t.getTrader().getCity().equals("Cambridge"), 
						(t1, t2) -> t2.getName().compareTo(t1.getName())));
		
		// 5. Return a string of all traders’ names sorted alphabetically.
		System.out.println("\n5. Return a string of all traders’ names sorted alphabetically.  ");
		System.out.println(getUniqueName(transactions));
		
		// 6. Are any traders based in Milan?
		System.out.print("\n6. Are any traders based in Milan?  --> ");
		List<Transaction> list6 = getTransactionsAndSort(transactions, 
				t -> t.getTrader().getCity().equals("Milan"),
				(t1, t2) -> t1.getTrader().getCity().compareTo(t2.getTrader().getCity()));
		System.out.println(list6.size() > 0 ? true : false);

		// 7. Count the number of traders in Milan.
		System.out.print("\n7. Count the number of traders in Milan.  --> ");
		System.out.println(list6.size());

		// 8. Print all transactions’ values from the traders living in Cambridge.
		printf("\n8. Print all transactions’ values from the traders living in Cambridge. ",
				getValueTransaction(transactions,
						t-> t.getTrader().getCity().equals("Cambridge"),
						(t1, t2) -> t2.compareTo(t1)));


		// 9. What’s the highest value of all the transactions?
		System.out.print("\n9. What’s the highest value of all the transactions?  ");
		System.out.println(getValueTransaction(transactions,
				t-> !t.getTrader().getCity().equals("..."),
				(t1, t2) -> t2.compareTo(t1)).get(0));

		// 10. Find the transaction with the smallest value.
		System.out.print("\n10. Find the transaction with the smallest value. ");
		System.out.println(getValueTransaction(transactions,
				t-> !t.getTrader().getCity().equals("..."),
				(t1, t2) -> t1.compareTo(t2)).get(0));
	}


	private static<E> void printf(String prefix, Collection<E> data) {
		System.out.println(prefix + " --> {");
		for (var t : data) {
			System.out.println("   -> " + t);
		}
		System.out.println("}");
	}
}
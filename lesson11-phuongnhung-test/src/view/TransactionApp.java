package view;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import functional.TraderCon;
import functional.TransactionCon;
import bean.Trader;
import bean.Transaction;
import model.DataModel;

public class TransactionApp {

	private static List<Transaction> transactions = DataModel.getTransactions();
	private static List<Trader> traders = null;

	public static void main(String[] args) {
		printf("1. List Transaction: )", transactions);
		// 1. Find all transactions in the year 2011 and sort them by value (small to
		// high).
		printf("1. Find all transactions in the year 2011 and sort them by value (small to high)",
				getTransactionsAndSort(t-> t.getYear() == 2011, (t1, t2) -> t1.getValue() - t2.getValue()));
		
		// 2. Find all transactions have value greater than 300 and sort them by
		// trader’s city
		printf("2. Find all transactions have value greater than 300 and sort them by trader’s city  ",
				getTransactionsAndSort(t-> t.getValue() > 300,
						(t1, t2) -> t1.getTrader().getCity().compareTo(t2.getTrader().getCity())));
		
		// 3. What are all the unique cities where the traders work?
		traders = getUniqueTraders();
		printf("3. What are all the unique cities where the traders work? ", traders);
		
		// 4. Find all traders from Cambridge and sort them by name desc.
		printf("4. Find all traders from Cambridge and sort them by name desc.  ", getTraderAndSort(
				t -> t.getCity().equals("Cambridge"), (t1, t2) -> t2.getName().compareTo(t1.getName())));
		
		// 5. Return a string of all traders’ names sorted alphabetically.
		System.out.println("\n5. Return a string of all traders’ names sorted alphabetically.  ");
		List<String> List5 = getNameTraders((t1, t2) -> t1.compareTo(t2));
		System.out.println(String.join(", ", List5));
		
		// 6. Are any traders based in Milan?
		System.out.print("\n6. Are any traders based in Milan?  --> ");
		List<Transaction> list6 = getTransactionsAndSort(t -> t.getTrader().getCity().equals("Milan"),
				(t1, t2) -> t1.getTrader().getCity().compareTo(t2.getTrader().getCity()));
		System.out.println(list6.size() > 0 ? true : false);

		// 7. Count the number of traders in Milan.
		System.out.print("\n7. Count the number of traders in Milan.  --> ");
		System.out.println(list6.size());

		// 8. Print all transactions’ values from the traders living in Cambridge.
		printf("\n8. Print all transactions’ values from the traders living in Cambridge. ",
				getValueTransaction(
						t-> t.getTrader().getCity().equals("Cambridge"),
						(t1, t2) -> t2.compareTo(t1)));


		// 9. What’s the highest value of all the transactions?
		System.out.print("\n9. What’s the highest value of all the transactions?  ");
		System.out.println(getValueTransaction(
				t-> !t.getTrader().getCity().equals("..."),
				(t1, t2) -> t2.compareTo(t1)).get(0));

		// 10. Find the transaction with the smallest value.
		System.out.print("\n10. Find the transaction with the smallest value. ");
		System.out.println(getValueTransaction(
				t-> !t.getTrader().getCity().equals("..."),
				(t1, t2) -> t1.compareTo(t2)).get(0));
	}

	private static List<Transaction> getTransactionsAndSort(TransactionCon con, Comparator<Transaction> comparator) {
		List<Transaction> result = new ArrayList<>();
		for (var t : transactions) {
			if (con.test(t)) {
				result.add(t);
			}
		}
		result.sort(comparator);
		return result;
	}
	private static List<Trader> getTraderAndSort(TraderCon con, Comparator<Trader> comparator) {
		List<Trader> result = new ArrayList<>();
		for (var t : traders) {
			if (con.test(t)) {
				result.add(t);
			}
		}
		result.sort(comparator);
		return result;
	}

	private static List<Integer> getValueTransaction(TransactionCon con, Comparator<Integer> comparator) {
		List<Integer> result = new ArrayList<>();
		for (var t : transactions) {
			if (con.test(t)) {
				result.add(t.getValue());
			}
		}
		result.sort(comparator);
		return result;
	}
	
	private static List<String> getNameTraders(Comparator<String> comparator) {
		List<String> result = new ArrayList<>();
		for (var t : traders) {
			result.add(t.getName());
		}
		result.sort(comparator);
		return result;
	}

	private static List<Trader> getUniqueTraders() {
		Set<Trader> traderSet = new HashSet<>();
		for (var transaction : transactions) {
			traderSet.add(transaction.getTrader());
		}
		return new ArrayList<>(traderSet);
	}

	private static void printf(String prefix, List<?> data) {
		System.out.println(prefix + " --> {");
		for (var t : data) {
			System.out.println("   -> " + t);
		}
		System.out.println("}");
	}
}
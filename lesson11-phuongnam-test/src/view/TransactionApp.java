package view;

import java.util.ArrayList;
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

		printf("1.Find all transactions in the year 2011 and sort them by value (small to high) ",
				getTransactionsAndSort(2011, (t1, t2) -> t1.getValue() - t2.getValue()));

		printf("2.Find all transactions have value greater than 300 and sort them by trader’s city ",
				getTransactionsValueBetterThan300(300, (t1, t2) -> {
					String name1 = t1.getTrader().getCity();
					String name2 = t2.getTrader().getCity();
					return name1.compareTo(name2);
				}));

		printf("3.What are all the unique cities where the traders work?", getUniqueCities(transactions));

		// 4. Find all traders from Cambridge and sort them by name desc.
		printf("Find all traders from Cambridge and sort them by name desc.",
				findTradersFromCambrige("Cambridge", (t1, t2) -> {
					return t2.getName().compareTo(t1.getName());
				}));

		// 5. Return a string of all traders’ names sorted alphabetically.
		printf("5. Return a string of all traders’ names sorted alphabetically.", printAllNameOfTraders((t1, t2) -> {
			return t1.compareTo(t2);
		}));

		// 6. Are any traders based in Milan?
		// 7. Count the number of traders in Milan.
		// 8. Print all transactions’ values from the traders living in Cambridge.
		// 9. What’s the highest value of all the transactions?
		// 10. Find the transaction with the smallest value.

	}

	public static List<Transaction> getTransactionsAndSort(int year, Comparator<Transaction> comparator) {

		List<Transaction> result = new ArrayList<>();

		for (var t : transactions) {
			if (t.getYear() == year) {
				result.add(t);
			}
		}

		result.sort(comparator);
		return result;
	}

	private static void printf(String prefix, List<?> data) {
		System.out.println(prefix + " --->");
		for (var t : data) {
			System.out.println("  -> " + t);
		}
		System.out.println("}");
	}

	private static List<Transaction> getTransactionsValueBetterThan300(int value, Comparator<Transaction> comparator) {
		List<Transaction> result = new ArrayList<>();

		for (var t : transactions) {
			if (t.getValue() > 300) {
				result.add(t);
			}
		}
		result.sort(comparator);
		return result;
	}

	private static List<String> getUniqueCities(List<Transaction> data) {

		Set<String> result = new HashSet<>();

		for (var t : data) {
			result.add(t.getTrader().getCity());
		}

		List<String> cities = new ArrayList<String>();
		cities.addAll(result);
		return cities;

	}

	private static List<Trader> findTradersFromCambrige(String city, Comparator<Trader> comparator) {

		Set<Trader> traders = new HashSet<>();

		for (var t : transactions) {
			if (t.getTrader().getCity().equals(city)) {
				traders.add(t.getTrader());
			}
		}
		List<Trader> result = new ArrayList<Trader>();
		result.addAll(traders);
		result.sort(comparator);
		return result;
	}

	private static List<String> printAllNameOfTraders(Comparator<String> comparator) {

		Set<String> name = new HashSet<>();

		for (var t : transactions) {
			name.add(t.getTrader().getName());
		}

		List<String> result = new ArrayList<>();
		result.addAll(name);
		result.sort(comparator);
		return result;
	}
}

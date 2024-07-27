package view.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import bean.Trader;
import bean.Transaction;
import model.DataModel;

public class TransactionAppUsingStream {

	private static List<Transaction> transactions = DataModel.getTransactions();

	public static void main(String[] args) {

		printf("1.Find all transactions in the year 2011 and sort them by value (small to high) ", transactions.stream()
				.filter(t -> t.getYear() == 2011).sorted(Comparator.comparing(Transaction::getValue)).toList()

		);

		printf("2.Find all transactions have value greater than 300 and sort them by trader’s city ",

				transactions.stream().filter(t -> t.getValue() > 300)
						.sorted((t1, t2) -> t1.getTraderCity().compareTo(t2.getTraderCity())).toList());

		printf("3. What are all the unique cities where the traders work?",
				transactions.stream().map(Transaction::getTraderCity).distinct().toList()

		);

		printf("4. Find all traders from Cambridge and sort them by name desc.",
				transactions.stream().map(Transaction::getTrader).filter(t -> t.getCity().equals("Cambridge"))
						.distinct().sorted((t1, t2) -> t2.getName().compareTo(t1.getName())).toList());

		printf("5. Return a string of all traders’ names sorted alphabetically.",
				transactions.stream().map(Transaction::getTrader).distinct()
						.sorted((t1, t2) -> t1.getName().compareTo(t2.getName())).toList());

		System.out.println("6. Are any traders based in Milan? " + existTraderInMilan());

		System.out.println("7. Count the number of traders in Milan. --> " + countTradersInMilan());

		printf("8. Print all transactions’ values from the traders living in Cambridge", transactions.stream()
				.filter(t -> t.getTraderCity().equals("Cambridge")).map(Transaction::getValue).toList()

		);


		System.out.print("9. What’s the highest value of all the transactions? --> ");
		findHighestValueOfTransactions();

		// 10. Find the transaction with the smallest value.
		System.out.print("10. What’s the smallest value of all the transactions? --> ");
		findSmallestValueOfTransactions();

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

	private static boolean existTraderInMilan() {
		boolean check = transactions.stream().map(Transaction::getTrader).anyMatch(t -> t.getCity().equals("Milan"));

		if (check) {
			return true;
		}
		return false;
	}

	private static int countTradersInMilan() {
		List<Trader> trader = transactions.stream().map(Transaction::getTrader).distinct()
				.filter(t -> t.getCity().equals("Milan")).toList();
		int count = trader.size();
		return count;
	}

	private static void findHighestValueOfTransactions() {

		Optional<Integer> max = transactions.stream().map(Transaction::getValue).sorted((t1, t2) -> t2.compareTo(t1))
				.findFirst();

		if (max.isPresent()) {
			System.out.println(max.get());
		} else {
			System.out.println("The highest value of transactions --> null");
		}

	}

	private static void findSmallestValueOfTransactions() {

		Optional<Integer> min = transactions.stream().map(Transaction::getValue).sorted((t1, t2) -> t1.compareTo(t2))
				.findFirst();

		if (min.isPresent()) {
			System.out.println(min.get());
		} else {
			System.out.println("The smallest value of transactions --> null");
		}

	}

}

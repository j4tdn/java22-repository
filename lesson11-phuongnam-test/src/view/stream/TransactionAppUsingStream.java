package view.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;
import model.DataModel;

public class TransactionAppUsingStream {

	private static List<Transaction> transactions = DataModel.getTransactions();

	public static void main(String[] args) {

		printf("1.Find all transactions in the year 2011 and sort them by value (small to high) ", 
				transactions.stream()
					.filter(t -> t.getYear() == 2011)
					.sorted(Comparator.comparing(Transaction::getValue))
					.toList()

		);

		printf("2.Find all transactions have value greater than 300 and sort them by trader’s city ",

				transactions.stream()
					.filter(t -> t.getValue() > 300)
					.sorted(Comparator
					.comparing(Transaction::getTraderCity))
					.toList());

		printf("3. What are all the unique cities where the traders work?",
				transactions.stream()
					.map(Transaction::getTraderCity)
					.distinct()
					.toList()

		);

		printf("4. Find all traders from Cambridge and sort them by name desc.",
				transactions.stream()
					.map(Transaction::getTrader)
					.filter(t -> t.getCity().equals("Cambridge"))
					.distinct()
					.sorted((t1, t2) -> t2.getName().compareTo(t1.getName()))
					.toList());


		System.out.print("5. Return a string of all traders’ names sorted alphabetically -->");
		printListNamesOfTrader();

		System.out.println("6. Are any traders based in Milan? " + existTraderInMilan());

		System.out.println("7. Count the number of traders in Milan. --> " + countTradersInMilan());

		printf("8. Print all transactions’ values from the traders living in Cambridge", 
				transactions.stream()
					.filter(t -> t.getTraderCity()
					.equals("Cambridge"))
					.map(Transaction::getValue)
					.toList()

		);

		System.out.print("9. What’s the highest value of all the transactions? --> ");
		findHighestValueOfTransactions();

		// 10. Find the transaction with the smallest value.
		System.out.print("10. What’s the smallest value of all the transactions? --> ");
		findSmallestValueOfTransactions();

	}

	

	private static void printf(String prefix, List<?> data) {
		System.out.println(prefix + " --->");
		for (var t : data) {
			System.out.println("  -> " + t);
		}
		System.out.println("}");
	}

	private static void printListNamesOfTrader() {
		String names = transactions.stream()
				.map(Transaction::getTraderName)
				.distinct()
				.sorted()
				.collect(Collectors.joining(", "));
		System.out.println(names);
	}

	private static boolean existTraderInMilan() {
		boolean check = transactions.stream()
				.map(Transaction::getTrader)
				.anyMatch(t -> t.getCity()
				.equals("Milan"));

		if (check) {
			return true;
		}
		return false;
	}

	private static int countTradersInMilan() {
		List<Trader> trader = transactions.stream()
				.map(Transaction::getTrader).distinct()
				.filter(t -> t.getCity()
				.equals("Milan"))
				.toList();
		int count = trader.size();
		return count;
	}

	private static void findHighestValueOfTransactions() {

		int max = transactions.stream()
				.map(Transaction::getValue)
				.reduce(Integer.MIN_VALUE, Integer::max);

		System.out.println(max);

	}

	private static void findSmallestValueOfTransactions() {

		int min = transactions.stream()
				.map(Transaction::getValue)
				.reduce(Integer.MAX_VALUE, Integer::min);

		System.out.println(min);

	}

}

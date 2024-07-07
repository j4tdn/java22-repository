package view;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;
import model.DataModel;

public class TransactionApp {
	private static List<Transaction> transactions = DataModel.getTransactions();
	public static void main(String[] args) {
		//1. Find all transactions in the year 2011 and sort them by value (small to high).
		printf("1. Find all transactions in the year 2011 and sort them by value (small to high).",
	                getTransactionsAndSort(2011, Comparator.comparingInt(Transaction::getValue)));
		//2. Find all transactions have value greater than 300 and sort them by trader’s city
		printf("2. Find all transactions have value greater than 300 and sort them by trader’s city",
	                getTransactionsValueAndSort(300,
	                        Comparator.comparing(t -> t.getTrader().getCity())));
		//3. What are all the unique cities where the traders work?
		System.out.println("3. What are all the unique cities where the traders work? --> ");
        System.out.println(getUniqueCities());
		//4. Find all traders from Cambridge and sort them by name desc.
        printf("4. Find all traders from Cambridge and sort them by name desc.",
                getTradersFromCityAndSort("Cambridge", (t1, t2) -> t2.getName().compareTo(t1.getName())));
		//5. Return a string of all traders’ names sorted alphabetically.
        System.out.println("5. Return a string of all traders’ names sorted alphabetically. --> ");
        System.out.println(getAllTradersNamesSorted(String::compareTo));
		//6. Are any traders based in Milan?
        System.out.println("6. Are any traders based in Milan? --> ");
        System.out.println(areAnyTradersInCity("Milan"));
		//7. Count the number of traders in Milan.
        System.out.println("7. Count the number of traders in Milan. --> ");
        System.out.println(countTradersInCity("Milan"));
		//8. Print all transactions’ values from the traders living in Cambridge.
        printf("8. Print all transactions’ values from the traders living in Cambridge. --> ",
                getTransactionsFromCity("Cambridge"));
		//9. What’s the highest value of all the transactions?
        System.out.println("9. What’s the highest value of all the transactions? --> ");
        System.out.println(getHighestTransactionValue());
		//10. Find the transaction with the smallest value.
        System.out.println("10. Find the transaction with the smallest value. --> ");
        System.out.println(getSmallestTransactionValue());
	}
	private static List<Transaction> getTransactionsAndSort(int year, Comparator<Transaction> comparator) {
        List<Transaction> result = new ArrayList<>();
        for (var t : transactions) {
            if (t.getYear() == year) {
                result.add(t);
            }
        }
        result.sort(comparator);
        return result;
    }

    private static List<Transaction> getTransactionsValueAndSort(int value, Comparator<Transaction> comparator) {
        List<Transaction> result = new ArrayList<>();
        for (var t : transactions) {
            if (t.getValue() > value) {
                result.add(t);
            }
        }
        result.sort(comparator);
        return result;
    }

    private static Set<String> getUniqueCities() {
        return transactions.stream()
                .map(t -> t.getTrader().getCity())
                .collect(Collectors.toSet());
    }

    private static List<Trader> getTradersFromCityAndSort(String city, Comparator<Trader> comparator) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .filter(t -> t.getCity().equals(city))
                .distinct()
                .sorted(comparator)
                .collect(Collectors.toList());
    }

    private static String getAllTradersNamesSorted(Comparator<String> comparator) {
        List<String> result = transactions.stream()
                .map(t -> t.getTrader().getName())
                .distinct()
                .sorted(comparator)
                .collect(Collectors.toList());
        return String.join(", ", result);
    }

    private static boolean areAnyTradersInCity(String city) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .anyMatch(t -> t.getCity().equals(city));
    }

    private static long countTradersInCity(String city) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .filter(t -> t.getCity().equals(city))
                .distinct()
                .count();
    }

    private static List<Integer> getTransactionsFromCity(String city) {
        return transactions.stream()
                .filter(t -> t.getTrader().getCity().equals(city))
                .map(Transaction::getValue)
                .collect(Collectors.toList());
    }

    private static int getHighestTransactionValue() {
        return transactions.stream()
                .mapToInt(Transaction::getValue)
                .max()
                .orElseThrow(() -> new RuntimeException("No transactions found"));
    }

    private static int getSmallestTransactionValue() {
        return transactions.stream()
                .mapToInt(Transaction::getValue)
                .min()
                .orElseThrow(() -> new RuntimeException("No transactions found"));
    }

    private static void printf(String prefix, List<?> data) {
        System.out.println(prefix + " --> {");
        for (var t : data) {
            System.out.println("   -> " + t);
        }
        System.out.println("}");
    }
}

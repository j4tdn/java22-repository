package view;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import bean.Trader;
import bean.Transaction;
import model.DataModel;

public class TransactionApp {

	private static List<Transaction> transactions = DataModel.getTransactions();

	public static void main(String[] args) {

		// 1. Find all transactions in the year 2011 and sort them by value (small to high).
		printf("1. Find all transactions in the year 2011 and sort them by value (small to high)",
				getTransactionsAndSort(2011, (t1, t2) -> t1.getValue() - t2.getValue()));

		// 2. Find all transactions have value greater than 300 and sort them by trader’s city
		printf("2. Find all transactions have value greater than 300 and sort them by trader’s city",
				getTransactionsValueAndSort(300,
						(t1, t2) -> t1.getTrader().getCity().compareTo(t2.getTrader().getCity())));

		// 3. What are all the unique cities where the traders work?

		// 4. Find all traders from Cambridge and sort them by name desc.
		printf("4. Find all traders from Cambridge and sort them by name desc.",
				getTraderValueAndSort("Cambridge", (t1, t2) -> t2.getName().compareTo(t1.getName())));
		;

		// 5. Return a string of all traders’ names sorted alphabetically.
		System.out.println("5. Return a string of all traders’ names sorted alphabetically --> ");
		System.out.println(getAllTradersNamesSorted(((t1, t2) -> t1.compareTo(t2))));


		// 6. Are any traders based in Milan?
		System.out.println("6. Are any traders based in Milan? --> ");
        System.out.println(TradersBasedInCity("Milan"));
		
		// 7. Count the number of traders in Milan.
        System.out.println("7. Count the number of traders in Milan. --> ");
        System.out.println(countTradersInCity("Milan"));
		// 8. Print all transactions’ values from the traders living in Cambridge.
		printf("8. Print all transactions’ values from the traders living in Cambridge --> ",
				getTransactionsFromCityAndSort("Cambridge", (t1, t2) -> t2.getValue() - t1.getValue()));

		// 9. What’s the highest value of all the transactions?
		System.out.println("9. What’s the highest value of all the transactions? --> ");
		System.out.println(getHighestValueTransactions());

		// 10. Find the transaction with the smallest value.
		System.out.println("10. Find the transaction with the smallest value. --> ");
		System.out.println(getSmallestValueTransaction());
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
	

	// 4. Find all traders from Cambridge and sort them by name desc
	private static List<Trader> getTraderValueAndSort(String city, Comparator<Trader> comparator) {
		List<Trader> result = new ArrayList<>();
		for (var t : transactions) {
			if (t.getTrader().getCity().equals(city)) {
				result.add(t.getTrader());
			}
		}
		result.sort(comparator);
		return result;
	}

	// 5. Return a string of all traders’ names sorted alphabetically.
	private static String getAllTradersNamesSorted(Comparator<String> comparator) {
		List<String> result = new ArrayList<>();
		for (var t : transactions) {
			String name = t.getTrader().getName();
			if (!result.contains(name)) {
				result.add(name);
			}
		}
		result.sort(comparator);
		return String.join(", ", result);
	}

	// 6
	  private static boolean TradersBasedInCity(String city) {
	        for (var t : transactions) {
	            if (t.getTrader().getCity().equals(city)) {
	                return true;
	            }
	        }
	        return false;
	    }
	  
	  private static int countTradersInCity(String city) {
	        List<Trader> result = new ArrayList<>();
	        for (var t : transactions) {
	            Trader trader = t.getTrader();
	            if (trader.getCity().equals(city) && !result.contains(trader)) {
	                result.add(trader);
	            }
	        }
	        return result.size();
	    }

	
	private static List<Transaction> getTransactionsFromCityAndSort(String city, Comparator<Transaction> comparator) {
		List<Transaction> result = new ArrayList<>();
		for (var t : transactions) {
			if (t.getTrader().getCity().equals(city)) {
				result.add(t);
			}
		}
		result.sort(comparator);
		return result;
	}
	private static List<Transaction> getHighestValueTransactions() {
	    int highestValue = Integer.MIN_VALUE;
	    for (Transaction transaction : transactions) {
	        int value = transaction.getValue();
	        if (value > highestValue) {
	            highestValue = value;
	        }
	    }
	    List<Transaction> result = new ArrayList<>();
	    for (Transaction transaction : transactions) {
	        if (transaction.getValue() == highestValue) {
	            result.add(transaction);
	        }
	    }
	    return result;
	}

	
	private static List<Transaction> getSmallestValueTransaction() {
	    int smallestValue = Integer.MAX_VALUE;
	    for (Transaction transaction : transactions) {
	        int value = transaction.getValue();
	        if (value < smallestValue) {
	            smallestValue = value;
	        }
	    }
	    List<Transaction> result = new ArrayList<>();
	    for (Transaction transaction : transactions) {
	        if (transaction.getValue() == smallestValue) {
	            result.add(transaction);
	        }
	    }
	    return result;
	}


//	private static void printf(String prefix, List<Transaction> data) {
//		System.out.println(prefix + " --> {");
//		for (var t : data) {
//			System.out.println("   -> " + t);
//		}
//		System.out.println("}");
//	}

	private static void printf(String prefix, List<?> data) {
		System.out.println(prefix + " --> {");
		for (var t : data) {
			System.out.println("   -> " + t);
		}
		System.out.println("}");
	}

}
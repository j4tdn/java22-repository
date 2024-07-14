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
 		
 		
 		// 1. Find all transactions in the year 2011 and sort them by value (small to high). DONE
		printf(
			"1. Find all transactions in the year 2011 and sort them by value (small to high)",
			getTransactionsAndSort(2011, (t1, t2) -> t1.getValue() - t2.getValue())
		);
		
 		// 2. Find all transactions have value greater than 300 and sort them by trader’s city DONE
		printf(
				"2. Find all transactions have value greater than 300 and sort them by trader’s city",
				getTransactionAndSortCity(300, (t1, t2) -> t1.getTrader().getCity().compareTo(t2.getTrader().getCity()))
			);
		
 		
 		// 3. What are all the unique cities where the traders work? DONE
		System.out.println("3. What are all the unique cities where the traders work?");
	    for (String city : getUniqueCities()) {
	        System.out.println(city);
	    }
 		
 		// 4. Find all traders from Cambridge and sort them by name desc. 	DONE
		printft(
				"4. Find all traders from Cambridge and sort them by name desc.",
				gettradersOfcity("Cambridge", (t1, t2) -> t2.getName().compareTo(t1.getName())));
			
 		
 		// 5. Return a string of all traders’ names sorted alphabetically. DONE
		System.out.println("5. Return a string of all traders’ names sorted alphabetically.");
		List<String> namelist = getUniqueName((t1, t2) -> t1.compareTo(t2));
		System.out.println(String.join(", ", namelist));
		
 		// 6. Are any traders based in Milan?  DONE 
		System.out.println("6. " + (countTradersInMilan() > 0 ? "There are traders based in Milan." : "There are no traders based in Milan."));
 		
 		// 7. Count the number of traders in Milan. DONE
		System.out.println("7. Number of traders in Milan: " + countTradersInMilan());
 		
 		// 8. Print all transactions’ values from the traders living in Cambridge. 
		System.out.println("8. Print all transactions’ values from the traders living in Cambridge.");
		List<String> valuecitylist = allTransactionvalueofcity("Cambridge");
		System.out.println(String.join(", ", valuecitylist));
 		
 		// 9. What’s the highest value of all the transactions? DONE
		System.out.println("9. The highest value of all the transactions is: " + highestValueofalltransactions());
 		
 		// 10. Find the transaction with the smallest value. DONE
		System.out.println("10. Find the transaction with the smallest value:  " + lowestValueofalltransactions());
	}
	
	private static int highestValueofalltransactions(){
		int maxValue = Integer.MIN_VALUE;
		for (Transaction t : transactions) {
	        if (t.getValue() > maxValue) {
	            maxValue = t.getValue();
	        }
	    }
	    return maxValue;
	}
	private static int lowestValueofalltransactions(){
		int minValue = Integer.MAX_VALUE;
		for (Transaction t : transactions) {
	        if (t.getValue() < minValue) {
	            minValue = t.getValue();
	        }
	    }
	    return minValue;
	}
	
	
	private static List<Trader> getUniqueTraders() {
	    Set<Trader> traderSet = new HashSet<>();
	    for (var transaction : transactions) {
	        traderSet.add(transaction.getTrader());
	    }
	    return new ArrayList<>(traderSet);
	}
	private static List<Trader> gettradersOfcity(String city, Comparator<Trader> comparator){
		List<Trader> trader = new ArrayList<>();
		for (var t: getUniqueTraders() ) {
			if (t.getCity() == city) {
				trader.add(t);
			}
		}
		trader.sort(comparator);
		return trader;

	}
	

	private static Set<String> getUniqueCities() {
	    Set<String> citySet = new HashSet<>();
	    for (var trader : getUniqueTraders()) {
	        citySet.add(trader.getCity());
	    }
	    return citySet;
	}
	private static List<String> getUniqueName(Comparator<String> comparator) {
	    List<String> name = new ArrayList<>();
	    for (var trader : getUniqueTraders()) {
	        name.add(trader.getName());
	    }
	    name.sort(comparator);
	    return name;
	}
	private static int countTradersInMilan() {
	    int count = 0;
	    for (Trader trader : getUniqueTraders()) {
	        if ("Milan".equals(trader.getCity())) {
	            count++;
	        }
	    }
	    return count;
	}
	private static List<String> allTransactionvalueofcity(String city){
		List<String> value = new ArrayList<>();
		for (Transaction t : transactions) {
	        if (t.getTrader().getCity() == city) {
	            value.add(Integer.toString(t.getValue()));
	        }
	    }
	    return value;
	}

	private static List<Transaction> getTransactionsAndSort(int year, Comparator<Transaction> comparator) {
		List<Transaction> result = new ArrayList<>();
		for (var t: transactions) {
			if (t.getYear() == year) {
				result.add(t);
			}
		}
		result.sort(comparator);
		return result;
	}
	private static List<Transaction> getTransactionAndSortCity(int value, Comparator<Transaction> comparator){
		List<Transaction> result = new ArrayList<>();
		for (var t: transactions) {
			if (t.getValue() > value) {
				result.add(t);
			}
		}
		result.sort(comparator);
		return result;
	}
	
	private static void printf(String prefix, List<Transaction> data) {
		System.out.println(prefix + " --> {");
		for (var t: data) {
			System.out.println("   -> " + t);
		}
		System.out.println("}");
	}
	private static void printft(String prefix, List<Trader> data) {
		System.out.println(prefix + " --> {");
		for (var t: data) {
			System.out.println("   -> " + t);
		}
		System.out.println("}");
	}
	
}




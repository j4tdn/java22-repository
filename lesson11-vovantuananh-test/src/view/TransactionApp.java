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
		
		// 1. Find all transactions in the year 2011 and sort them by value (small to high).
				printf(
					"1. Find all transactions in the year 2011 and sort them by value (small to high)",
					getTransactionsAndSort(2011, (t1, t2) -> t1.getValue() - t2.getValue())
				);
				
		// 2. Find all transactions have value greater than 300 and sort them by trader’s city
				printf(
						"Find all transactions have value greater than 300 and sort them by trader’s city",
						 getTransactionsbyValue(300, (t1, t2) -> t1.getTrader().getCity().compareTo(t2.getTrader().getCity()))
					);
		// 3. What are all the unique cities where the traders work?
				System.out.println("3.What are all the unique cities --> " + getUniqueCities() );
		// 4. Find all traders from Cambridge and sort them by name desc.
		 		System.out.println("4.Find all traders from Cambridge and sort them by name desc --> "+getTraderByCities("Cambridge",(t1, t2) -> t1.getName().compareTo( t2.getName() ) ));
		// 5. Return a string of all traders’ names sorted alphabetically.
		 		System.out.println("5. Return a string of all traders’ names sorted alphabetically --> "+getStringTrader((s1, s2) -> s1.compareTo(s2)));
		// 6. Are any traders based in Milan?
		 		System.out.println("6.Find all traders from Milan and sort them by name desc --> "+getTraderByCities("Milan",(t1, t2) -> t1.getName().compareTo( t2.getName() ) ));
		// 7. Count the number of traders in Milan.
		 		List<Trader> so7 = getTraderByCities("Milan",(t1, t2) -> t1.getName().compareTo( t2.getName() ) );
		 		System.out.println("7. Count the number of traders in Milan -> "+ so7.size());
		// 8. Print all transactions’ values from the traders living in Cambridge.
		 		System.out.println("8. Print all transactions’ values from the traders living in Cambridge -->"+getValue());
		// 9. What’s the highest value of all the transactions?
		 		System.out.println("9. What’s the highest value of all the transactions? -->"+getHighestValue());
		// 10. Find the transaction with the smallest value.
		 		System.out.println("10. Find the transaction with the smallest value --> "+getSmallestValue());
	}
	
	private static List<Transaction> getTransactionsAndSort(int year, Comparator<Transaction> comparator){
		List<Transaction> result = new ArrayList<>();
		
		for( var t : transactions) {
			if (t.getYear() == year) {
				result.add(t);
			}
		}
		
		result.sort(comparator);
		return result;
	}
	
	private static List<Transaction> getTransactionsbyValue(int value, Comparator<Transaction> comparator){
		List<Transaction> result = new ArrayList<>();
		
		for( var t : transactions) {
			if (t.getValue() > value) {
				result.add(t);
			}
		}
		
		result.sort(comparator);
		return result;
	}
	
	private static List<String> getUniqueCities(){
		List<String> result = new ArrayList<>();
		
		for( var t : transactions) {
			String city = t.getTrader().getCity();
		    if (!result.contains(city)) {
		    	result.add(city);
		    }
		}
		
		return result;
	}
	
	private static List<Trader> getTraderByCities(String prefix, Comparator<Trader> comparator){
		Set<Trader> traderSet = new HashSet<>();
	    
	    for (var t : transactions) {
	        String city = t.getTrader().getCity();
	        if (city.equals(prefix)) {
	            traderSet.add(t.getTrader());
	        }
	    }
	    
	    List<Trader> result = new ArrayList<>(traderSet);
	    result.sort(comparator);
	    return result;
	}
	
	private static List<String> getStringTrader(Comparator<String> comparator) {
	    List<String> result = new ArrayList<>();

	    for (var t : transactions) {
	        String city = t.getTrader().getCity();
	        if (city.equals("Cambridge")) {
	            result.add(t.getTrader().getName());
	        }
	    }

	    result.sort(comparator);
	    return result;
	}
	
	private static List<Integer> getValue() {
	    List<Integer> result = new ArrayList<>();

	    for (var t : transactions) {
	        String city = t.getTrader().getCity();
	        if (city.equals("Cambridge")) {
	            result.add(t.getValue());
	        }
	    }

	    return result;
	}

	private static Integer getHighestValue() {
	    Integer result = 0;
	    Integer max = 0;
	    for (var t : transactions) {
	        if (max < t.getValue()) {
	            max = t.getValue();
	        }
	    }
	    result = max;
	    return result;
	}
	
	private static Integer getSmallestValue() {
	    Integer result = 0;
	    Integer min = transactions.get(0).getValue();
	    for (var t : transactions) {
	        if (min > t.getValue()) {
	            min = t.getValue();
	        }
	    }
	    result = min;
	    return result;
	}
	
	private static void printf(String prefix, List<Transaction> data) {
		System.out.println(prefix + " --> {");
		for (var t: data) {
			System.out.println("   -> " + t);
		}
		System.out.println("}");
	}
}

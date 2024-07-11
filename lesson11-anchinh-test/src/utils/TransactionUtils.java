
// JAVA22 77 (YT)

package utils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


import bean.Trader;
import bean.Transaction;

public class TransactionUtils {
	
	private TransactionUtils() {
	}
	
	public static List<Transaction> getTransactionsByYearAndSort(List<Transaction> transactions, int year, Comparator<Transaction> comparator) {
		List<Transaction> result = new ArrayList<>();
		for (var t : transactions) {
			if (t.getYear() == year) {
				result.add(t);
			}
		}
		result.sort(comparator);
		return result;
	}
	
	public static List<Transaction> getTransactionsByValueAndSort(List<Transaction> transactions, int value, Comparator<Transaction> comparator) {
		List<Transaction> result = new ArrayList<>();
		for (var t : transactions) {
			if (t.getValue() > value) {
				result.add(t);
			}
		}
		result.sort(comparator);
		return result;
	}

	// 3
	public static Set<String> getUniqueCities(List<Transaction> transactions) {
		Set<String> result = new HashSet<>();
		
		for (Transaction transaction : transactions) {
			result.add(transaction.getTraderCity());
		}
		return result;
	}
	
	// 4. Find all traders from Cambridge and sort them by name desc.
//	public static List<Trader> getTradersByCityAndSort(List<Transaction> transactions, String city, Comparator<Trader> comparator) {
//		List<Trader> result = new ArrayList<>(); // trả về list Trader
//		for (var t : transactions) { 
//			if (city!= null && city.equals(t.getTraderCity())) {
//				result.add(t.getTrader());
//			}
//		}
//		result.sort(comparator);
//		return result;
//	}
	
	// 4. Find all traders from Cambridge and sort them by name desc.
	/// --> chuyển qua dùng Set để lấy ra kết quả không bị trùng tên (nhưng mà phải @Override lại hàm equals để ko trùng địa chỉ)
	public static Set<Trader> getTradersByCityAndSort(List<Transaction> transactions, String city, Comparator<Trader> comparator) {
		Set<Trader> result = new TreeSet<>(comparator); // trả về list Trader(TreeSet sẽ sắp xếp theo thứ tự)
		for (var t : transactions) { 
			if (city!= null && city.equals(t.getTraderCity())) {
				result.add(t.getTrader());
			}
		}
//		result.sort();  Set ko có sort
		return result;
	}
	
	// 5. Return a string of all traders’ names sorted alphabetically.
	public static String getUniqueName(List<Transaction> transactions) {
		Set<String> result = new TreeSet<>(); // trả về list Trader(TreeSet sẽ sắp xếp theo thứ tự)
		for (var t : transactions) { 
				result.add(t.getTraderName());
			}	
		return String.join(", ", result);
	}
	
	// 6
	public static boolean anyTraderBasedIn(List<Transaction> transactions, String city) {
		for(var t: transactions) {
			if(city!= null && city.equals(t.getTraderCity())){
				return true;
			}
		}
		return false;
	}
	
	// 7. Count the number of traders in Milan.
	public static int countNumberOfTraders(List<Transaction> transactions, String city) {
		Set<Trader> nums = new HashSet<>();
		for(var t : transactions) {
			if(city!= null && city.equals(t.getTraderCity())) {
				nums.add(t.getTrader());
			}
		}
		return nums.size();
		
	}
	
	// 8. Print all transactions’ values from the traders living in Cambridge.
	public static Set<Integer> getTransactionValues(List<Transaction> transactions, String city) {
		Set<Integer> values = new TreeSet<>();
		for(var t : transactions) {
			if(city!= null && city.equals(t.getTraderCity())) {
				values.add(t.getValue());
			}
		}	
		return values;
	}

	// 9. What’s the highest value of all the transactions?
	public static int getHighestValue(List<Transaction> transactions) {
		int highestValue = Integer.MIN_VALUE;
		for(var t:transactions) {
			int value = t.getValue();
			if(value > highestValue) {
				highestValue = value;
			}
		}
		return highestValue;
	}
	
	// 10. Find the transaction with the smallest value.
	public static Transaction getSmallestValue(List<Transaction> transactions) {
		Transaction smallestVal = null;
		for(var t : transactions) {
			// gán cho phần tử đầu tiên 
			if(smallestVal == null) {
				smallestVal = t;
				continue;
			}
			// sau đó kiểm tra điều kiện
			if(t.getValue() < smallestVal.getValue()) {
				smallestVal = t;
			}
		}
		return smallestVal;
	}
}

package view;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import bean.Trader;
import bean.Transaction;
import model.DataModel;
import static utils.TransactionUtils.*;
public class TransactionApp {
	
	private static List<Transaction> transactions = DataModel.getTransactions();
	
	public static void main(String[] args) {
		
		// 1. Find all transactions in the year 2011 and sort them by value (small to high).
		printf(
				"1. Find all transactions in the year 2011 and sort them by value (small to high)",
				getTransactionsAndSort(2011, (t1, t2) -> t1.getValue() - t2.getValue())
			);
		
		// 2. Find all transactions have value greater than 300 and sort them by trader’s city
		printf("2. Find all transactions have value greater than 300 and sort them by trader’s city", 
				getTransantionsByValueAndCity(300, (t1, t2) -> t1.getTrader().getCity().compareTo(t2.getTrader().getCity()))
				);
		
		// 3. What are all the unique cities where the traders work?
		System.out.println("3. What are all the unique cities where the traders work --> " + getUniqueCities(transactions));
		
		// 4. Find all traders from Cambridge and sort them by name desc.
		System.out.println("4. Find all traders from Cambridge and sort them by name desc.");
		System.out.println(getTradersFromCambridgeAndSort(transactions, (t1, t2) -> t1.getName().compareTo(t2.getName())));
		
		// 5. Return a string of all traders’ names sorted alphabetically.
		System.out.println("5. Return a string of all traders’ names sorted alphabetically. ");
		System.out.println(getAllTradersNamesSorted(transactions, null));
		
		// 6. Are any traders based in Milan?
		System.out.println("6. Are any traders based in Milan? -> " + tradersInMilan(transactions));
		
		// 7. Count the number of traders in Milan.
		System.out.println("7. Count the number of traders in Milan = "
				+ countTradersInMilan(transactions));
		
		// 8. Print all transactions’ values from the traders living in Cambridge.
		printf("8. Print all transactions’ values from the traders living in Cambridge.", 
				getTransactionsByCity("Cambridge")
				);
		
		// 9. What’s the highest value of all the transactions?
		System.out.println("9. The highest value of all the transactions = " 
		+ getHighestTransactionValue(transactions));
		
		// 10. Find the transaction with the smallest value.
		System.out.println("10. Find the transaction with the smallest value:"); 
		System.out.println(getTransactionWithSmallestValue(transactions));
								
	}
	//1.
	private static List<Transaction> getTransactionsAndSort(int year, Comparator<Transaction> comparator){
		List<Transaction> result = new ArrayList<>();
		
		for (var t: transactions) {
			if (t.getYear() == year) {
				result.add(t);
			}
		}
		result.sort(comparator);
		return result;
	}
	//2.
	private static List<Transaction> getTransantionsByValueAndCity(int value, Comparator<Transaction> comparator){
		List<Transaction> result = new ArrayList<>();
		for (var t: transactions) {
			if (t.getValue() > 300) {
				result.add(t);
			}
		}
		result.sort(comparator);
		return result;
	}
	//3
	 private static Set<String> getUniqueCities(List<Transaction> transactions) {
		 
	     Set<String> cities = new HashSet<>();
	     for (var t : transactions) {
	         cities.add(t.getTrader().getCity());
	     }
	     return cities;
	 }
	 //4
	 private static List<Trader> getTradersFromCambridgeAndSort(List<Transaction> transactions, Comparator<? super Trader> comparator) {
		 Set<Trader> traders = new HashSet<>();
		 for (Transaction t : transactions) {
			 if ("Cambridge".equals(t.getTrader().getCity())) {
	                traders.add(t.getTrader());
	         }	         
	     }
		 List<Trader> traderList = new ArrayList<>(traders);
		 traderList.sort(comparator);
		 return traderList;
	 }
	 //5
	 private static List<String> getAllTradersNamesSorted(List<Transaction> transactions, Comparator<String> comparator) {
		 
	     Set<String> traderNames = new HashSet<>();
	     for (var t : transactions) {
	         traderNames.add(t.getTrader().getName());
	     }
	     List<String> sortedNames = new ArrayList<>(traderNames);
	     sortedNames.sort(comparator);
	     return sortedNames;
	 }
	 //6.
	 private static boolean tradersInMilan(List<Transaction> transactions){
		 List<Transaction> result = new ArrayList<>();
		
		 for (var t: transactions) {
			 if ("Milan".equals(t.getTrader().getCity())) {
				 return true;	
			 }
		 } 
		 return false;	
	 }
	 //7
     private static int countTradersInMilan(List<Transaction> transactions) {
    	 
         Set<Trader> tradersInMilan = new HashSet<>();
         for (var t : transactions) {
             if ("Milan".equals(t.getTrader().getCity())) {
                 tradersInMilan.add(t.getTrader());
             }
         }
         return tradersInMilan.size();
     }
	 //8.
	 private static List<Transaction> getTransactionsByCity(String city){
		 List<Transaction> result = new ArrayList<>();
		
		 for (var t: transactions) {
			 if (t.getTrader().getCity() == city) {
				 result.add(t);
			 }
		 }
		 return result;
	 }
	 //9
     private static int getHighestTransactionValue(List<Transaction> transactions) {
         int highestValue = Integer.MIN_VALUE;
         for (Transaction t : transactions) {
            if (t.getValue() > highestValue) {
                 highestValue = t.getValue();
             }
         }
         return highestValue;
     }
     //10
     private static Transaction getTransactionWithSmallestValue(List<Transaction> transactions) {
    	 
    	 Transaction smallestTransaction = null;
         int smallestValue = Integer.MAX_VALUE;
         for (var t : transactions) {
             if (t.getValue() < smallestValue) {
                 smallestValue = t.getValue();
                 smallestTransaction = t;
             }
         }
         return smallestTransaction;
    }
			
	private static void printf(String prefix, List<Transaction> data) {
		
		System.out.println(prefix + " --> {");
		for (var t: data) {
			System.out.println("   -> " + t);
		}
		System.out.println("}");
	}
	

}

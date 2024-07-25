package view;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;
import model.DataModel;

public class TransactionAppUsingStream {

private static List<Transaction> transactions = DataModel.getTransactions();
	
	public static void main(String[] args) {
 		
 		
 		// 1. Find all transactions in the year 2011 and sort them by value (small to high). DONE
		printf(
			"1. Find all transactions in the year 2011 and sort them by value (small to high)",
			transactions.stream().filter(t -> t.getYear() == 2011)
			.sorted(Comparator.comparing(Transaction::getValue))
			.collect(Collectors.toList())
			
		);
		
 		// 2. Find all transactions have value greater than 300 and sort them by trader’s city DONE
		printf(
			    "2. Find all transactions that have value greater than 300 and sort them by trader’s city",
			    transactions.stream()
			        .filter(t -> t.getValue() > 300)
			        .sorted(Comparator.comparing(t -> t.getTrader().getCity()))
			        .collect(Collectors.toList())
			);
		
 		
 		// 3. What are all the unique cities where the traders work? DONE
		System.out.println("3. What are all the unique cities where the traders work?");
			    transactions.stream()
			        .map(t -> t.getTrader().getCity())
			        .distinct()
			        .collect(Collectors.toList())
			        .forEach(System.out::println);
			
 		
 		// 4. Find all traders from Cambridge and sort them by name desc. 	DONE
		printft(
				"4. Find all traders from Cambridge and sort them by name desc.",
				transactions.stream()
		        .map(Transaction::getTrader)
		        .filter(t -> t.getCity() == "Cambridge")
		        .distinct()
		        .sorted(Comparator.comparing(Trader::getName).reversed())
		        .collect(Collectors.toList())
				);
			
 		
 		// 5. Return a string of all traders’ names sorted alphabetically. DONE
		System.out.println("5. Return a string of all traders’ names sorted alphabetically.");
	    String[] result5 = transactions.stream().map(t -> t.getTrader().getName())
	    .distinct()
	    .sorted()
	    .toArray(String[]::new);
	    System.out.println(String.join(",", result5));
	 
		
 		// 6. Are any traders based in Milan?  DONE 
	    int count = (int) transactions.stream()
			    .map(Transaction::getTrader)       
			    .filter(t -> t.getCity() == "Milan") 
			    .distinct()                          
			    .count(); 
	    System.out.println(count > 0 ? "6. There are traders based in Milan." : "There are no traders based in Milan.");

 		
 		// 7. Count the number of traders in Milan. DONE

		
		System.out.println("7. Number of traders in Milan: " + count );
 		
 		// 8. Print all transactions’ values from the traders living in Cambridge. 
		System.out.println("8. Print all transactions’ values from the traders living in Cambridge.");

		  transactions.stream() 
				    .filter(t -> t.getTrader().getCity() == "Cambridge")
				    .map(t -> t.getValue())
				    .distinct()
				    .collect(Collectors.toList())
				    .forEach(System.out::println);
				    
				   
 		
 		// 9. What’s the highest value of all the transactions? DONE
		System.out.println("9. The highest value of all the transactions is: " );
	    var result9 = transactions.stream()
	    		.map(Transaction::getValue)
	    		.collect(Collectors.toList());
		int max = result9.stream().reduce(Integer.MIN_VALUE, Integer::max);
		System.out.println("max --> " + max);
 		
 		// 10. Find the transaction with the smallest value. DONE
		System.out.println("10. Find the transaction with the smallest value:  " );
		 var result10 = transactions.stream()
		    		.map(Transaction::getValue)
		    		.collect(Collectors.toList());
			int min = result9.stream().reduce(Integer.MAX_VALUE, Integer::min);
			System.out.println("min --> " + min);
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

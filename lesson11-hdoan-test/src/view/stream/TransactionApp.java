package view.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import bean.Trader;
import bean.Transaction;
import functional.TraderStrategy;
import functional.TransactionStrategy;
import model.DataModel;

public class TransactionApp {
    
    private static List<Transaction> transactions = DataModel.getTransactions();
    
    public static void main(String[] args) {
        // 1. Find all transactions in the year 2011 and sort them by value (small to high).
        printf(
                "1. Find all transactions in the year 2011 and sort them by value (small to high).",
                transactions.stream()
                	.filter(t -> t.getYear() == 2011)
                	.sorted(Comparator.comparing(Transaction::getValue))
                	.toList()
        		);
        
        // 2. Find all transactions have value greater than 300 and sort them by trader’s city
        printf(
                "2. Find all transactions have value greater than 300 and sort them by trader’s city",
                transactions.stream()
                	.filter(t -> t.getValue() > 300)
                	.sorted(Comparator.comparing(t -> t.getTrader().getCity()))
                	.toList()
        	  );
        
        // 3. What are all the unique cities where the traders work?
        printf("Unique cities where traders work:",
        		transactions.stream()
        			.map(t -> t.getTrader().getCity())
        			.distinct()
        			.toList()
        	  );
        
        // 4. Find all traders from Cambridge and sort them by name desc.
        printf(
                "4. Find all traders from Cambridge and sort them by name desc.",
                transactions.stream()
				.filter(t->t.getTrader().getCity()=="Cambridge")
				.map((t)->t.getTrader())
				.sorted(Comparator.comparing(Trader::getName).reversed())
				.distinct()
				.toList()
			 );
        
        // 5. Return a string of all traders’ names sorted alphabetically.
        System.out.println("5. Return a string of all traders’ names sorted alphabetically.");
        String[] listTraderName = transactions.stream()
        			.map(t -> t.getTrader().getName())
        			.sorted()
        			.distinct()
        			.toArray(String[]::new);
        System.out.println(String.join(", ", listTraderName));
        
        // 6. Are any traders based in Milan?
        System.out.print("6. Are any traders based in Milan? ");
        List<Trader> isTraderAtMilan = transactions.stream()
				.map(t -> t.getTrader())
				.filter(t->t.getCity()=="Milan")
				.distinct()
				.toList();
        
        System.out.println(isTraderAtMilan.size() > 0 ? true : false);
        
        // 7. Count the number of traders in Milan.
        System.out.print("7. Count the number of traders in Milan. ");
        // System.out.println(quantity.size());
        int quantity = (int)transactions.stream()
				.map(t -> t.getTrader())
				.filter(t->t.getCity()== "Milan")
				.distinct()
				.count();
		System.out.println(quantity);
        // 8. Print all transactions’ values from the traders living in Cambridge.
        printf("Print all transactions’ values from the traders living in Cambridge.", 
        		transactions.stream()
        			.filter(t -> t.getTrader().getCity() == "Cambridge")
        			.map(t -> t.getValue())
        			.distinct()
        			.toList());
        
        // 9. What’s the highest value of all the transactions?
        System.out.print("9. What’s the highest value of all the transactions? ");
        var result = transactions.stream()
    		   			.map(Transaction::getValue)
    		   			.toList();
        int max = result.stream()
    		   		.reduce(Integer.MIN_VALUE, Integer::max);
   	    System.out.println("max --> " + max);

        // 10. Find the transaction with the smallest value.
   	    System.out.println("10. Find the transaction with the smallest value:  " );
   	    var result10 = transactions.stream()
	    		.map(Transaction::getValue)
	    		.toList();
		int min = result.stream().reduce(Integer.MAX_VALUE, Integer::min);
		System.out.println("min --> " + min);
    }
    
    private static List<Integer> getValueTransaction(TransactionStrategy con, Comparator<Integer> comparator) {
        List<Integer> result = new ArrayList<>();
        for (var t : transactions) {
            if (con.test(t)) {
                result.add(t.getValue());
            }
        }
        result.sort(comparator);
        return result;
    }
    
    private static List<Trader> getTradersFromCambridgeSortedByNameDesc(List<Transaction> transactions, TraderStrategy strategy, Comparator<Trader> comparator) {
        Set<Trader> traders = new HashSet<>();
        for (var t : transactions) {
            if (strategy.test(t.getTrader())) {
                traders.add(t.getTrader());
            }
        }
        List<Trader> traderList = new ArrayList<>(traders);
        traderList.sort(comparator);
        return traderList;
    }

    private static List<String> getNameTraders(Comparator<String> comparator) {
        Set<String> traderNames = new HashSet<>();
        for (var t : transactions) {
            traderNames.add(t.getTrader().getName());
        }
        List<String> traderNameList = new ArrayList<>(traderNames);
        traderNameList.sort(comparator);
        return traderNameList;
    }
    
    private static Set<String> getUniqueCities(List<Transaction> transactions){
        Set<String> uniqueCities = new HashSet<>();
        for (var t : transactions) {
            uniqueCities.add(t.getTrader().getCity());
        }
        return uniqueCities;
    }
    
    private static List<Transaction> getTransactionsAndSort(TransactionStrategy strategy, Comparator<Transaction> comparator){
        List<Transaction> result = new ArrayList<>();
        for (var t : transactions) {
            if (strategy.test(t)) {
                result.add(t);
            }    
        }
        result.sort(comparator);
        return result;
    }
    
    private static void printf(String prefix, List<?> data) {
        System.out.println(prefix + " --> {");
        for (var t : data) {
            System.out.println(" --> " + t);
        }
        System.out.println("}");
    }
}

package view;

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
                getTransactionsAndSort(t -> t.getYear() == 2011, Comparator.comparingInt(Transaction::getValue)));
        
        // 2. Find all transactions have value greater than 300 and sort them by trader’s city
        printf(
                "2. Find all transactions have value greater than 300 and sort them by trader’s city",
                getTransactionsAndSort(t -> t.getValue() > 300, Comparator.comparing(t -> t.getTrader().getCity())));
        
        // 3. What are all the unique cities where the traders work?
        System.out.println("3. Unique cities where traders work: " + getUniqueCities(transactions));
        
        // 4. Find all traders from Cambridge and sort them by name desc.
        printf(
                "4. Find all traders from Cambridge and sort them by name desc.",
                getTradersFromCambridgeSortedByNameDesc(transactions,
                        trader -> trader.getCity().equals("Cambridge"),
                        (t1, t2) -> t2.getName().compareTo(t1.getName()))
                );
        
        // 5. Return a string of all traders’ names sorted alphabetically.
        System.out.println("5. Return a string of all traders’ names sorted alphabetically.");
        List<String> listTraderName = getNameTraders((t1, t2) -> t1.compareTo(t2));
        System.out.println(String.join(", ", listTraderName));
        
        // 6. Are any traders based in Milan?
        System.out.print("6. Are any traders based in Milan? ");
        List<Transaction> quantity = getTransactionsAndSort(
                t -> t.getTrader().getCity().equals("Milan"),
                Comparator.comparing(t -> t.getTrader().getCity()));
        System.out.println(quantity.size() > 0 ? true : false);
        
        // 7. Count the number of traders in Milan.
        System.out.print("7. Count the number of traders in Milan. ");
        System.out.println(quantity.size());
        
        // 8. Print all transactions’ values from the traders living in Cambridge.
        System.out.print("8. Print all transactions’ values from the traders living in Cambridge. ");
        List<Transaction> cambridgeTransactions = getTransactionsAndSort(
                t -> t.getTrader().getCity().equals("Cambridge"),
                Comparator.comparingInt(t -> t.getValue()));
        cambridgeTransactions.forEach(t -> System.out.println(t.getValue()));
        
        // 9. What’s the highest value of all the transactions?
        System.out.print("9. What’s the highest value of all the transactions? ");
        System.out.println(getValueTransaction(
                t -> true,
                Comparator.reverseOrder()).get(0));

        // 10. Find the transaction with the smallest value.
        System.out.print("10. Find the transaction with the smallest value. ");
        System.out.println(getValueTransaction(
                t -> true,
                Comparator.naturalOrder()).get(0));
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

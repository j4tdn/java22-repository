package model;

import java.util.Arrays;
import java.util.List;

import bean.Trader;
import bean.Transaction;

public class DataModel {
	
	private DataModel() {
	}
	
	public static List<Transaction> getTransactions() {
		Trader raoul = new Trader("Raoul", "Cambridge"); // H1
		Trader mario = new Trader("Mario", "Milan");     // H2
		Trader alan = new Trader("Alan", "Cambridge");   // H3
		Trader brian = new Trader("Brian", "Cambridge"); // H4
		
		List<Transaction> transactions = Arrays.asList(
			new Transaction(raoul, 2012, 1000), 
			new Transaction(raoul, 2011, 400),
			new Transaction(brian, 2011, 300),
			new Transaction(mario, 2012, 710),
			new Transaction(mario, 2012, 700), 
			new Transaction(alan, 2012, 950)
		);
		
		return transactions;
	}
	
}

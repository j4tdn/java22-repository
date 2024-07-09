package model;

import java.util.Arrays;
import java.util.List;

import bean.Trader;
import bean.Transaction;

public class DataModel {
	
	private DataModel() {
	}
	
	public static List<Transaction> getTransactions() {
		Trader raoul_1 = new Trader("Raoul", "Cambridge");
		Trader raoul_2 = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader lilia = new Trader("Lilia", "Milan");
		Trader brian = new Trader("Brian", "Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
			new Transaction(brian, 2011, 300),
			new Transaction(raoul_1, 2012, 1000), 
			new Transaction(raoul_2, 2011, 400),
			new Transaction(mario, 2012, 710),
			new Transaction(mario, 2011, 700), 
			new Transaction(lilia, 2012, 750), 
			new Transaction(alan, 2011, 950)
		);
		
		return transactions;
	}
	
}
package functional;

import bean.Trader;

@FunctionalInterface
public interface TraderStrategy {

	boolean test(Trader trader);
	
}

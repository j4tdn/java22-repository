package view;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Map;

import bean.Item;
import bean.Store;
import exception.CalculationException;
import processor.FillingGapProcessor;
import validation.MinPlanningAmountValidator;

import static model.DataModel.*;
import static utils.StreamUtils.*;

public class WhAllocationDemo {
	
	public static void main(String[] args) {
		// use data from DataModel
		
		// do calculation
		try {
			doCalculation();
		} catch (CalculationException e) {
			e.printStackTrace();
		}
		
		// print result step by step
		
	}
	
	private static void doCalculation() throws CalculationException {
		System.out.println(">> Step 1: Check for planning amount");
		MinPlanningAmountValidator.prepare()
				.withPlanningAmount(88L)
				.withRequiredMinPlanningAmount(55L)
				.validate();
		System.out.println(">> Passed validation");
		
		final var refItemA55Stores = mockStoresOfRefItemA55().get(new Item(55, "Item A55"));
		final var refItemA77Stores = mockStoresOfRefItemA77().get(new Item(77, "Item A77"));
		Map<Integer, Map<Integer, BigDecimal>> itemStoresPotentials = Map.of(
				55, toMap(refItemA55Stores, Store::getId, Store::getPotential),
				77, toMap(refItemA77Stores, Store::getId, Store::getPotential)
		);
		
		System.out.println("\n>> Step 2: Filling gaps by references or average");
		final var interpolatedItemStorePotentials = FillingGapProcessor.preapre()
			.withRefStores(mockRefStores())
			.withItemStorePotentials(itemStoresPotentials)
			.process();
		
		interpolatedItemStorePotentials.get(77)
			.forEach((k, v) -> System.out.println(v));
	}
}

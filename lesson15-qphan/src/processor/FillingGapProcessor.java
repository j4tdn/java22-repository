package processor;

import static utils.NumberUtils.calcAverage;
import static utils.NumberUtils.isNullOrZero;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class FillingGapProcessor implements Processor<Map<Integer, Map<Integer, BigDecimal>>> {
	
	// K: ItemId(Reference)
	// V: Map<StoreId, StorePotential>
	private Map<Integer, Map<Integer, BigDecimal>> itemStorePotentials;
	private Map<Integer, Integer> refStores;
	
	private FillingGapProcessor() {
	}
	
	public static FillingGapProcessor preapre() {
		return new FillingGapProcessor();
	}
	
	public FillingGapProcessor withItemStorePotentials(Map<Integer, Map<Integer, BigDecimal>> itemStorePotentials) {
		this.itemStorePotentials = itemStorePotentials;
		return this;
	}
	
	public FillingGapProcessor withRefStores(Map<Integer, Integer> refStores) {
		this.refStores = refStores;
		return this;
	}
	
	@Override
	public Map<Integer, Map<Integer, BigDecimal>> process() {
		final Map<Integer, Map<Integer, BigDecimal>> result = new LinkedHashMap<>();
		
		itemStorePotentials.forEach((itemId, storePotentials) -> {
			Map<Integer, BigDecimal> interpolatedStorePotentials = new LinkedHashMap<>();
			
			BigDecimal avgStorePotential = calcAverage(storePotentials.entrySet(), Entry::getValue)
					.setScale(1, RoundingMode.HALF_UP);
					
			BigDecimal interpolatedStorePotential = null;
			
			for(var entry: storePotentials.entrySet()) {
				var storeId = entry.getKey();
				var storePotential = entry.getValue();
				
				if (isNullOrZero(storePotential)) {
					var refStoreId = refStores.get(storeId);
					if (refStoreId != null) {
						var refStorePotential = storePotentials.get(refStoreId);
						if (refStorePotential != null) {
							interpolatedStorePotential = refStorePotential.setScale(1, RoundingMode.HALF_UP);
							System.out.printf("Filling gap for store %s by potential of ref store %s = %s\n", storeId, refStoreId, interpolatedStorePotential);
						} else {
							interpolatedStorePotential = avgStorePotential.setScale(1, RoundingMode.HALF_UP);
							System.out.printf("Filling gap for store %s by average = %s\n", storeId, interpolatedStorePotential);
						}
					} else {
						interpolatedStorePotential = avgStorePotential;
						System.out.printf("Filling gap for store %s by average = %s\n", storeId, interpolatedStorePotential);
					}
				} else {
					interpolatedStorePotential = storePotential.setScale(1, RoundingMode.HALF_UP);
				}
				interpolatedStorePotentials.put(storeId, interpolatedStorePotential);
			}
			
			result.put(itemId, interpolatedStorePotentials);
		});
		return result;
	}
	
}

package view;

import bean.Item;
import bean.Store;
import model.DataModel;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WhAllocationDemo {

	public static void main(String[] args) {
			// Step 1: Check for Planning Amount
		boolean shouldContinue = checkPlanningAmount(DataModel.planningAmount, DataModel.requiredMinPlanningAmount);
		if (shouldContinue) {
			// Step 2: Filling gaps by references or average
			System.out.println("Step 2!!");
			Map<Integer, Integer> refStores = DataModel.mockRefStores();
			List<Store> storesA77 = DataModel.mockStoresOfRefItemA77().get(new Item(77, "Item A77"));
			fillPotentialGaps(storesA77, refStores);
			storesA77.forEach(System.out::println);

			// Step 3: Calculate Store Demand of current Item(Item A1)
			System.out.println("Step 3!!");
			Map<Item, List<Store>> storePotentialA55 = DataModel.mockStoresOfRefItemA55();
			Map<Item, List<Store>> storePotentialA77 = DataModel.mockStoresOfRefItemA77();
			Map<Integer, BigDecimal> refWeights = DataModel.mockRefWeights();

			calculateStoreDemand(storePotentialA55.get(new Item(55, "Item A55")), storesA77, refWeights);

			// Step 4: Sum up Demand to WH Level 
			System.out.println("Step 4!!");
			Map<Integer, BigDecimal> whDemand = sumUpDemandToWH(storesA77);
			whDemand.forEach((whId, demand) -> System.out.println("WH " + whId + ": " + demand));

			// Step 5: Calculate Shares
			System.out.println("Step 5!!");
			calculateShares(whDemand);
		} else {
			System.out.println("Step 1 failed. Stop calculation.");
		}
	}

	private static boolean checkPlanningAmount(int planningAmount, int requiredMinPlanningAmount) {
		return planningAmount > requiredMinPlanningAmount;

	}

	private static void fillPotentialGaps(List<Store> stores, Map<Integer, Integer> refStores) {
		BigDecimal averagePotential = calculateAveragePotential(stores);

		for (Store store : stores) {
			if (store.getPotential().compareTo(BigDecimal.ZERO) == 0) {
				Integer refStoreId = refStores.get(store.getId());
				if (refStoreId != null) {
					Store refStore = stores.stream().filter(s -> s.getId().equals(refStoreId)).findFirst().orElse(null);
					if (refStore != null && refStore.getPotential().compareTo(BigDecimal.ZERO) > 0) {
						store.setPotential(refStore.getPotential());
					} else {
						store.setPotential(averagePotential);
					}
				} else {
					store.setPotential(averagePotential);
				}
			}
		}
	}

	private static BigDecimal calculateAveragePotential(List<Store> stores) {
		BigDecimal totalPotential = BigDecimal.ZERO;
		int count = 0;

		for (Store store : stores) {
			if (store.getPotential().compareTo(BigDecimal.ZERO) > 0) {
				totalPotential = totalPotential.add(store.getPotential());
				count++;
			}
		}

		return count > 0 ? totalPotential.divide(BigDecimal.valueOf(count), 1, RoundingMode.HALF_UP) : BigDecimal.ZERO;
	}

	private static void calculateStoreDemand(List<Store> storesA55, List<Store> storesA77,
			Map<Integer, BigDecimal> refWeights) {
		for (int i = 0; i < storesA55.size(); i++) {
			Store storeA55 = storesA55.get(i);
			Store storeA77 = storesA77.get(i);

			BigDecimal potentialA55 = storeA55.getPotential();
			BigDecimal potentialA77 = storeA77.getPotential();
			BigDecimal weightA55 = refWeights.getOrDefault(55, BigDecimal.ONE);
			BigDecimal weightA77 = refWeights.getOrDefault(77, BigDecimal.ONE);
			BigDecimal storeTrend = storeA77.getStoreTrend() != null ? storeA77.getStoreTrend() : BigDecimal.ONE;

			BigDecimal demand = (potentialA55.multiply(weightA55).add(potentialA77.multiply(weightA77)))
					.divide(weightA55.add(weightA77), RoundingMode.HALF_UP).multiply(storeTrend);

			storeA77.setPotential(demand);
			System.out.println("Store " + storeA77.getId() + " Demand: " + demand);
		}
	}

	private static Map<Integer, BigDecimal> sumUpDemandToWH(List<Store> stores) {
		return stores.stream().collect(Collectors.groupingBy(Store::getWhId,
				Collectors.reducing(BigDecimal.ZERO, Store::getPotential, BigDecimal::add)));
	}

	private static void calculateShares(Map<Integer, BigDecimal> whDemand) {
		BigDecimal totalDemand = whDemand.values().stream().reduce(BigDecimal.ZERO, BigDecimal::add);

		if (totalDemand.compareTo(BigDecimal.ZERO) > 0) {
			whDemand.forEach((whId, demand) -> {
				BigDecimal share = demand.multiply(BigDecimal.valueOf(100)).divide(totalDemand, RoundingMode.HALF_UP);
				System.out.println("WH " + whId + " Share: " + share + "%");
			});
		}
	}
}
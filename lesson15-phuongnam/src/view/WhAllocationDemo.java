package view;

import static model.DataModel.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import static utils.NumberUtils.*;
import bean.Item;
import bean.Store;
import model.DataModel;

public class WhAllocationDemo {
	
	public static void main(String[] args) {
		
		// use data from DataModel
		
		// do calculation
		
		// print result step by step
		
		
		if (planningAmount <= requiredMinPlanningAmount) {
			
			System.err.println("hihi");
		}
		
		else {
			
			System.out.println();
			
			
			mockStoresOfRefItemA55();
			
			Map<Item, List<Store>> result = DataModel.mockStoresOfRefItemA77();
			
			 
			List<Store> storeList = result.values().iterator().next();
			
			ArrayList<Store> storeArrayList = new ArrayList<>(storeList);
			
			System.out.println(storeArrayList);
			
			 Map<Item, List<Store>> r = DataModel.mockStoresOfRefItemA55();
			 List<Store> storeHaveRefButNoPotential = new ArrayList<>();
			 
			 List<Store> storeHaveRefThatHasPotential = new ArrayList<Store>();
			 
			 Map<Integer, String> storeHaveNoPotential = new TreeMap<>(); // 10 và 12
			 
//			 List<Store> storeHaveRefThatHasExpectedSales = new ArrayList<>();
			 
			 for (Map.Entry<Item, List<Store>> entry : result.entrySet()) {
		            Item item = entry.getKey();
		            List<Store> stores = entry.getValue();

		            // In thông tin của Item
		            System.out.println("Item: " + item);

		            // In thông tin của từng Store trong danh sách
		            System.out.println("Stores:");
		            for (Store store : stores) {
		                if (store.getPotential().compareTo(BigDecimal.ZERO) ==0 ) {
		                	storeHaveNoPotential.put(store.getId(), store.getDesc());
		                }
		            }
		        }
			 
			 
			 
			 
			 Map<Integer, Integer> refStores = DataModel.mockRefStores();
			 Map<Integer, Integer> listOfReferenceStore = new TreeMap<>();
			 
			 System.out.println("Reference Stores:");
		        for (Map.Entry<Integer, Integer> entry : refStores.entrySet()) {
		            Integer storeId = entry.getKey();
		            Integer referenceStoreId = entry.getValue();
		            
		            // In thông tin từng store và reference store
		            System.out.println("Store " + storeId + " has Reference Store " + referenceStoreId);
		            listOfReferenceStore.put(entry.getKey(), entry.getValue());
		        }
		        
		        
		        System.out.println(listOfReferenceStore);
		        
		        
		        
		        for (Integer key : listOfReferenceStore.keySet()) {
		            if (storeHaveNoPotential.containsKey(key)) {
		                System.out.println("Key " + key + " exist");
		            } else {
		                System.out.println("Key " + key + " does not exist");
		            }
		        }
		        
		        for (Store sto : storeArrayList) {
		        	if (sto.getPotential().compareTo(BigDecimal.ZERO) == 0) {
		        		if (listOfReferenceStore.containsKey(sto.getId())) {
		        			System.out.println(sto.getId() + "có ");
		        			
		        			int refId = listOfReferenceStore.get(sto.getId());  //id của reference store là 1
		        			for (Store st : storeArrayList) {
		        				if (st.getId().equals(refId)) {
//		        					System.out.println(st.getDesc() + "hi");
		        					
		        					BigDecimal i = st.getPotential();
		        					sto.setPotential(i);
		        				}
		        			}
		        			
		        		}
		        	}
		        }
		        
		        
		        storeArrayList.stream().forEach(System.out::println);
		}
		
		
	}
	
}

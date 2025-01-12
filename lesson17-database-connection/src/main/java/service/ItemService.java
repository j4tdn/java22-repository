package service;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import persistence.Item;

public interface ItemService {

	List<Item> getAll();
	
	List<Item> getItems(LocalDate saleDate);
}

package dao;

import java.time.LocalDate;
import java.util.List;

import persistence.dto.ItemDto;
import persistence.dto.ItemGroupDto;

public interface ItemDao {

	List<ItemDto> getItemBySalesDate(LocalDate date);
	
	List<ItemGroupDto> getItemsOfItemGroup();
}

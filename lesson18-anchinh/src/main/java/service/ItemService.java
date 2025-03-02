package service;

import java.time.LocalDate;
import java.util.List;

import persistence.dto.ItemDto;

public interface ItemService {

	List<ItemDto> getItemBySalesDate(LocalDate date);
}

package service;

import java.util.List;

import persistence.dto.ItemDateDto;

public interface ItemService {
	
	List<ItemDateDto> getItemsByCreatedTime(String createdTime);

}

package dao;

import java.util.List;

import persistence.dto.ItemDateDto;

public interface ItemDao {
	
	List<ItemDateDto> getItemsByCreatedTime(String createdTime);
	
}

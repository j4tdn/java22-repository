package service;

import java.util.List;
import java.util.Set;

import persistence.ItemGroup;
import persistence.dto.ItemGroupDto;

public interface ItemGroupService {

	List<ItemGroupDto> statisticItemGroupDetails();
	
}
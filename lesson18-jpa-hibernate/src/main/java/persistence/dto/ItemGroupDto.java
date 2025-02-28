package persistence.dto;

import java.util.Objects;

public class ItemGroupDto {
	
	public static String PROP_ID = "id";
	public static String PROP_NAME = "name";
	public static String PROP_AMOUNT_OF_ITEMS = "amountOfItems";
	public static String PROP_DETAILS = "details";
	
	private Integer id;
	private String name;
	private Integer amountOfItems;
	private String details;
	
	public ItemGroupDto() {
	}

	public ItemGroupDto(Integer id, String name, Integer amountOfItems, String details) {
		this.id = id;
		this.name = name;
		this.amountOfItems = amountOfItems;
		this.details = details;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAmountOfItems() {
		return amountOfItems;
	}

	public void setAmountOfItems(Integer amountOfItems) {
		this.amountOfItems = amountOfItems;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (!(o instanceof ItemGroupDto that)) {
			return false;
		}

		return getId() == that.getId();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}
	
	@Override
	public String toString() {
		return "ItemGroupDto [id=" + id + ", name=" + name + ", amountOfItems=" + amountOfItems + ", details="
				+ details + "]";
	}
	
}

package persistence.dto;

import java.util.Objects;

public class ItemDto {

	public static String PROP_ID = "id";
	public static String PROP_NAME = "name";
	public static String PROP_CREATED_AT = "created_time";

	private Integer id;
	private String name;
	private String created_time;
	
	public ItemDto() {
	}
	
	public ItemDto(Integer id, String name, String created_time) {
		this.id = id;
		this.name = name;
		this.created_time = created_time;
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
	public String getCreated_time() {
		return created_time;
	}
	public void setCreated_time(String created_time) {
		this.created_time = created_time;
	}
	
	public static String getPROP_ID() {
		return PROP_ID;
	}

	public static void setPROP_ID(String pROP_ID) {
		PROP_ID = pROP_ID;
	}

	public static String getPROP_NAME() {
		return PROP_NAME;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (!(o instanceof ItemDto that)) {
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
		return "ItemDto [id=" + id + ", name=" + name + ", created_time=" + created_time + "]";
	}
	
}

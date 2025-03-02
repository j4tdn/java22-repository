package persistence.dto;

public class ItemDto {
	public static final String PROP_ID = "id";
    public static final String PROP_NAME = "name";
    public static final String PROP_CREATED_TIME = "createdTime";
    public static final String PROP_TOTAL_QUANTITY = "totalQuantity";
    
    private Integer id;
    private String name;
    private String createdTime;
    private Integer totalQuantity;

    public ItemDto() {
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

    public String getOrderTime() {
        return createdTime;
    }

    public void setOrderTime(String createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public String toString() {
        return "ItemDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createdTime='" + createdTime + '\'' +
                '}';
    }

	public Integer getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(Integer totalQuantity) {
		this.totalQuantity = totalQuantity;
	}
}

package persistence.dto;

import java.util.Objects;

public class ItemDto {
    
    public static String PROP_ID = "id";
    public static String PROP_NAME = "name";
    public static String PROP_CREATED_TIME = "createdtime";
    
    private Integer id;
    private String name;
    private String createdtime;
    
    public ItemDto() {
    }

    public ItemDto(Integer id, String name, String createdtime) {
        this.id = id;
        this.name = name;
        this.createdtime = createdtime;
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

    public String getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(String createdtime) {
        this.createdtime = createdtime;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof ItemDto that)) {
            return false;
        }

        return Objects.equals(getId(), that.getId());
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
    
    @Override
    public String toString() {
        return "ItemDto [id=" + id + ", name=" + name + ", createdtime=" + createdtime + "]";
    }
    
}

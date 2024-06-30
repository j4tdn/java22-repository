package bean;

import java.util.Objects;

public class ItemGroup {
	private Integer id;
	private String name;
	
	public ItemGroup() {
		
	}

	public ItemGroup(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof ItemGroup)) {
			return false;
		}
		ItemGroup that = (ItemGroup)o;
		return getId() == that.getId();
	}
	
	@Override
	public int hashCode() {
		// khi override, hashcode ko còn là địa chỉ
		// trở thành công thức để hashing giá trí
		
		// text
		return Objects.hash(getId());
	}

	@Override
	public String toString() {
		return "ItemGroup [id=" + id + ", name=" + name + "]";
	}
	

}

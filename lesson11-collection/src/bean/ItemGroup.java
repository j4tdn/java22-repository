package bean;

import java.util.Objects;

public class ItemGroup {
	
	private Integer id;
	private String name;
	
	public ItemGroup() {
	}

	public ItemGroup(Integer id, String name) {
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
		if(this == o ) {
			return true;
			
		}
		if(!( o instanceof ItemGroup)) {
			return false;
		}
		
		ItemGroup that = (ItemGroup)o;
		return getId() == that.getId();
	}
	@Override
	public int hashCode() {
		// khi override, hashcode ko còn là địa chỉ
		// mà trở thành 1 công thức để hashing giá trị(mã hóa)
		return Objects.hash(getId());
	}

	@Override
	public String toString() {
		return "ItemGroup [id=" + id + ", name=" + name + "]";
	}

}

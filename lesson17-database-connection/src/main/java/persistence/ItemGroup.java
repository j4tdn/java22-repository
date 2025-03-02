package persistence;

<<<<<<< HEAD
=======
import java.util.List;
>>>>>>> 9890bad (lesson18 02.03.2025)
import java.util.Objects;

public class ItemGroup {
	
	private Integer id;
	private String name;
<<<<<<< HEAD
=======
	private List<Item> items;
>>>>>>> 9890bad (lesson18 02.03.2025)
	
	public ItemGroup() {
	}
	
	public ItemGroup(String name) {
		this.name = name;
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
	
<<<<<<< HEAD
=======
	public List<Item> getItems() {
		return items;
	}
	
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
>>>>>>> 9890bad (lesson18 02.03.2025)
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof ItemGroup that)) {
			return false;
		}
		
		return getId() == that.getId();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}
<<<<<<< HEAD
=======
	
	public void logging() {
		System.out.printf("Group(id=%s, name=%s)\n", getId(), getName());
		System.out.println("------------------------------");
		items.forEach(item -> {
			System.out.printf("    + Item(id=%s, name=%s)\n", item.getId(), item.getName() );
		});
		System.out.println("\n");
	}
>>>>>>> 9890bad (lesson18 02.03.2025)

	@Override
	public String toString() {
		return "ItemGroup [id=" + id + ", name=" + name + "]";
	}
}
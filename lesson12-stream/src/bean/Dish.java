package bean;

import java.util.Objects;

import common.Kind;

public class Dish {
	private String id;
	private String name;
	private Double calories;
	private Kind kind;
	private Boolean vegetarian;
	
	public Dish() {
	}

	public Dish(String id, String name, Double calories, Kind kind, Boolean vegetarian) {
		super();
		this.id = id;
		this.name = name;
		this.calories = calories;
		this.kind = kind;
		this.vegetarian = vegetarian;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getCalories() {
		return calories;
	}

	public void setCalories(Double calories) {
		this.calories = calories;
	}

	public Kind getKind() {
		return kind;
	}

	public void setKind(Kind kind) {
		this.kind = kind;
	}

	public Boolean getVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(Boolean vegetarian) {
		this.vegetarian = vegetarian;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dish other = (Dish) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Dish [id=" + id + ", name=" + name + ", calories=" + calories + ", vegetarian=" + vegetarian + "]";
	}
	
	
}

package bean;

import java.util.Objects;

public class Apple {
	
	private Integer id;
	private String color;
	private Double weight;
	private String origin;
	
	public Apple() {
		System.out.println("Invoked empty constructor");
	}
	
	public Apple(Integer id) {
		this.id = id;
		System.out.println("Invode constructor(id)");
	}
	
	public Apple(Integer id, String color) {
		this.id = id;
		this.color = color;
		System.out.println("Invode constructor(id, color)");
	}

	public Apple(Integer id, String color, Double weight, String origin) {
		this.id = id;
		this.color = color;
		this.weight = weight;
		this.origin = origin;
	}
	
	public Apple(String line) {
		String[] tokens = line.split("[ ,]+");
		this.id = Integer.parseInt(tokens[0]);
		this.color = tokens[1];
		this.weight =  Double.parseDouble(tokens[2].substring(0, tokens[2].length()-1));
		this.origin = tokens[3];
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public static Apple transfer(String line) {
		String[] tokens = line.split("[ ,]+");
		Double weight = Double.parseDouble(tokens[2].substring(0, tokens[2].length()-1));
		return new Apple(Integer.parseInt(tokens[0]), tokens[1], weight, tokens[3]);
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof Apple)) {
			return false;
		}
		
		Apple that = (Apple)o;
		
		return getId() == that.getId();
	}
	
	public static boolean isGreen(Apple apple) {
		return "green".equalsIgnoreCase(apple.getColor());
	}
	
	public static boolean heavierThan30(Apple apple) {
		return apple.getWeight() > 30;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public String toString() {
		return "Apple [id=" + id + ", color=" + color + ", weight=" + weight + ", origin=" + origin + "]";
	}
}

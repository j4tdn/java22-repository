package bean;

import java.util.Objects;

public class Apple {
	private Integer id;
	private String color;
	private Double weight;
	private String origin;
	public Apple() {
		System.out.println("Unvoked empty constructor");
	}
	
	public Apple(Integer id) {
		super();
		this.id = id;
		System.out.println("Unvoked constructor(id)");
	}
	public Apple(Integer id, String color) {
		super();
		this.id = id;
		this.color = color;
		System.out.println("Unvoked constructor(id, color)");
	}
	public Apple(Integer id, String color, Double weight, String origin) {
		super();
		this.id = id;
		this.color = color;
		this.weight = weight;
		this.origin = origin;
	}
	public Apple(String line) {
		String[] tokens = line.split("[ ,]+");
		this.id = Integer.parseInt(tokens[0]);
		this.color = tokens[1];
		this.weight = Double.parseDouble(tokens[2].substring(0, tokens[2].length()-1));;
		this.origin =  tokens[3];
	}
	public static Apple transfer(String line) {
		String[] tokens = line.split("[ ,]+");
		Double weight = Double.parseDouble(tokens[2].substring(0, tokens[2].length()-1));
		return new Apple(Integer.parseInt(tokens[0]), tokens[1], weight, tokens[3]);
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
		Apple other = (Apple) obj;
		return Objects.equals(id, other.id);
	}
	@Override
	public String toString() {
		return "Apple [id=" + id + ", color=" + color + ", weight=" + weight + ", origin=" + origin + "]";
	}
	public static boolean isGreen(Apple a) {
		return "Green".equals(a.getColor());
	}
	public static boolean heavierThan30(Apple a) {
		return a.getWeight()>30;
	}
}
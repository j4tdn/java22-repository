package bean;

import java.util.Objects;

public class Apple {
	private Integer id;
	private String color;
	private Double weight;
	private String origin;
	public Apple() {
		// TODO Auto-generated constructor stub
	}
	public Apple(Integer id, String color, Double weight, String origin) {
		super();
		this.id = id;
		this.color = color;
		this.weight = weight;
		this.origin = origin;
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
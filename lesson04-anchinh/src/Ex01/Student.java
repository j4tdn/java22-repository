package Ex01;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {
	private int id;
	private String name;
	private BigDecimal theoreticalPoint;
	private BigDecimal practicalPoint;
	
	public Student() {
	}
	
	public Student(int id, String name, BigDecimal theoreticalPoint, BigDecimal practicalPoint) {
		this.id = id;
		this.name = name;
		this.theoreticalPoint = theoreticalPoint;
		this.practicalPoint = practicalPoint;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getTheoreticalPoint() {
		return theoreticalPoint;
	}

	public void setTheoreticalPoint(BigDecimal theoreticalPoint) {
		this.theoreticalPoint = theoreticalPoint;
	}

	public BigDecimal getPracticalPoint() {
		return practicalPoint;
	}

	public void setPracticalPoint(BigDecimal practicalPoint) {
		this.practicalPoint = practicalPoint;
	}

	public BigDecimal averageScore() {
		return theoreticalPoint.add(practicalPoint).divide(new BigDecimal("2"), 2, RoundingMode.HALF_UP);
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", theoreticalPoint=" + theoreticalPoint.setScale(2, RoundingMode.HALF_UP) + ", practicalPoint="
				+ practicalPoint.setScale(2, RoundingMode.HALF_UP) + ", averageScore=" +  averageScore() + "]";
	}

}

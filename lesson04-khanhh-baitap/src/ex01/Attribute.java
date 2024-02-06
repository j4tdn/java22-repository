package ex01;

import java.util.Scanner;

public class Attribute {

	private String id;
	private String name;
	private double theoreticalPoint;
	private double practicePoint;

	public Attribute() {
	}

	public Attribute(String id, String name, double theoreticalPoint, double practicePoint) {
		this.id = id;
		this.name = name;
		this.theoreticalPoint = theoreticalPoint;
		this.practicePoint = practicePoint;
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

	public double getTheoreticalPoint() {
		return theoreticalPoint;
	}

	public void setTheoreticalPoint(double theoreticalPoint) {
		this.theoreticalPoint = theoreticalPoint;
	}

	public double getPracticePoint() {
		return practicePoint;
	}

	public void setPracticePoint(double practicePoint) {
		this.practicePoint = practicePoint;
	}

	public double mediumScore() {
		return (theoreticalPoint + practicePoint) / 2;
	}
	
	public void input() {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Nhap ma sinh vien:");
		id = ip.nextLine();
		
		System.out.println("Nhap ten sinh vien:");
		name = ip.nextLine();
		
		System.out.println("Nhap diem ly thuyet");
		theoreticalPoint = ip.nextDouble();
		
		System.out.println("Nhap diem thuc hanh");
		practicePoint = ip.nextDouble();
	}
	
	public void output() {
		System.out.println(" [id=" + id + ", name=" + name + ", theoreticalPoint=" + theoreticalPoint + ", practicePoint="
				+ practicePoint + "]");
	}

	@Override
	public String toString() {
		return " [id=" + id + ", name=" + name + ", theoreticalPoint=" + theoreticalPoint + ", practicePoint="
				+ practicePoint + "]";
	}

}

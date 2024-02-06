package Ex01;

public class Student {
	private Integer id;
	private String name;
	private Float theoreticalPoint;
	private Float practicePoint;
	
	public Student() {
		
	}

	public Student(Integer id, String name, Float theoreticalPoint, Float practicePoint) {
		super();
		this.id = id;
		this.name = name;
		this.theoreticalPoint = theoreticalPoint;
		this.practicePoint = practicePoint;
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

	public Float getTheoreticalPoint() {
		return theoreticalPoint;
	}

	public void setTheoreticalPoint(Float theoreticalPoint) {
		this.theoreticalPoint = theoreticalPoint;
	}

	public Float getPracticePoint() {
		return practicePoint;
	}

	public void setPracticePoint(Float practicePoint) {
		this.practicePoint = practicePoint;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", Tên: " + name + ", Điểm lý thuyết: " + theoreticalPoint + ", Điểm thực hành: "
				+ practicePoint +  ", ĐTB= " + averagePoint() + "]" ;
	}
	
	public float averagePoint() {
		float avg ;
		avg = (this.theoreticalPoint + this.practicePoint)/2;
		return avg;
	}
	
	
}

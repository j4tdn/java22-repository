package stuentManagement;

public class students {
	private int id ;
	private double theoreticalPoint;
	private double practicePoint;
	private String name;
	
	
	public static double mediumScore(students sv) {
		
		return ( sv.theoreticalPoint + sv.practicePoint )/2 ;
	}
	public static void printStuden(students[]  arr) {
		for(int i = 0; i < arr.length; i++) {
			if( (arr[i].theoreticalPoint + arr[i].practicePoint )/2 >= 8.5 ) {
				System.out.println(arr[i]);
			}
		}
		
	}
	public static void compare(students[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if( (arr[i].theoreticalPoint > arr[i].practicePoint ) ) {
				System.out.println(arr[i]);
			}
		}
	}
	
	public students() {
		// TODO Auto-generated constructor stub
	}


	public students(int id, double theoreticalPoint, double practicePoint, String name) {
		super();
		this.id = id;
		this.theoreticalPoint = theoreticalPoint;
		this.practicePoint = practicePoint;
		this.name = name;
	}


	@Override
	public String toString() {
		return "students [id=" + id + ", theoreticalPoint=" + theoreticalPoint + ", practicePoint=" + practicePoint
				+ ", name=" + name + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
}


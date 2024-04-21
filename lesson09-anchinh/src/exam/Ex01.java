package exam;

public class Ex01 {
	public static void main(String[] args) {
		Student s1 = new Student(102, "Nam", "C");
		Student s2 = new Student(103, "Bảo", "F");
		Student s3 = new Student(104, "Hoàng", "C");
		Student s4 = new Student(105, "Nguyên", "B");
		
		Student[] students = {s1,s2,s3,s4};
	}
	
	private static void find(Student[] students) {
		for(Student student : students) {
			System.out.println(student.toString());
		}
	}
}

package Ex01;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
	private List<Student> students;
	
	public StudentManager() {
		students = new ArrayList<>();

		students.add(new Student(102, "Nam", Grade.C));
        students.add(new Student(103, "Bảo", Grade.F));
        students.add(new Student(104, "Hoàng", Grade.D));
        students.add(new Student(105, "Nguyên", Grade.B));
        students.add(new Student(107, "Vũ", Grade.F));
        students.add(new Student(109, "Lan", Grade.A));
        students.add(new Student(202, "Đạt", Grade.C));
        students.add(new Student(103, "Bảo", Grade.F));
        students.add(new Student(107, "Vũ", Grade.C));
        students.add(new Student(104, "Hoàng", Grade.B));
	}
	
	public List<Student> getStudentsWithGradeA(){
		List<Student> result = new ArrayList<>();
		for (Student student : students) {
			if (student.getGrade() == Grade.A) {
				result.add(student);
			}
		}
		return result;
	}
	
	public List<Student> getStudentsRepeating(){
		List<Student> result = new ArrayList<>();
		for (Student student : students) {
			if (student.getGrade() == Grade.F) {
				result.add(student);
			}
		}
		return result;
	}
}

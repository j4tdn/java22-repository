package view.lesson01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppStudent {
	
	public static void main(String[] args) {
		
		System.out.println("1. Danh sách sinh viên điểm A:");
		getRankAStudents(mockData());
		
		Student[] retakeStudents = getStudentsLearnAgain(mockData(), Rank.F);
		System.out.println("\n2. Danh sách sinh viên học lại:");
		for (Student student : retakeStudents) {
			System.out.println(student.getId() + ", "  + student.getName() + ", " + student.getRank());
		}
		System.out.println();
		
	}

	private static Student[] mockData() {
		return new Student[] {
				new Student(102, "Nam", Rank.C),
				new Student(103, "Bảo", Rank.F),
				new Student(104, "Hoàng", Rank.D),
				new Student(105, "Nguyên", Rank.B),
				new Student(107, "Vũ", Rank.F),
				new Student(109, "Lan", Rank.A),
				new Student(202, "Đạt", Rank.C),
				new Student(103, "Bảo", Rank.F),
				new Student(107, "Vũ", Rank.C),
				new Student(104, "Hoàng", Rank.B)
		};
		                   
	}
	
	private static Student[] getRankAStudents(Student[] students) {
		for (Student student : students) {
			if(student.getRank() == Rank.A) {
				System.out.println(student.toString());
			}
		}
		return students;
	}
	
	public static Student[] getStudentsLearnAgain(Student[] students, Rank rank) {
		List<Student> result = new ArrayList<>();
		
		for (Student student : students) {
			if (student.getRank() == rank) {
				result.add(student);
			}
		}
		return result.toArray(new Student[0]);
	}
	
	
}

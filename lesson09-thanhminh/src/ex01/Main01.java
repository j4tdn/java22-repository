package ex01;

import java.util.Arrays;

public class Main01 {
	public static void main(String[] args) {
		Student[] students =
		{
		new Student(102, "Nam", "C"),
		new Student(103, "Bảo", "F"),
		new Student(104, "Hoàng", "D"),
		new Student(105, "Nguyên", "B"),
		new Student(107, "Vũ", "F"),
		new Student(109, "Lan", "A"),
		new Student(202, "Đạt", "C"),
		new Student(103, "Bảo", "A"),
		new Student(107, "Vũ", "C"),
		new Student(104, "Hoàng", "B")
		};
		Student[] result = findStudentRankA(students);
		print("Danh sách sinh viên từng đạt loại A trong năm 2021:", result);
		
		Student[] result1 = findStudentRankF(students);
		print("Danh sách sinh viên đã tham gia học lại môn cấu trúc dữ liệu trong năm 2021:", result1);
	}
	private static Student[] findStudentRankA(Student[] students) {
		Student[] result = new Student[students.length];
		int count = 0;
		for (Student student: students) {
			if (student.getRank() == "A") {
				result[count++] = student;
			}
		}
		return Arrays.copyOfRange(result, 0, count);				
	}
	private static Student[] findStudentRankF(Student[] students) {
		Student[] result = new Student[students.length];
		int count = 0;
		for (Student student: students) {
			if (student.getRank() == "F") {
				result[count++] = student;
			}
		}
		return Arrays.copyOfRange(result, 0, count);				
	}
	private static void print(String prefix, Student[] students) {
		System.out.println(prefix + " ---> {");
		for (Student student: students) {
			System.out.println("    " + student);
		}
		System.out.println("}\n");
	}

}

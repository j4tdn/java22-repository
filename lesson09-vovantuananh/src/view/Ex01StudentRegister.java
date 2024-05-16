package view;

import java.util.Arrays;


import bean.Repeater;
import bean.Student;
import common.Rank;
import common.condition;

public class Ex01StudentRegister {
	public static void main(String[] args) {
		Student[] students = mockData();
		printf("Tìm danh sách sv từng đạt loại A", getStudent(students, s -> s.getRank() == Rank.A));
		
	}

	private static Repeater[] countStudentRepeaters(Student[] students) {
		Repeater[] result = new Repeater[students.length];

		int count = 0;
		for (Student student : students) {
			Repeater found = get(student, result, count);
			boolean isExists = found != null;
			if (isExists) {
				found.plusOne();

			} else {
				Repeater repeater = new Repeater(student, 1);
				result[count++] = repeater;
			}
		}

		return Arrays.copyOfRange(result, 0, count);
	}

	private static Repeater get(Student student, Repeater[] repeaters, int nORealValue) {
		for (int i = 0; i < nORealValue; i++) {
			Repeater repeater = repeaters[i];
			if (student.equals(repeater.getStudent())) {
				return repeater;
			}
		}
		return null;
	}
	private static Student[] getStudents(Student[] students) {
		Repeater[] repeaters = countStudentRepeaters(students);
		Student[] result = new Student[repeaters.length];
		
		int count=0;
		for (Repeater repeater: repeaters) {
			if(repeater.getAmount()>1) {
				result[count++] = repeater.getStudent();
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	private static Student[] getStudent(Student[] students, condition con) {
		Student[] result = new Student[students.length];
		int count = 0;
		for (Student student : students) {
			if (con.test(student)) {
				result[count++] = student;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static void printf(String prefix, Student[] students) {
		System.out.println(prefix + "{ ");
		for (Student student : students) {
			System.out.println(student.toString());
		}
		System.out.println("  }");

	}

	private static Student[] mockData() {

		return new Student[] { new Student(102, "Nam", Rank.C), new Student(103, "Bảo", Rank.F),
				new Student(104, "Hoàng", Rank.D), new Student(105, "Nguyên", Rank.B), new Student(107, "Vũ", Rank.F),
				new Student(109, "Lan", Rank.A), new Student(105, "Diep", Rank.A), new Student(202, "Đạt", Rank.C),
				new Student(103, "Bảo", Rank.F), new Student(107, "Vũ", Rank.C), new Student(104, "Hoàng", Rank.B) };

	}
}
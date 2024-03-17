package Ex01;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01Test {

	public static void main(String[] args) {
		Student o1 = new Student(100, "Nam", 9.0f, 9.0f);

		Student o2 = new Student(120, "John", 7.5f, 6.6f);

		Student o3 = new Student();
		Input(o3);

		Student[] students = { o1, o2, o3 };

		Student[] goodStudents = betterThan85(students);
		printf("Các sinh viên có đtb lớn hơn 8.5 ", goodStudents);

		Student[] theoreticalStudents = theoreticalHigherThanPractice(students);
		printf("Các sinh viên có điểm lý thuyết > điểm thực hành ", theoreticalStudents);
	}

	public static void Input(Student student) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập mã sinh viên");
		int a = ip.nextInt();
		student.setId(a);
		System.out.println("Nhập họ tên ");
		String b = ip.next();
		student.setName(b);
		System.out.println("Nhập điểm lý thuyết");
		Float c = ip.nextFloat();
		student.setTheoreticalPoint(c);
		System.out.println("Nhập điểm thực hành");
		Float d = ip.nextFloat();
		student.setPracticePoint(d);

		System.out.println("Sinh viên bất kì --> " + student.toString());

	}

	public static Student[] betterThan85(Student[] students) {
		Student[] result = new Student[students.length];
		int counter = 0;
		for (Student student : students) {
			if (student.averagePoint() > 8.5) {
				result[counter] = student;
				counter++;
			}
		}
		return Arrays.copyOfRange(result, 0, counter);
	}

	public static Student[] theoreticalHigherThanPractice(Student[] students) {
		Student[] result = new Student[students.length];
		int counter = 0;
		for (Student student : students) {
			if (student.getTheoreticalPoint() > student.getPracticePoint()) {
				result[counter] = student;
				counter++;
			}
		}

		return Arrays.copyOfRange(result, 0, counter);
	}

	public static void printf(String prefix, Student[] students) {
		System.out.println(prefix + " {");
		for (Student student : students) {
			System.out.println("  + " + student);
		}
		System.out.println("}\n");
	}
}

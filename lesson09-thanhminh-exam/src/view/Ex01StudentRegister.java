package view;

import java.util.Arrays;

import bean.Repeater;
import bean.Student;
import common.Condition;

import static common.Rank.*;

public class Ex01StudentRegister {
	// 
	public static void main(String[] args) {
		// Tất cả các KDL trong JAVA để extends từ class Object
		// Trong Object có hàm equals
		// Nếu đối tượng dùng hàm equals mặc định của Object thì cũng chỉ so sánh địa chỉ
				
		// Nếu muốn sử dụng hàm equals để so sánh giá trị của đối tượng
		// cần phải override hàm equals lại
		
		Student[] students = mockData();
				
		printf("Tìm danh sách sinh viên từng đạt loại A trong năm 2021", 
				getStudents(students, s -> s.getRank() == A));
		System.out.println("\n=============\n");
		printf("Tìm danh sách sinh viên đã tham gia học lại trong năm 2021", 
				getStudents(students));
		
	}
	
	private static Student[] getStudents(Student[] students) {
		Repeater[] repeaters = countStudentRepeaters(students);
		Student[] result = new Student[repeaters.length];
		int count = 0;		
		for (Repeater repeater: repeaters) {
			if (repeater.getAmount() > 1) {
				result[count++] = repeater.getStudent();
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static Repeater[] countStudentRepeaters(Student[] students) {
		Repeater[] result = new Repeater[students.length];
		int count = 0;
		for (Student student: students) {
			Repeater found = get(student, result, count);
			boolean isExists = found != null;
			if(isExists) {
				found.plusOne();
				
			} else {
				Repeater repeater = new Repeater(student, 1);
				result[count++] = repeater;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static Repeater get(Student student, Repeater[] repeaters, int nORealValue) {
		for(int i = 0; i < nORealValue; i++) {
			Repeater repeater = repeaters[i];
			if(student.equals(repeater.getStudent())) {
				return repeater;
			}			
		}
		return null;
	}
	
	private static Student[] getStudents(Student[] students, Condition con) {
		Student[] result = new Student[students.length];
		int count = 0;
		for (Student student: students) {
			if (con.test(student)) {
				result[count++] = student;
			}
		}
		return Arrays.copyOfRange(result, 0, count);				
	}
	
	private static void printf(String prefix, Student[] students) {
		System.out.println(prefix + " ---> {");
		for (Student student: students) {
			System.out.println("    " + student);
		}
		System.out.println("}\n");
	}
	
	private static Student[] mockData() {
		return new Student[] {
			new Student(102, "Nam", C),
			new Student(103, "Bảo", F),
			new Student(104, "Hoàng", D),
			new Student(105, "Nguyên", B),
			new Student(107, "Vũ", F),
			new Student(109, "Lan", A),
			new Student(202, "Đạt", C),
			new Student(103, "Bảo", F),
			new Student(107, "Vũ", C),
			new Student(104, "Hoàng", B)
		};		
	}

}

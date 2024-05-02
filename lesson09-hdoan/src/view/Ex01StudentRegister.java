package view;
import static common.Rank.*;

import java.util.Arrays;

import bean.Repeater;
import bean.Student;
import common.Condition;
import common.Rank;
public class Ex01StudentRegister {
	// Tất cả các KDL trong JAVA đều extends từ class Object
	// Trong Object có hàm equals
	// Nếu đối tượng dùng hàm equals mặc định của Object thì cũng chỉ so sánh địa chỉ
	
	// Nếu muốn sử dụng hàm equals để so sánh giá trị của đối tượng(HEAP)
	// cần phải override hàm equals lại
	
	
	public static void main(String[] args) {
		Student[] students = mockData();
		
		// Tìm danh sách sinh viên từng đạt loại A trong năm 2021.
		// Student[] studentsWithRankA = getStudents(students, A);
		 printf(
				 "Tìm danh sách sinh viên từng đạt loại A trong năm 2021.", 
				 getStudents(students, student -> student.getRank() == A)
		);
		 System.out.println("\n==============\n");
		// Tìm danh sách sinh viên đã tham gia học lại môn cấu trúc dữ liệu trong năm 2021.
		
		 printf(
				 "Tìm danh sách sinh viên đã tham gia học lại môn cấu trúc dữ liệu trong năm 2021."	 , 
				 getStudents(students)

		 );
		
	}
	
	// Tìm công thức chung, strategy: input, ouput, no body
	// body sẽ được truyền khi gọi hàm
	
	// student.getRank() == ?
	// student.getName().equals(...)
	
	// boolean strategy(Student student)
	
	private static Student[] getStudents(Student[] students) {
		Repeater[] repeaters = countStudentRepeaters(students);
		
		Student[] result = new Student[repeaters.length];
		int count = 0;
		for (Repeater repeater: repeaters) {
			if(repeater.getAmount() > 1) {
				result[count++] = repeater.getStudent();
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	// viết hàm, xem mỗi sinh viên tham gia học môn CTDL mấy lần trong năm 2021
	// A2D{ {s1, 2}, {s2, 1}, {s3, 5} }
	// A1D --> {r1, r2, r3}
	// Repeater: Student, int amount
	
	private static Repeater[] countStudentRepeaters(Student[] students) {
		// null null null null null null null null null null
		Repeater[] result = new Repeater[students.length];
		int count = 0;
		
		for(Student student: students) {
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
	
	// Tìm repeater theo student
	private static Repeater get(Student student, Repeater[] repeaters, int nORealValues) {
		for(int i = 0; i < nORealValues; i++) {
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
		for(Student student: students) {
			if(con.test(student)) {
				result[count++] = student;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static void printf(String prefix, Student[] students) {
		System.out.println(prefix + "{");
		for(Student student: students) {
			System.out.println("  --> " + student);
		}
		System.out.println("}");
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

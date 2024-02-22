package stuentManagement;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		students sv1 = new students(01, 7.7, 7.1, "Nguyễn Đức Quốc");
		students sv2 = new students(02, 9, 8.5, "Nguyễn Thị Phương Vy");
		students sv3 = new students();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập thông tin cho sinh viên 3");
		System.out.print("Id ");
		int id = scanner.nextInt();
		System.out.print("Điểm lí thuyết ");
		double theoreticalPoint = scanner.nextDouble();
		System.out.print("Điểm thực hành ");
		double practicePoint = scanner.nextDouble();
		System.out.print("Name ");
		String name = scanner.nextLine();
		sv3.setId(id);
		sv3.setTheoreticalPoint(theoreticalPoint);
		sv3.setPracticePoint(practicePoint);
		sv3.setName(name);

		students[] arr = { sv1, sv2, sv3 };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(i);
		}
		System.out.println(students.mediumScore(sv3));
		students.printStuden(arr);// in ra sinh viên có điểm trung bình lớn hơn 8.5 từ mảng 
		students.mediumScore(sv3);// tính điểm trung bình của sv3
		students.compare(arr); // in ra sinh viên có điieemr thực hành lớn hơn lí thuyết
		
		
	}
}

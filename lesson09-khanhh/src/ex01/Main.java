package ex01;

public class Main {

	public static void main(String[] args) {
		
		 Student[] students = {
		            new Student(102, "Nam", xepLoai.C),
		            new Student(103, "Bảo", xepLoai.F),
		            new Student(104, "Hoàng", xepLoai.D),
		            new Student(105, "Nguyên", xepLoai.B),
		            new Student(107, "Vũ", xepLoai.F),
		            new Student(109, "Lan", xepLoai.A),
		            new Student(202, "Đạt", xepLoai.C),
		            new Student(103, "Bảo", xepLoai.F),
		            new Student(107, "Vũ", xepLoai.C),
		            new Student(104, "Hoàng", xepLoai.B)
		        };
		 
		 System.out.println("Sinh viên có xếp loại A:");
	        for (Student student : students) {
	            if (student.getXepLoai() == xepLoai.A) {
	                System.out.println(student);
	            }
	        }
	        System.out.println("Sinh viên có xếp loại F:");
	        for (Student student : students) {
	            if (student.getXepLoai() == xepLoai.F) {
	                System.out.println(student);
	            }
	        }
	}
}

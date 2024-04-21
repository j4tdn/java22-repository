package Ex01;

import common.Rank;

public class Ex01 {

	public static void main(String[] args) {
		
		Student[] students =  {
			new Student("102", "Nam", Rank.C),
			new Student("102", "Nam", Rank.F),
			new Student("104", "Hoàng", Rank.D),
			new Student("105", "Nguyên", Rank.B),
			new Student("107", "Vũ", Rank.F),
			new Student("109", "Lan", Rank.A),
			new Student("202", "Đạt", Rank.C),
			new Student("103", "Bảo", Rank.F),
			new Student("107", "Vũ", Rank.C),
			new Student("104", "Hoàng", Rank.B)
			}; 
		System.out.println("Danh sách sinh viên đạt điểm A trong năm 2021");
		findStudents(students);
	}
	
	public static void findStudents(Student[] students) {
		
		for (Student s: students) {
			if (s.getRank().equals(Rank.A)) {
				System.out.println(s.toString());
			}
		}
	}
}

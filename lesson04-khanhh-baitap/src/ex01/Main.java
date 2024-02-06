package ex01;

public class Main {
	
	public static void main(String[] args) {
		Attribute sv1 = new Attribute("23ns045", "khanh", 9.6, 9.5);
		Attribute sv2 = new Attribute("23ns046", "khanhh", 8, 8);
		Attribute sv3 = new Attribute();
		
		sv3.input();
		
		Attribute[] students = {sv1, sv2, sv3};
	
		System.out.println("\nSinh vien co diem tb tren 8.5:");
        for (Attribute student : students) {
            if (student.mediumScore() > 8.5) {
                System.out.println(student);
            }
        }
		
        System.out.println("\nSinh vien co diem ly thuyet cao hon diem thuc hanh");
        for (Attribute student : students) {
            if (student.getTheoreticalPoint() > student.getPracticePoint()) {
                System.out.println(student);
            }
        }
		
	}
}

package Ex01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	ArrayList<Student> st = new ArrayList<>();
	
	public static void main(String[] args) {
		Main m = new Main();
		m.addStudent();
		m.avgScore();
		m.theoryBetter();
	}
	
	public void addStudent() {
		Student s1 = new Student(1, "Nguyen Van A", new BigDecimal(8), new BigDecimal(5));
        Student s2 = new Student(2, "Nguyen Van B", new BigDecimal(9), new BigDecimal(10));
		System.out.println("Tạo sinh viên s3");
		Student s3 = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập id: ");
		int id = sc.nextInt();
	    sc.nextLine(); 
		System.out.println("Nhập tên: ");
		String name = sc.nextLine();
		System.out.println("Nhập điểm lý thuyết: ");
		BigDecimal theoryScore = new BigDecimal(sc.nextLine());
	    System.out.println("Nhập điểm thực hành: ");
	    BigDecimal practicalScore = new BigDecimal(sc.nextLine());
	    s3 = new Student(id, name, theoryScore, practicalScore);
	    st.add(s1);
	    st.add(s2);
	    st.add(s3);
	    System.out.println("\nDanh sách học sinh: ");
	    for (Student s: st) {
	    	System.out.println(s);
	    }
	}
	
	public void avgScore() {
		System.out.println("\nHọc sinh có điểm trung bình trên 8.5: ");
		for (Student s : st) {
            BigDecimal average = s.avgScore();
            if((average.compareTo(new BigDecimal("8.5")) > 0)){
            	System.out.println(s);
            }
        }
	}
	
	public void theoryBetter() {
		System.out.println("\nHọc sinh có điểm lý thuyết cao hơn điểm thực hành: ");
		for (Student s: st) {
			BigDecimal theory = s.getTheoryScore();
			BigDecimal practical = s.getPracticalScore();
			if (theory.compareTo(practical)>0) {
				System.out.println(s);
			}
		}
	}
	
}

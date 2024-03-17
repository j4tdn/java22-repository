package Ex01;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		Student sv1 = new Student(1, "Minh", new BigDecimal(9), new BigDecimal(8.5));
		Student sv2 = new Student(2, "Hung", new BigDecimal(8.5), new BigDecimal(9.5));
		Student sv3 = new Student();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập thông tin sinh viên 3: ");
		System.out.println("Mã sinh viên: ");
		sv3.setId(sc.nextInt());
		sc.nextLine();
		System.out.println("Tên sinh viên: ");
		sv3.setName(sc.nextLine());
		System.out.println("Điểm lý thuyết: ");
		sv3.setTheoryScore(sc.nextBigDecimal());
		System.out.println("Điểm thực hành: ");
		sv3.setPracticeScore(sc.nextBigDecimal());
		
		Student[] ListSV = {sv1, sv2, sv3};
		
		Student[] avgScore85 = 	infoAvgScore(ListSV);
		printf("Danh sách sinh viên có điểm TB trên 8.5 ", avgScore85);
		
		Student[] theoryComparePratical = theoryComparePratical(ListSV);
		printf("Danh sách sinh viên có điểm lý thuyết cao hơn điểm thực hành ", theoryComparePratical);
	}

	private static Student[] infoAvgScore(Student[] ListSV) {
		Student[] Result = new Student[ListSV.length];
		int counter = 0;
		for(Student sv : ListSV) {
			if(sv.avgScore().compareTo(new BigDecimal("8.5"))>0) {
				Result[counter] = sv;
				counter++;
			}
		}
		return  Arrays.copyOfRange(Result, 0, counter);
			
	}
	private static Student[] theoryComparePratical(Student[] ListSV) {
		Student[] Result = new Student[ListSV.length];
		int counter = 0;
		for(Student sv : ListSV) {
			BigDecimal theory = sv.getTheoryScore();
			BigDecimal practical = sv.getPracticeScore();
			if(theory.compareTo(practical) > 0) {
				Result[counter] = sv;
				counter++;
			}
		}
		return  Arrays.copyOfRange(Result, 0, counter);
	}
	private static void printf(String prefix, Student[] ListSV) {
		System.out.println(prefix + " {");
		for (Student sv: ListSV) {
			System.out.println(" + " + sv);
		}
		System.out.println("}\n");
	}

}

package Ex01;

import java.math.BigDecimal;
import java.util.Scanner;

public class Student {
	private int id;
	private String name;
	private BigDecimal theoryScore;
	private BigDecimal practiceScore;

	public Student() {
	}

	public Student(int id, String name, BigDecimal theoryScore, BigDecimal practiceScore) {
		this.id = id;
		this.name = name;
		this.theoryScore = theoryScore;
		this.practiceScore = practiceScore;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getTheoryScore() {
		return theoryScore;
	}

	public void setTheoryScore(BigDecimal theoryScore) {
		this.theoryScore = theoryScore;
	}

	public BigDecimal getPracticeScore() {
		return practiceScore;
	}

	public void setPracticeScore(BigDecimal practiceScore) {
		this.practiceScore = practiceScore;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", theoryScore=" + theoryScore + ", practiceScore="
				+ practiceScore + "]";
	}

	public void inputInfo() {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Nhập id: ");
			this.id = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Nhập tên: ");
			this.name = scanner.nextLine();
			System.out.print("Nhập điểm lý thuyết: ");
			String thscore = scanner.nextLine();
			this.theoryScore = new BigDecimal(thscore);
			System.out.print("Nhập điểm thực hành: ");
			String prscore = scanner.nextLine();
			this.practiceScore = new BigDecimal(prscore);
		}
	}

	public static void averageScore(Student[] sd) {
		System.out.println("Sinh viên có điểm trung bình lớn hơn 8.5:");
		for (Student student : sd) {
			BigDecimal aveScore = (student.getTheoryScore().add(student.getPracticeScore()))
					.divide(new BigDecimal("2"));
			if (aveScore.compareTo(new BigDecimal("8.5")) > 0) {
				System.out.println(student.toString());
			}
		}
	}

	public static void highertheoryScore(Student[] sd) {
		System.out.println("Sinh viên có điểm lý thuyết cao hơn điểm thực hành:");
		for (Student student : sd) {
			if (student.getTheoryScore().compareTo(student.getPracticeScore()) > 0) {
				System.out.println(student.toString());
			}
		}
	}
}




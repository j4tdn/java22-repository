package Ex01;

import java.math.BigDecimal;

public class Student {
	private int id;
	private String name;
	private BigDecimal theoryScore;
	private BigDecimal practiceScore;
	
	public Student() {
		
	}

	public Student(int id, String name, BigDecimal theoryScore, BigDecimal practiceScore) {
		super();
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
	public BigDecimal avgScore() {
		return (theoryScore.add(practiceScore)).divide(new BigDecimal(2));
	}
	

}

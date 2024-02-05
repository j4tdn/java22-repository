package Ex01_QLSV;

import java.math.BigDecimal;

public class SinhVien {
	
	private int id;
	private String fullName;
	private BigDecimal theoryScore, practiceScore;
	
	public SinhVien() {
	}	
	public SinhVien(int id, String fullName, BigDecimal theoryScore, BigDecimal practiceScore) {
		this.id = id;
		this.fullName = fullName;
		this.theoryScore = theoryScore;
		this.practiceScore = practiceScore;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
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
	public BigDecimal averageScore() {
		return (this.theoryScore.add(this.practiceScore)).divide(new BigDecimal("2"));
	}

	@Override
	public String toString() {
		return "" + id + 
				"\t" + fullName + 
				"\t" + theoryScore + 
				"\t\t" + practiceScore;
	}
	
}

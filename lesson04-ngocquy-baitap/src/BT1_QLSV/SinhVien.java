package BT1_QLSV;

import java.math.BigDecimal;

public class SinhVien {
	
	private int id;
	private String fullName;
	private BigDecimal theoryPoint, practicePoint;
	
	public SinhVien() {
		
	}
	
	public SinhVien(int id, String fullName, BigDecimal theoryPoint, BigDecimal practicePoint ) {
		this.id = id;
		this.fullName = fullName;
		this.theoryPoint = theoryPoint;
		this.practicePoint = practicePoint;
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

	public BigDecimal getTheoryPoint() {
		return theoryPoint;
	}

	public void setTheoryPoint(BigDecimal theoryPoint) {
		this.theoryPoint = theoryPoint;
	}

	public BigDecimal getPracticePoint() {
		return practicePoint;
	}

	public void setPracticePoint(BigDecimal practicePoint) {
		this.practicePoint = practicePoint;
	}
	public BigDecimal averagePoint() {
		return (this.theoryPoint.add(this.practicePoint)).divide(new BigDecimal("2"));
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "" + id + "\t " + fullName + "\t " + theoryPoint + "\t\t\t " + practicePoint;
		}
	
}

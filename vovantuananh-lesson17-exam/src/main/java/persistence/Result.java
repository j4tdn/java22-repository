package persistence;

import java.math.BigDecimal;

public class Result {
	private Integer studentID;
	private String subject;
	private BigDecimal score;
	
	public Result() {
		
	}

	public Result(Integer studentID, String subject, BigDecimal score) {
		super();
		this.studentID = studentID;
		this.subject = subject;
		this.score = score;
	}

	public Integer getStudentID() {
		return studentID;
	}

	public void setStudentID(Integer studentID) {
		this.studentID = studentID;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public BigDecimal getScore() {
		return score;
	}

	public void setScore(BigDecimal score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Result [studentID=" + studentID + ", subject=" + subject + ", score=" + score + "]";
	}

	
	
}

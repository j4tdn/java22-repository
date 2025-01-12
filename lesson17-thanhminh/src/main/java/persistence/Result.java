package persistence;

import java.util.Objects;

public class Result {
	private Integer student_id;
	private String subject;
	private Double score;
	
	public Result() {
		
	}

	public Result(Integer student_id, String subject, Double score) {
		super();
		this.student_id = student_id;
		this.subject = subject;
		this.score = score;
	}

	public Integer getStudent_id() {
		return student_id;
	}

	public void setStudent_id(Integer student_id) {
		this.student_id = student_id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof Result)) {
			return false;
		}
		
		Result that = (Result)o;
		
		return getStudent_id() == that.getStudent_id();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getStudent_id());
	}

	@Override
	public String toString() {
		return "Result [student_id=" + student_id + ", subject=" + subject + ", score=" + score + "]";
	}
	

}

package persistence;

import java.util.Objects;

public class Result {
	private int studen_id;
	private String subject;
	private Double score;
	public Result() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Result [studen_id=" + studen_id + ", subject=" + subject + ", score=" + score + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Result(int studen_id, String subject, Double score) {
		super();
		this.studen_id = studen_id;
		this.subject = subject;
		this.score = score;
	}
	public int getStuden_id() {
		return studen_id;
	}
	public void setStuden_id(int studen_id) {
		this.studen_id = studen_id;
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
		
		if (!(o instanceof Class that)) {
			return false;
		}
		
		return getStuden_id() == that.getId();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getStuden_id());
	}
	
}

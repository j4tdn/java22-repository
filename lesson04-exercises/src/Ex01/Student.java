package Ex01;

import java.math.BigDecimal;

public class Student {
    private int id;
    private String name;
    private BigDecimal theoryScore;
    private BigDecimal practicalScore;
    
    public Student() {
    	
    }
    
	public Student(int id, String name, BigDecimal theoryScore, BigDecimal practicalScore) {
		this.id = id;
		this.name = name;
		this.theoryScore = theoryScore;
		this.practicalScore = practicalScore;
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

	public BigDecimal getPracticalScore() {
		return practicalScore;
	}

	public void setPracticalScore(BigDecimal practicalScore) {
		this.practicalScore = practicalScore;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", theoryScore=" + theoryScore + ", practicalScore="
				+ practicalScore + "]";
	}
    
	public BigDecimal avgScore() {
	    return (theoryScore.add(practicalScore)).divide(new BigDecimal(2));
	}

    
}

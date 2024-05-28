package bean;

public class Repeater {
	private Student student;
	private int amount;
	public Repeater() {
		
	}
	public void plusOne() {
		this.amount++;
	}
	public Repeater(Student student, int amount) {
		super();
		this.student = student;
		this.amount = amount;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Repeater [student=" + student + ", amount=" + amount + "]";
	}
	
}

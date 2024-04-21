package Bai1;

public class Student {
	private int msv;
	private String name;
	private Enum level;
	
	private Student() {
		
	}
	
	public Student(int MSV, String Name, Enum Level) {
		this.msv = MSV;
		this.name = Name;
		this.level = Level;
	}

	public int getMsv() {
		return msv;
	}

	public void setMsv(int msv) {
		this.msv = msv;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Enum getLevel() {
		return level;
	}

	public void setLevel(Enum level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return name;
	}
	
}

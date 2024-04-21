package exam;

public class Student {

	private int Id;
	private String name;
	private String Score;
	
	private Student() {
		
	}
	
	public Student(int id, String name, String score) {
		Id = id;
		this.name = name;
		Score = score;
	}

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getScore() {
		return Score;
	}
	public void setScore(String score) {
		Score = score;
	}
	@Override
	public String toString() {
		return "[Id=" + Id + ", name=" + name + ", Score=" + Score + "]";
	}
	
}

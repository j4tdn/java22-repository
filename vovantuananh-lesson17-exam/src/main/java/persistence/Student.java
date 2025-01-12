package persistence;

public class Student {
	private Integer id;
	private String name;
	private String gender;
	private Integer classID;
	
	public Student() {
		
	}

	public Student(Integer id, String name, String gender, Integer classID) {

		this.id = id;
		this.name = name;
		this.gender = gender;
		this.classID = classID;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getClassID() {
		return classID;
	}

	public void setClassID(Integer classID) {
		this.classID = classID;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", classID=" + classID + "]";
	}

	
}

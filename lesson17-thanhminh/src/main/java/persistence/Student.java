package persistence;

import java.util.Objects;

public class Student {
	private Integer id;
	private String name;
	private String gender;
	private Integer class_id;
	
	public Student() {
		
	}

	public Student(Integer id, String name, String gender, Integer class_id) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.class_id = class_id;
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

	public Integer getClass_id() {
		return class_id;
	}

	public void setClass_id(Integer class_id) {
		this.class_id = class_id;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof Student)) {
			return false;
		}
		
		Student that = (Student)o;
		
		return getId() == that.getId();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", class_id=" + class_id + "]";
	}
	

}

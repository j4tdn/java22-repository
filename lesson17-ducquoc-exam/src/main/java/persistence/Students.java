package persistence;

import java.util.Objects;

public class Students {
	private int id ;
	private String name ;
	private String gender;
	private int class_id;
	
	
	
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getClass_id() {
		return class_id;
	}

	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}
	
	
	public Students(int id, String name, String gender, int class_id) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.class_id = class_id;
	}



	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", gender=" + gender + ", class_id=" + class_id + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getGender()=" + getGender() + ", getClass_id()="
				+ getClass_id() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof Students that)) {
			return false;
		}
		
		return getId() == that.getId();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}
	
}

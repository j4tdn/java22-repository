package bean;

import common.Rank;

public class Student {
	
	private Integer id;
	private String name;
	private Rank rank;
	
	public Student() {
	}

	public Student(Integer id, String name, Rank rank) {
		this.id = id;
		this.name = name;
		this.rank = rank;
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

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}
	
	// s1.equals(s2);
	
	@Override
	public boolean equals(Object o) {
		// nếu 2 students trùng địa chỉ --> true
		if(this == o) {
			return true;
		}
		
		if (!(o instanceof Student)) {
			return false;
		}
		
		// khác địa chỉ
		// nếu 2 students cùng id --> true, else false
		Student that = (Student)o;
		return this.getId() == that.getId();
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}

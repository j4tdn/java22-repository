package bean;

import common.Rank;

public class Student {// đúng trg hợp là dung int : khac null 
	private Integer id; 
	private String name; 
	private Rank rank; 
	public Student() {
	}
	public Student(Integer id, String name, Rank rank) {
		super();
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
	@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			else return false;	
		}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rank=" + rank + "]";
	}
}

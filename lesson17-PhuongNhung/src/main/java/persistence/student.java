package persistence;

public class student {
	private Integer id;
	private String name;
	private Integer class_id;
	
	
	public student() {
		// TODO Auto-generated constructor stub
	}


	public student(Integer id, String name, Integer class_id) {
		super();
		this.id = id;
		this.name = name;
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


	public Integer getClass_id() {
		return class_id;
	}


	public void setClass_id(Integer class_id) {
		this.class_id = class_id;
	}


	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", class_id=" + class_id + "]";
	}
	
	
	
}

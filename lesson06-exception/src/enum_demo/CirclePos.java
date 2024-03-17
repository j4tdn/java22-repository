package enum_demo;

public enum CirclePos {

	//khai báo các giá trị của enum 
	
	INSIDE("Trong đường tròn"), 
	ONSIDE("Trên đường tròn"), 
	OUTSIDE("Ngoài đường tròn");
	
	private String value;
	
	
	CirclePos(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}

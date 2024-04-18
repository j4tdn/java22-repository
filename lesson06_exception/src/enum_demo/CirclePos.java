package enum_demo;

public enum CirclePos {
	
	// khai báo các giá trị của enum
	// hình dùng: CirclePos INSIDE = new CirclePos(...);
	
	INSIDE("Trong đường tròn"),
	ONSIDE("Trên đường tròn"),
	OUTSIDE("Ngoài đường tròn");
	
	private String value;
	
	// mặc định private constructor
	// muốn định nghĩa bao nhiêu giá trị của enum, chỉ có thể định nghĩa tại ENUM đó
	CirclePos(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
}
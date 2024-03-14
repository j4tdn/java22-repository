package enum_demo;

public enum CirclePos {

	// Khai báo các giá trị của enum
	// hình dung: CirclePos INSIDE = new CirclePos();
	INSIDE("Trong đường tròn"), 
	ONSIDE("Trên đường tròn"),
	OUTSIDE("Ngoài đường tròn");

	private String value;

	// Mặc định private Constructor
	// muốn định nghĩa bao nhiêu giá trị của enum, chỉ có thể định nghĩa tại ENUM đó
	private CirclePos(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}

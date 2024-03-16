package enum_demo;

public enum CirclePos {
	// khai báo các giá trị của enum
	INSIDE("trong đường tròn"), ONSIDE("trên đường tròn"), OUTSIDE("ngoài đường tròn");
	// hình dung : CirclePos INSIDE = new CirclePos();
	private String value;
	
	CirclePos(String value){
			this.value = value;
		
	}
	public String getValue() {
		return value;
	}
	// mặc đinh private constructor
	// muốn định nghĩa bao nhiêu giá trị của enum thì chỉ có thể định nghĩa tại enum đó
	CirclePos() {}
}

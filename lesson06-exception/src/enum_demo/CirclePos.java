package enum_demo;

public enum CirclePos {

	//khai báo các giá trị của enum
	//hình dung : CirclePos INSIDE = new CirclePos();
	INSIDE("trong duong tron"),
	ONSIDE("Tren duong tron"),
	OUTSIDE("Ngoai duong tron");
	
	private String value;
	//mặc định có 1 private constructor
	//muốn dịnh nghĩa bao nhiêu giá trị của enum chỉ có thể định nghĩa tại ENUM đó
	CirclePos(String value){
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}

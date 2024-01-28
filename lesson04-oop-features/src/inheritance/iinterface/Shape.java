package inheritance.iinterface;

public interface Shape {
	//mặc định public static final
	int a=1;
	
	//JDK 1.1 -. 1.7
	//interface chỉ được chứa các hàm trừu tượng abstract methods
	//abstract method: là method có phần khai báo và ko có phần thân hàm
	//		+ mặc định có 2 từ khóa public abstract
			//abstract(trừu tượng) : hàm không có body
			// không hỗ trợ protected
	
	void paint();
	void calcS();
}

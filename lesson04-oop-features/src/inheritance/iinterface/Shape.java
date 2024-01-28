package inheritance.iinterface;

public interface Shape {
	/*
	 * JDK 1.1 -> 1.7 : interface chỉ dc chứa các hàm trừu tượng Abstract method
	 abstract method: hàm chỉ có phần khai báo không có thân hàm
	 
	 Mặc định: có 2 từ khóa public abstract
	 ko hỗ trợ protected
	*/
	int a = 10; // thuộc tín mặc định khai báo public static final ==> phải khai báo giá trị cụ thể
	void paint();
	void calcS();
	
}

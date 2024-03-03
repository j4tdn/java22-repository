package inheritance.iinterface;

public interface Shape {
	// mặc định public static final
	int a = 10;
	
	/*
	 JDK 1.1 -> 1.7
	 interface chỉ được phép chưa các hàm trừu tượng abstract methods
	 
	 abstract method
	 + là method có phần khai báo và ko có phần thân hàm
	 + mặc định có 2 từ khóa public abstract
	   public: dùng mọi nơi, ko hỗ trợ protected
	   abstract(trừu tượng): hàm ko có body
	 */
	
	void paint();
	
	void calcS();
	
}
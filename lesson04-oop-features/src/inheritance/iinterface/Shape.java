package inheritance.iinterface;

public interface Shape {

	int a = 5;
	
	// JDK 1.1 -> 1.7
	// interface chỉ dc phép chứa các hàm trừu tượng abstract methods
	// abstract method: 
	// + là method có phần khai báo và ko có phần thân hàm 
	// + mặc định có 2 từ khoá public abstract 
	// public : dùng mọi nơi, ko hỗ trợ protected
	// abstract : hàm ko có body 
	//
	
	void paint();
	
	void calcS();
	
}

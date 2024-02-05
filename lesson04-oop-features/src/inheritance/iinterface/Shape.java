package inheritance.iinterface;

public interface Shape {
	
	
	
	// JDK 1.1 -> 1.7
	// interface chỉ được phép chứa các hàm trừu tượng = abstract method
	// abstract method: là method có phần khai báo và ko có phần thân hàm
	// 					mặc định có 2 từ khóa public abstract
	// 					public: dùng mọi nơi
	//					abstract(trừu tượng): hàm ko có body
	
	void paint();
	
	void calcS();

}

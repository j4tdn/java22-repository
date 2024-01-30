package inheritance.iinterface;

public interface Shape {
	/*JDK 1.1 --> 17
	 interface chỉ được phép chứa các hàm trừu tường abstract methods
	 abstract methods: là method có phần khai báp và ko có phần thân hàm
	                   mặc định có 2 từ khóa 
	                   public: dùng mọi nơi, ko hỗ trợ protected
	                   abstract(trừu tượng): hàm ko có body
	*/
	void paint();
	void calcS();


}

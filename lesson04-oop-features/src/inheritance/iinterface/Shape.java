package inheritance.iinterface;

public interface Shape {
	
	//mặc định là public static final(ko đc thay đổi giá trị ở Stack-> ko đc cập nhật)
	int a=10;
	
	// JDK 1.1 -> 1.7
	//Interface chỉ đc phép chứa các hàm trừu tượng abtract methods
	/*abstract method: là method có phần khai báo ko chứa thân hàm
	+ mặc định có 2 từ khóa public abstract
	public: dùng mọi nơi
	abstract: hàm ko có body
	 
	 */
	
	void paint();
	
	void calcS();

}

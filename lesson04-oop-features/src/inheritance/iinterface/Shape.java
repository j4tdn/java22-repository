package inheritance.iinterface;

public interface Shape {
	//mặc định public static final(ko cập nhật được giá trị ở stack)
	int a = 10;
	
	/*JDK 1.1-> 1.7
	- interface chỉ được phép chứa các hàm trừa tượng abstract method
	-abstrac method: là method có phânf khia báo và ko có phần thân hàm
    trong interface không cần có public và abstrac
    bulic : dùng mọi nơi , không hỗ trợ protected
    abstract(trừu tượng): hàm ko có body
	*/
	void pain();
	
	void calcS();
}

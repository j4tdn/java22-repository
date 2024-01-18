package polymorphism.method;

//tất cả mọi class trong java mặc định đều kế thừa từ class Object

public class Ex02OverridingDemo {
	
	public static void main(String[] args) {
		
		Ex02OverridingDemo o2 = new Ex02OverridingDemo();
		
		System.out.println("toString --> " + o2);
		
		System.out.println("==========");
		
		PolyMethodChild pc = new PolyMethodChild();
		pc.log();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Custom tostring from Ex02 ";
	}
}
//1. có thể override thuôcj tính(static , non-static) đc k
//2. có thể overide hàm static dc k
// cho ví dụ



/*
 * 2.Trong ngôn ngữ lập trình Java, bạn không thể override một phương thức static.
 *  Phương thức static là một phần của lớp, không phải là một phần của đối tượng cụ
 *   thể được tạo ra từ lớp đó. Override được sử dụng để thay thế một phương thức của 
 *   lớp cha bởi một phương thức của lớp con trong quá trình kế thừa.

Phương thức static không liên quan đến đối tượng cụ thể và được gọi trực tiếp từ lớp, không phải 
thông qua một đối tượng nhất định. Do đó, không có khái niệm "override" cho phương thức static trong Java.
 Thay vào đó, nếu bạn khai báo một phương thức có cùng tên và kiểu trả về trong một lớp con, điều này
  sẽ tạo ra một phương thức mới và không có mối quan hệ với phương thức static ở lớp cha.
  
  
  
  1.Trong Java, bạn không thể override thuộc tính (property) như bạn có thể làm với phương thức. 
  Một lớp con không thể override một thuộc tính (field) đã được định nghĩa trong lớp cha.
   Thay vào đó, nếu bạn khai báo một thuộc tính có cùng tên trong lớp con, nó sẽ được coi là một thuộc 
   tính mới trong lớp con, không ảnh hưởng đến thuộc tính có cùng tên trong lớp cha.

Đối với thuộc tính static, nó cũng không thể được override trong ngữ cảnh kế thừa.
 Mỗi lớp sẽ giữ một bản sao của thuộc tính static và không có cơ chế để "override"
  nó giống như với phương thức.
 */

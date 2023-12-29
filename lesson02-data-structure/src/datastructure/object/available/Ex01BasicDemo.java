package datastructure.object.available;
import datastructure.object.custom.Item;
public class Ex01BasicDemo {
public static void main(String[] args) {
	int a=8;
	Item x = new Item();
	Item item = new Item (1, 'A', 11);
	//KDLĐT có sẵn của Java --> Integer, Character, String
    String s1 = "hello";
    String s2 = new String ("hi");
    Long l1 = 22l;
    Long l2 = new Long(33l);
    System.out.println("l1 --> " + l1);
    System.out.println("l2 --> " + l2);
    
   /* //Điểm khác nhau khi khởi tạo giá trị trực tiếp và thông qua từ khóa new
    //cho kdl có sẵn của JAVA
    
    //+sd từ khóa new gọi hàm khởi tạo --> luôn khởi tạo ô nhớ mới cho đối tượng tạo ra
    //+ gán giá trị trực tiếp cho biến
    // --> lưu trữ trong vùng HEAP - constant pool
       --> trước khi khởi tạo ô nhớ mới, kiếm tra giá trị đối tượng
       mới tạo có ở cp chưa, nếu chưa có thì mới tạo ra
    
    --> luôn khai báo giá trị trực tiếp cho biến thuộc
    KDL đối tượng có sẵn của Java để tiết kiệm HEAP memory
    khi khởi tạo nhiều ô nhớ có giá trị trùng nhau
    
    Phân biệt int, Integer: 
       int: 100% phải có giá trị, mặc định là null
       Integer: null, có giá trị
       vd tuổi sinh viên: không bắt buộc nullable
       --> lí thuyết: bắt buộc có giá trị --> int
                      k bắt buộc --> integer
       --> thực tế: hầu hết thuộc tính dùng để chứa dl
       từ csdl lấy ra, từ csdl lại có khả năng nullable nên hầu hết dùng kiểu đối tượng
       --> những biến logic xử lí bài toán: nt, đt
    */
    
    Integer i1= new Integer(22); //h1
    Integer i2 = new Integer(33); //h2
    Integer i3 = new Integer(44); //h3
    
    System.out.println("i1 code --> " + System.identityHashCode(i1));
    System.out.println("i2 code --> " + System.identityHashCode(i2));
    System.out.println("i3 code --> " + System.identityHashCode(i3));
    
    Integer n1 = 55;
    Integer n2 = 66;
    Integer n3 = 66;
    
    System.out.println("n1 code --> " + System.identityHashCode(n1));
    System.out.println("n2 code --> " + System.identityHashCode(n2));
    System.out.println("n3 code --> " + System.identityHashCode(n3));
    
    
    
    
    n3=88;
    System.out.println("n2 code new --> " + System.identityHashCode(n2));
    System.out.println("n3 code new --> " + System.identityHashCode(n3));
    System.out.println(n2);
    System.out.println(n3);
    
   
    
}
}

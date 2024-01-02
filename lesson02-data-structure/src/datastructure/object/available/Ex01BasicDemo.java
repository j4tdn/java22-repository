package datastructure.object.available;

public class Ex01BasicDemo {
  public static void main(String[] args) {
	// KDL nguyen thuy, int, chả, long
	  // mục đích : lưu trữ dữ liệu
	  int a =8;
	  
	// KDL đối tượng ---> tự tạo, Item, Student ...
//	  Item x= new Item();
//	  Item item = new Item(1,'A',11);
	  
	/// KDL đối tượng ---> có sẵn của java Integer, Character, String
	  /*+ sử dụng từ khóa new gọi hàm khởi tạo để khởi tạo giá trị cho biến
	   * ---> luu trữ ở vùng nhớ heap của JVM
	   * ---->cứ new ra thì luôn khởi tạo ô nhớ mói cho đối tượng tạo ra
	   * 
	   *+ gán giá trị trực tiếp cho biến, ko dùng từ khóa new
	   *---> luu tru trong vung nho HEAP -- constant pool( immutable object)
	   *---> truoc khi khoi tao o nho moi, kiem tra xem gia tri doi tuong muon tao ra da co ơ constant pool hay chua, neu chua co thi moi tao ra
	   * 
	   * */
	  Integer i1 = new Integer(22);//h1
	  Integer i2 = new Integer(33);//h2
	  Integer i3 =new Integer(33);//h3
	  System.out.println("i1 code--->"+ System.identityHashCode(i1));
	  System.out.println("i2 code--->"+ System.identityHashCode(i2));
	  System.out.println("i3 code--->"+ System.identityHashCode(i3));
	  
	  Integer n1=55;// h4
	  Integer n2=66;//h5
	  Integer n3 =66;//h6
	  System.out.println("n1 code--->"+ System.identityHashCode(n1));
	  System.out.println("n2 code--->"+ System.identityHashCode(n2));
	  System.out.println("n3 code--->"+ System.identityHashCode(n3));
	  
	  
	  System.out.println("==============");
	  
	  n3=88; //h6
	  System.out.println("n2 code--->"+ System.identityHashCode(n2));
	  System.out.println("n3 code--->"+ System.identityHashCode(n3));
	  System.out.println("n2--->" +n2);
	  System.out.println("n3--->" +n3);
	  
	  String s1 = new String("hello");
	  String s2 ="xin chao";
	  
	  /* Phân biệt int, Integer ?
	   *          double, Double ?
	   *          char, Character
	   * 
	   * 
	   * ---> int: 100% minh phai co gia tri, mac dinh la 0
	   * ----> Integer: null, co gia tri
	   * 
	   * 
	   * */
	  
}
}

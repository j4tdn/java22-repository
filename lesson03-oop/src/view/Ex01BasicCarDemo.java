package view;

import bean.Car;

public class Ex01BasicCarDemo {
  public static void main(String[] args) {
	// class Carr(id, model, color, salesPrice)
	  
	  // tao ra 3 doi tuong cho class Car
	  // thuộc tính
	  // static: thuộc phạm vi của class
	  //       : các đối tượng của class sẽ mang cùng giá tị static
	  // non- static: thuộc phạm vi của object
	  //            : mỗi đối tượng sẽ lưu trữ thông tin thuộc tính riêng
	  
	  //c1,c2,c3 là biến: 100% stack
	  // giá trị của biến KNT: stack
	  //giá trị của KĐT: HEAP
	  
	  Car c1 = new Car("1", "MG5", "yellow", 800d); //H1
	  Car c2 = new Car("2", "Raize", "Orange", 540d); //H2
	  Car c3 = new Car("3", "VF8", "Blue", 720d); //H3
	  
	  // cap nhat thong tin
	 c2.setSalesPrice(560d);
	  
	  // lay thong tin
	  System.out.println("C3 Model--->"+ c3.getModel());
	  
	  System.out.println("c1----> " + c1);
	  System.out.println("c2----> " + c2);
	  System.out.println("c3----> " + c3);
    /* 1.phân biệt, khi nào sử dụng constructor và setter, getter
	  --Khi tạo ra một đối tượng: constructor ( tạo ô nhớ mới ở HEAP)
	  --Khi muốn cập nhật giá trị (cập nhật lại giá trị tại ô nhớ trên HEAP): setter, getter, constuctor
	  -- khi lấy giá trị của từng thuộc tính
	  
	   tại sao phải khai báo thuộc tính của class là private, rồi sau đó dùng getter, setter để truy cập mà không khai báo public
     * +public --> được phép truy cập từ bất kỳ class nào --> giống FOP ko quản lý dữ liệu riêng của từng đối tượng
     * +private --> được phép truy cập từ class hiện tại, bên ngoài chỉ truy cập thông qua getter, setter để thao tác với giá trị
     * + bên ngoài không thể thay đổi cấu trúc dữ liệu của thuộc tính
     * 
     * + ben ngoai nen truy cap tang/giam/thaydoi gia tri cua thuoc tinh chu ko nen biet chinh xac gia tri nguon goc cua thuoc tinh do nhu the nao
     * 
     * 
     * 
     * 
     * 
     * */
	  
}
}

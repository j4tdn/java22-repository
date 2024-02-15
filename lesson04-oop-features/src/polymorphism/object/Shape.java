package polymorphism.object;

public class Shape {
	
	void paint() {
		// chưa biết sẽ paint gì
		System.out.println("Shape paint --> unknown ...");
	}
	
	void calcS() {
		// chưa biết sẽ tính diện tích như nào
		System.out.println("Shape calcS --> unknown ...");
	}
	
	/*
	 * Khi các class có chung chức năng VD: paint, calcS
	 * Gom 2 hàm này lại và bỏ vào KDL cha
	 * Sau đó --> tạo class con extends từ class cha rồi override lại
	 * Có 2 vấn đề
	 * + Tại class cha hàm chung đó phần body, nội dung chưa biết phải làm gì
	 * + Class con extends từ cha ko bắt buộc phải override nếu quên --> dùng luôn
	 * hàm của class cha --> ko đúng công thức của nó
	 * 
	 * Yêu cầu
	 * + KDL cha có hàm chung chỉ cần phần khai báo, ko cần thân hàm
	 * + KDL con khi thừa kế từ KDL cha thì bắt buộc phải override
	 * 
	 * --> Dùng KDL cha là interface
	 * 
	 */
	
}

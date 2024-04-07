package p3_builder;

import java.time.LocalDate;

public class Ex01BuilderPatternDemo {
	
	/*
	 Builder Pattern
	 
	 + khi có 1 class, để khởi tạo cho class -> sử dụng từ khóa new
	 sau đó, muốn set lại các giá trị cho các thuộc tính của đối tượng
	 -> dùng hàm setter
	 C1. Gọi constructor với nhiều tham số
	 C2. Gọi constructor rỗng hoặc 1 vài tham số
	 	Sau đó dùng setter để set lại giá trị sau
	 	
	 	Vấn đề
	  	  Khi class có nhiều hơn 5(convention) thuộc tính(tham số)
	 		và các tham số có thể trùng KDL có thể dẫn đến
	 		
	 		User: firstName, lastName, age, address, email, phone
	 		public User(){}
	 		public User(String firstName,String lastName, int age, String address,String email, phone){}
	 		
	 		1. khi dùng hàm khởi tạo nhiều tham số, KDL tham số trùng nhau,
	 		dẫn đến dễ truyền bị sai dữ liệu
	 		
	 		*** Vấn đề 1  --> code có thể ko bị lỗi tại compile, runtime nhưng mà
	 		dữ liệu truyền vào sẽ bị sai
	 		
	 	2. ...
	 	
	 	=> Sử dụng Builder Pattern
	 	
	 	-> có 2 cách để tạo ra class với Builder Pattern
	 	+ Truyền thống
	 		Class A: thuộc tính
	 			   : sử dụng constructor, new để khởi tạo đối tượng, setter để set giá trị
	 		===========================
	 		(builder)
	 		Class A: vẫn chứa thuộc tính,  setter nhưng ko có getter
	 		Việc khởi tạo đối tượng là do 1 class khác giúp đỡ / xử lý -> class đó gọi là class Builder của class A
	 		--> Sử dụng Builder để build ra A
	 			: khởi tạo đối tượng, set giá trị thực hiện với Builder
	 			: cuối cùng gán giá trị bên Builder cho Á
	 			: A sẽ là immutable(bất biến ở HEAP)
	 	
	 		
	 	
	 	
	 	+ Nâng cao
	 	  Sử dụng chính class A để khởi tạo đối tượng nhưng mà ko thông qua constructor trực tiếp
	 	  --> dán tiếp thông qua 1 hàm static thường đặt tên là 'of', 'newInstance'
	 	  và thay các hàm setter bằng hàm with
	 	  vẫn chứa hàm getter bình thường
	 		
	 */
	
	public static void main(String[] args) {
		
		// giống đag gọi hàm khởi tạo của User có 3 tham số
		// đảo thứ tự các hàm with... thoải mái
		User user1 = User.initBuilder() //trả về KDL Builder
						.withFirstName("Teo") //Builder
						.withLastName("Le")   //Builder
						.withAge(22)		  //Builder
						.build(); 			  // -> TRẢ về KLD User
		System.out.println("user1 --> " + user1);
		System.out.println("\n============================\n");
		
		User user2 = User.initBuilder() 
						.withFirstName("Teo") 
						.withLastName("Le")  
						.withEmail("teo@gmail.com")	  
						.build(); 			// -> TRẢ về KLD User
		System.out.println("user2 --> " + user2);
		System.out.println("\n============================\n");
		
		User user3 = User.initBuilder() 
				.withFirstName("Teo") 
				.withLastName("Le")   
				.withAddress("Liên Chiểu")	  
				.build(); 			// -> TRẢ về KLD User
		System.out.println("user3 --> " + user3);
		
		//Muốn cập nhật giá trị cho biến của KDL đc tạo thông qua Builder
		//phải dùng Builder để tạo 1 ô nhớ mới, ko thể dùng setter
		//1 đối tượng đc tạo ra, ko thể cập nhật giá trị cho đối tượng đó ở HEAP --> immutable class
		
		//Immutable class là 1 class mà khi tạo ra bất kì đối tượng nào
		// thì giá trị của đối tượng đó ở HEAP ko bao h thay đổi
		
		System.out.println("\n========================________________*******************=======================\n");
//		LocalDate.now()
//		LocalDate.now(zoneId)
//		LocalDate.of(0, 0, 0);
		
		RemoteDate date1 = RemoteDate.of()
							.withDay(7)
							.withMonth(4)
							.withYear(2024);
		System.out.println("date1 --> " + date1);
		
		RemoteDate date2 = RemoteDate.of(7,4,2024)
				.withDayOfYear(2020);
		
		//có cập nhật date2 -> vì with.. mutable
		date2.withDayOfYear(310); //của mình
		System.out.println("date2 --> " + date2);
		
		LocalDate date3 =LocalDate.now()
							.withDayOfMonth(10)
							.withMonth(7)
							.withYear(2024);
		date3.withDayOfMonth(15); //ko ăn vô date3   (của LocalDate) vì with.. immutable
		System.out.println("date3 --> " + date3);
		
		RemoteTime time4 = RemoteTime.of()
							.withHour(17)
							.withMinute(45)
							.withSecond(22); //H1
		
		time4.withHour(21); // -> ko cập nhật time4 -> vì with.. immutable
		//vì time4 trỏ đến ô nhớ mới
		// muốn cập nhật thì phải gán lại cho time4
		System.out.println("time4--> " + time4);
		
		//================"Tổng hợp"=====================
		//có 3 cách code để tạo ra class sd Builder Pattern
		//C1: class A => Builder + with --> build -> Instance Of A
		//C2: class A -> A.of để tạo ra instance -> sd with .. để cập nhật
		//		2.1 --> mutable
		//			--> sau khi gọi with gán xong return this
		//		2.2 --> immutable
		//			--> sau khi gọi with gán xong return new instance
		
		// Ngoài việc khắc phục hạn chế của class bình thường khi có nhiều tham số
		//giúp tạo ra các immutable object(class)
		
	}

}

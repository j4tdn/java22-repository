package p3_builder;

public class BuilderPatternDemo {

	/*
	 Builder pattern  
	 
	 */
	
	
	public static void main(String[] args) {
		
		//Giống đang gọi hàm khởi tạo của User có 3 tham số
		//Đảo thứ tự các hàm with thoải mái
		User user1 = User.initBuilder() // trả về KDL Builder
		    .withFirstName("Teo")  //Builder
		    .withLastName("Lê")    //Builder
		    .withAge(22)           //Builder
		    .build();		       //User
		
		System.out.println("user --> " + user1);
		
		System.out.println("\n ==================\n");
		
		User user2 = User.initBuilder() // trả về KDL Builder
			    .withFirstName("Teo")  //Builder
			    .withLastName("Lê")    //Builder
			    .withEmail("teole@gmail.com")           //Builder
			    .build();		       //User
		
		System.out.println("user --> " + user2);
		
		System.out.println("\n ==================\n");
		
		User user3 = User.initBuilder() // trả về KDL Builder
			    .withFirstName("Teo")  //Builder
			    .withLastName("Lê")    //Builder
			    .withAddress("Liên Chiểu")           //Builder
			    .build();		       //User
		
		System.out.println("user --> " + user3);
		
		//Muốn cập nhật giá trị cho biến của KDL dc tạo thông qua builder
		//Phải dùng Builder để tạo 1 ô nhớ mới, k thể dùng setter
		//Một đối tượng dc tạo ra, ko thể cập nhật giá trị cho đối tượng đó ở HEAP --> Immutable class
		
		
		System.out.println("\n===================**********************************");
		
		
		
		RemoteDate date = RemoteDate.of()
				.withDay(7)
				.withMonth(4)
				.withYear(2024);
		
		System.out.println("date --> " + date);
		
		RemoteTime time4 = RemoteTime.of().withHour(17).withMinute(45).withSecond(22);
		
		time4.withHour(21);
		
		System.out.println("time4 --> " + time4);
		
		//=======================Tổng hợp =================================
		//Có 3 cách code để tạo ra class sử dụng Builder pattern 
		//Cách 1: class A -> Builder + with -->build --> Instance of A
		//Cách 2: class A-> A.of để tạo ra instance -> sử dụng with ... để cập
		
		
		//Ngoài việc khắc phục hạn chế của class bình thường khi có nhiều tham số 
		//Giúp tạo ra các immutable object(class)
		
		
	}
}

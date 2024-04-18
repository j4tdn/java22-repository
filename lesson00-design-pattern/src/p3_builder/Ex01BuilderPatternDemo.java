package p3_builder;

import java.time.LocalDate;

public class Ex01BuilderPatternDemo {
	/*
	 Builder Pattern
	 + Có class, để khởi tạo đối tượng cho class --> sử dụng từ khóa new
	   sau đó muốn set lại các giá trị cho các thuộc tính của đối tượng
	   --> dùng hàm setter
	   C1: Gọi constructor với nhiều tham số
	   C2: GỌi constructor rỗng hoặc 1 vài tham số
	       Sau đó dùng setter để set lại giá trị sau
	   
	   Vấn đề:
	   1. Khi class có nhiều hơn 5(convention) thuộc tính(tham số) 
	      và các tham số có thể trùng KDL dẫn đến
	      User: firstName, lastName, age, address, email, phone
	      Public User(){}
	      Public User(String firstName,String lastName,int age,String address,String email,String phone){}
	      --> Khi dùng hàm khởi tạo nhiều tham số, KDL tham ssố trùng nhay, dẫn đến dễ truyền bị sai
	   *** Vấn đề 1 --> code này có thể ko bị lỗi tại compile, runtime nhưng mà dữ liệu truyền vào
	   *User user1 = new User("Teo", "Le", 18, "Da Nang", "teole@gmail.com", "123456789")
	 	User user2 = new User("Le", "Teo", 18, "Da Nang", "123456789", "teole@gmail.com")
	 	  
	 	LocalDate.of(year, month, day) --> LocalDate.of(2022, 2, 28);
	 	                               --> Localdate.of(28, 2, 2022);
	   
	   2. Khi yêu cầu tạo các hàm khởi tạo với 1/N tham ssố có constructor declaration trùng nhau trùng số lượng
	   
	      tham số, KDL truyền vào ==> ko đc
	   + Khi khởi tạo đối tượng user cần firstName, lastName, age
	     --> Public User(String firstName,String lastName,int age)
	   + Khi khởi tạo đối tượng user cần firstName, lastName, email
	     --> Public User(String firstName,String lastName,String email)
	   + Khi khởi tạo đối tượng user cần firstName, lastName, address
	     --> Public User(String firstName,String lastName,String address)
	     
	   Cách fix: Dùng hàm khởi tạo rỗng, xong gọi 3 hàm setters, code vẫn chạy hưng mà xuống hàng set từng param,
	   nếu số lượng param nhiều code k đc đẹp
	   
	   ==> Sử dụng builder Pattern: để khởi tọa đối tượng cho các complex objject(có nhiều hơn5 tham số)
	   Giải quyết đc 2 vấn đề:
	   + ko sợ truyền param bị sai
	   + ko dợ overloading constructor ko hoạt động
	   
	   ==> Có 2 các để tạo ra class với Builder Pattern
	   + Truyền thông
	   Class A: thuộc tính
	          : sự dụng constructor, new để tạo đối tượng, setter để set giá trị
	   =============
	   (builder)
	   Class A: vẫn chứa thuộc tính
	   Việc khởi tạo đối tượng cho class A là do 1 class khác giúp đỡ, xử lý --> class đó gọi là class Builder của class A
           --> Sử dụng Builder để build ra A
               : khởi tạo đối tượng, set giá trị thực hiện với Builder
               : cuối cùng gán giá trị bên Builder qua A
               : A sẽ là immutable(bất biến ở HEAP)
           
         + Nâng cao
           Sử dụng chính class A để khởi tạo đối tượng nhưng mà k thông qua constructor trực tiếp
           --> dán tiếp thông qua 1 hàm static thường đặt tên là 'of', 'newInstance'
           Và thay các hàm setter bằng hàm with
           Vẫn chứa hàm getter bình thường
	   
	   	   
	 */
	public static void main(String[] args) {
		// Giống đang gọi hàm khởi tạo của User có 3 tham sso
		// Đảo thứ tự các hàm with .. thoải mái
		User user1 = User.initBuilder()       // trả về KDL Builder
		                 .withFirstName("Teo")// Builder
		                 .withLastName("Le")  // Builder
		                 .withAge(22)         // Builder
		                 .build();            // User
		System.out.println("user1 --> " + user1);
		
		System.out.println("\n============\n");
		User user2 = User.initBuilder() // trả về KDL Builder
                         .withFirstName("Teo")
                         .withLastName("Le")
                         .withEmail("teole@gmail.com")
                         .build();
		System.out.println("user2 --> " + user2);
		
		System.out.println("\n============\n");
		User user3 = User.initBuilder() // trả về KDL Builder
                         .withFirstName("Teo")
                         .withLastName("Le")
                         .withAddress("LienChieu")
                         .build();
		System.out.println("user3 --> " + user3);
		
		// Muốn cập nhật giá trị cho biến của KDL được tạo thông qua Builder
		// Phải dùng Builder để tạo 1 ô nhớ mới, k thể dùng setter
		// Một đối được tạo ra từ class, k thể cập nhật giá trị cho đối tượng đó ở HEAP --> Immutable class
				
				
		// Immutable class là một class mà tại đó khi tạo ra bất kỳ đối tượng nào
		// thì giá trị của đối tượng đó ở HEAP ko bao giờ được phép thay đổi
				
		System.out.println("\n===============************ __________ ************===============\n");
				
		// LocalDate.now()
		// LocalDate.now(zoneId)
		// LocalDate.of(y, m, d)
		
		RemoteDate date1 = RemoteDate.of()
				            .withDay(7)
				            .withMonth(4)
				            .withYear(2024);
		System.out.println("date1 --> " + date1);
		
		RemoteDate date2 = RemoteDate.of(7,4,2024)
	            .withDayOfYear(220);
		// cập nhật date2 --> vì with.. mutable
		date2.withDayOfYear(310); // của mình
        System.out.println("date2 --> " + date2);
        
        LocalDate date3 = LocalDate.now()
        		.withDayOfMonth(10)
				.withMonth(7)
				.withYear(2024);

        // k cập nhật date3 --> vì with.. immutable
        date3.withDayOfMonth(15); // của localdate

        System.out.println("date3 --> " + date3);
        
        RemoteTime time4 = RemoteTime.of()
        		             .withHour(17)
        		             .withMinute(45)
        		             .withSecond(22);
        
        // ko cập nhật time4 --> vì with.. immutable
        // vì time4 -> trỏ đến ô nhớ mới
     	// muốn cập nhật phải gán lại cho time4
        time4.withHour(21);
        System.out.println("time4 --> " + time4);
        
        // ================= Tổng hợp ===================
        // Có 3 cách code để tạo ra class sử dụng Builder Pattern
        // Cách 1: Class A -> Builder + with --> build -> Instance Of A
        // Cách 2: Class A -> A.of để tạo ra insatcne -> sử dụng with ... để cập nhật giá trị
        //       2.1 --> mutable
        //               --> sau khi gọi with gán xong return this
        //       2.2 --> immutable
        //      		  --> sau khi gọi with gán xong return new instance
     		
        // Ngoài việc khắc phục hạn chế của class bình thường khi có nhiều tham số
        // Giúp tạo ra các immutable object(class)
	}

}

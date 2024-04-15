package p3_builder;



public class Ex01BuilderPatternDemo {
	/*
	 * 
	 */
	public static void main(String[] args) {
		User u1 = User.initBuilder().withFirstName("quoc").withLastName("duc").build();
		System.out.println(u1);
		// muốn cập nhật giá trị của 1 kiểu dữ liệu tạo ra thông qua builder 
		// phải dùng builder tạo ra 1 ô nhớ mới ko thể dùng setter 
		// một đối tượng tạo ra ko thể cập nhật giá trị cho đối tượng đó tại heap gọi là immutable
		
		System.out.println("\n======================");
		RemoteDate rd  = RemoteDate.of().withDay(7).withMonth(10).withYear(2024);
		System.out.println(rd);
		
		// ko cập nhật 
		
		
		RemoteTime time = RemoteTime.of()
									.withHour(17)
									.withMinute(45)
									.withSecond(22);
		System.out.println(time);
		
		// tổng hợp có 3 cách code sử dụng builder pattern
		//cách 1 class a builder + with 
	}
		
}

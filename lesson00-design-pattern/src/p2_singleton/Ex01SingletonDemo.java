package p2_singleton;

public class Ex01SingletonDemo {

	/*
	 Singleton pattern : là 1 mẫu thiết kế (design pattern) ở đó 1 class chúng ta chỉ dc phép tạo ra
	  duy nhất 1 đối tượng 
	  
	   --> Thường dùng ở đâu
	   	  + Calendar: tại 1 thời điểm dù mình có lấy Calendar.getInstance() N lần thì nó cũng chỉ trả về duy nhất thời gian hiện tại
	   	            : Thay vì khởi tạo 100 ô nhớ, tạo ra duy nhất 1 ô nhơ trên vùng nhớ HEAP -> save memory
	   	            
	   	  + Code Model: MVC
	   	    . ItemService     : chứa hàm dc phép gọi từ client
	   	    . ItemServiceImpl : chứa các hàm trừu tượng
	   	    
	   	     ==> Item 
	   	    
	   	    . ItemDao
	   	    . HibernateItemDao
	
	 */
	
	public static void main(String[] args) {
		
		SDate sDate1 = SDate.getInstance();
		
		System.out.println("sDate 1st --> " + System.identityHashCode(sDate1));
		
		SDate sDate2 = SDate.getInstance();
		
		System.out.println("sDate 2st --> " + System.identityHashCode(sDate2));
	}
}

package p2_singleton;

public class Ex01SingletonDemo {

	/*
	 Singleton pattern: 
	 --> Là 1 mẫu thiết kế(design pattern) ở đó 1 class chúng ta chỉ được phép tạo ra duy nhất 1 đối tượng
	 
	 --> Thường dùng ở đâu
	     + Calendar: Tại 1 thời điểm dù mình có lấy Calendar.getInstance() N lần thì nó cũng chỉ trả về duy nhất thời gian hiện tại
	               : Thay vì khởi tạo 100 ô nhớ, tạo 1 ra duy nhất 1 ô nhớ trên vùng nhớ HEAP --> save memory
	     + Code Model: MVC
	       . ItemClient      : chứa hàm được phép gọi từ client
	       . ItemService     : chứa các hàm trừu tượng
	       . ItemServiceImpl : chứa phần thực thi của ItemService
	       . ItemDetailServiceImpl: chứa phần thực thi của ItemService
	       
	       ==> ItemService service = new ItemSeriviceImpl()
	           service.add(...)
	           service.get(...)
	           
	           // new ItemSeriviceImpl N lần --> mục đích chỉ để gọi các hàm non-static, add, get ... bên trong
	              ItemService, ItemServiceImpl --> new N lần thì nó ko ảnh hướng đến việc gọi hàm
	           // thay vì new, cho phép new thì làm sao đó chỉ tạo 1 đối tượng duy nhất
	           
	       KHÁC
	         Class: private constructor, 100% static methods --> utility class(no instance)
	         Class: private constructor                      --> singleton(1 instance)        
	       
	       . ItemDao
	       . HibernateItemDao
	       
	 
	 
	 */

	//Trong 1 class, chỉ khởi tạo 1 đối tượng thông qua hàm getInstance
	public static void main(String[] args) {
		// Calendar c = Calendar.getInstance();

		SDate sDate1 = SDate.getInstance();
		System.out.println("sDate 1st --> " + System.identityHashCode(sDate1));

		SDate sDate2 = SDate.getInstance();
		System.out.println("sDate 2nd --> " + System.identityHashCode(sDate2));
	}


}

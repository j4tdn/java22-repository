package abstraction;

public class Ex01AbstractionTheoryDemo {
	
	/*
	 Tính chất trừu tượng được thể hiện qua 
	 
	 1. class --> class là 1 khái niệm trừu tượng dùng để chỉ tập hợp các object
	              có chung thuộc tính, phươn thức
	 2. interface, abstract class --> chứa các abstract method sau đó được override lại
	              trong các lớp thực thi
	 */
	
	// functional interface
	// lambda expression
	
	// strategy pattern
	// design pattern(mẫu thiết kế): mvc, mvvn, builder, singleton, factory, strategy, observer
	// mỗi design pattern là mẫu thiết kế, tập hợp các công thức, bước làm để giải quyết một bài toán
	
	/*
	 code convention = quy tắc = tiêu chuẩn code
	 
	 1. Tên dự án
	    + sử dụng tiếng anh
	    + toàn bộ chữ cái viết thường
	    + nếu có nhiều từ, cách nhau bởi dấu -
	    + phạm vi lớp học
	      . dự án ở lớp: lesson..-section-name
	      . dự án về nhà: lesson..-fullname
	 
	 2. Tên package
	    + sử dụng tiếng anh
	    + toàn bộ chữ cái viết thường
	    + nếu có nhiều từ
	      . cách nhau bởi dấu _
	        VD: package_a, package_b
	      . cách nhau bở dấu .
	        VD: view.iinterface, view.cclass
	            --> thực tế trong folder nó sẽ tạo folder view chứ folder iinterface và cclass
	 
	 3. Tên class/interface/abstract-class
	    + sử dụng tiếng anh
	    + đặt tên theo quy tắc lạc đà - camel case convention
	      . chữ cái đầu tiên viết hoa
	      . chữ cái tiếp theo của mỗi từ viết hoa(nhiều từ)
	      VD: một từ --> Test, Ex05, Book
	          nhiều từ --> IntCheck, Ex05Test, StudentController, HibernateItemDao     
	 
	 4. Tên hàm(function) - phương thức(method)
	    + sử dụng tiếng anh
	    + đặt tên theo quy tắc lạc đà - camel case convention
	      . chữ cái đầu tiên viết thường
	      . chữ cái tiếp theo của mỗi từ viết hoa(nhiều từ)
	      . phải là một động từ, cụm động từ
	      VD: một từ: find, get
	        : nhiều từ: findAll, getAll, doAllocation, getBooksById, isValid
	        
	 5. Tên biến, thuộc tính
	    + sử dụng tiếng anh
	    + đặt tên theo quy tắc lạc đà - camel case convention
	      . chữ cái đầu tiên viết thường
	        --> đặc biệt: Biến là hằng số --> thường viết hoa 100%, các từ cách nhau bởi _
	      . chữ cái tiếp theo của mỗi từ viết hoa(nhiều từ)
	      . là 1 danh từ, động từ
	      VD: một từ: item, number, name, status
	        : nhiều từ: isNew, numberOfElements
	 
	 Ví dụ:
	    + package: bean
	    + class: Student
	    + variable: studentA
	    
	    ĐÚNG V
	    --> import bean.Student
	    --> Student student = new Student();
	    --> student.getName();
	    
	    SAI X
	    --> Student Student = new Student
	    --> Student.GetName();
	 */
	
	// enum
	// boxing, auto-boxing
	// int-Integer, Integer-int, Float, Double ...
}
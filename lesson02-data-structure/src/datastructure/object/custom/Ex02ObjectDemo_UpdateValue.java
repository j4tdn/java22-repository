package datastructure.object.custom;

public class Ex02ObjectDemo_UpdateValue {

	public static void main(String[] args) {
		  //Toán tử = là toán tử gán ( 100% Hoạt động ở stack)  
     	  //Gán giá trị ở STACK ( trên HEAP ko ảnh hưởng) 
		  Item item = new Item();
		  //Cập nhật giá trị a.x = ? a.y = ? ---> Cập nhập giá trị của các thuộc tính ở ô nhớ mà biến a đang trỏ đến ở HEAP
		  //Cập nhật giá trị a= new Item()   ---> Cập nhật địa chỉ của biến a ở STACK 
		  
		  
		  
		  
          Item itA = new Item (1 , 'A' , 111);//H1
          Item itB = new Item (2 , 'B' , 222);//H2
          Item itC = new Item (3 , 'C' , 333);//H3
          
          itB.salesPrice = 444;
          itC.id = 6;
          System.out.println("itA address after -->" + itA.hashCode());
          System.out.println("itB address after -->" + itB.hashCode());
          System.out.println("itC address after -->" + itC.hashCode());
          itA = itB;
          itA.salesPrice = 777; 
          
          System.out.println("itA address after -->" + itA.hashCode());
          System.out.println("itB address after -->" + itB.hashCode());
          System.out.println("itC address after -->" + itC.hashCode());

 
          System.out.println("itA -->" + itA);//2 B 777
          System.out.println("itB -->" + itB);//2 B 777
          System.out.println("itC -->" + itC);//6 C 333

	}

}

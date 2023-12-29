package datastructure.object.custom;

public class Ex02ObjectDemo_UpdateValue {
	public static void main(String[] args) {
		int a=5;
		int b=5;
		
		Item item=new Item();
		//cập nhật giá trị item=..item1
		//cập nhật địa chỉ biến a tại Stack
			
		//cập nhật giá trị a.x=?
		//-> caoah nhật giá trị của thuộc tính ở ô nhớ mà biến a đag trỏ đến ở HEAP
		
		
		Item itA=new Item(1,'A',111);
		Item itB=new Item(2,'B',222);
		Item itC=new Item(3,'C',333);
		System.out.println("Address A " + itA.hashCode());
		System.out.println("Address B " + itB.hashCode());
		System.out.println("Address C " + itC.hashCode());
		
		//Toán tử = là toán tử gán(gán ở Stack)
		itB.salePrice=444;
		itC.id=6; 
		itA=itB; 
		itA.salePrice=777;
		
		System.out.println("Address A after--> " + itA.hashCode());
		System.out.println("Address B after -->  " + itB.hashCode());
		System.out.println("Address C after-->  " + itC.hashCode());
	
		System.out.println("itA-->"+itA);//2,B,111
		System.out.println("itB-->"+itB);//2,'B',444
		System.out.println("itC-->"+itC); //6,C,333
		
	}
}

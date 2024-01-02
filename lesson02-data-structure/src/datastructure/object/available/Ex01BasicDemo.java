package datastructure.object.available;

import datastructure.object.Item;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		int a = 8;
		
		
		Item item = new Item(1, 'A', 11);
		
		//KDL doi tuong --> co san trong JAVA--> Integer, Character, String
		// --> luon luon co duy nhat 1 thuoc tinh ben trong
		//Integer --> int value
		//String --> byte[] value
		// Character --> char value
		
		// class Integer {
		//  int value;
		// public Integer (int value) {
		// 	this.value = value ;
		
		Integer i1 = new Integer (a); //h1
		Integer i2 = new Integer (33);
		Integer i3 = new Integer (33);
		
		Integer n1 = 55;
		Integer n2 = 66;
		Integer n3 = 66;
		
		
	}
	/*	+ su dung tu khoa new goi ham khoi tao de khoi tao gia tri cho bien 
	 * thuoc kieu du lieu co san cua JAVA
	 * -- luon khoi tao o nho moi cho doi tuong tao ra
	 * -- luu tru trong vung nho HEAP cua JVM
	 * + gan gia tri truc tiep cho bien, ko dung tu khoa new
	 * --> luu tru trong vung nho HEAP - constant pool (immutable object) ko bao h thay doi dc
	 * --> truoc khi khoi tao o nho moi, kiem tra xem gia tri cua doi tuong muon tao ra da co o 
	 * constant pool chua, neu chua co moi tao ra
	 * 
	 * --> luon su dung cach khai bao va gan gia tri truc tiep cho bien thuoc KDL doi tuong co san cua JAVA
	 * --> tiep kiem heap memory khi khoi tao nhieu o nho co gia tri trung nhau
	 * Integer a = 8;
	 * String s = heello;
	 * 
	 * Phan biet int, Integer ?
	 * 			double, Double ? 
	 * 
	 * --> int: 100% minh phai co gia tri, mac dinh la 0
	 * 		Integer: null, co gia tri
	 * 
	 * --> Tuoi sinh vien --> ko bat buoc nullable --> Integer
		ly thuyet: Bat buoc co gia tri --> int
				: ko bat buoc --> Integer
				
	--> thuc te, hau het cac thhuoc tinh dung de chua du lieu tu database(co so du lieu)
	tu CSDL lai co kha nang nullable nen hau het --> KDL doi tuong 
	
	--> Nhung bien logic xu ly bai toan  --> NT, DT
	 * 
	 * 
	 * 
	 * JDK Avalable code - 1.8
	 * public Integer (int value) {
	 * 	this.value = value;
	 * }
	 */

}

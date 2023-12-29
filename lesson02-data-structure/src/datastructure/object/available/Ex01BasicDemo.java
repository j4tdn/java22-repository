package datastructure.object.available;

import datastructure.object.custom.Item;

public class Ex01BasicDemo {
	public static void main(String[] args) {
	//kdl nguyen thuy
	int a=8;
	
	//kdl doi tuong--> tu tao ra -> Item, Student...
	Item item=new Item(1,'a',11);
	
	//kdl doi tuong --> co san cua java -> integer
	String s1="hello";
	String s2=new String("hi");
	
	Long l1=22l;
	Long l2=new Long(33l);
	
	System.out.println("l1-->" + l1);
	System.out.println("l-->" + l1);
	
	//diem khac nhau khi khoi tao gia tri truc tiep vaf thong qua tu khoa new
	//cho kdl doi tuong co san
	
	/*phan biet int, Integer
	 *          double, Double
	 			char, Character
	 --> int: 100% phải có giá trị, mặc định là 0
	 --> Integer: null, có giá trị
	 
	 -->Tuổi của sinh viên: -> ko bắt buộc nullable -->Integer
	 
	 --> lý thuyết: bắt buộc có giá trị --> int
	 			: ko bắt buộc -> Integer
	
	*/
	// kdl doi tuong có sẵn của java--> Integer, Character, String
	Integer i1=new Integer(22); //H1
	Integer i2= new Integer(33); // H2
	Integer i3= new Integer(33); // H3
	System.out.println("i1 code-->"+ System.identityHashCode(i1));
	System.out.println("i2 code-->"+ System.identityHashCode(i2));
	System.out.println("i3 code-->"+ System.identityHashCode(i3));
	
	Integer n1=55; //H4  
	Integer n2=66; //H5 
	Integer n3=66; // 66 đã có trên contant pool
	System.out.println("n1 code-->"+ System.identityHashCode(n1));
	System.out.println("n2 code-->"+ System.identityHashCode(n2));
	System.out.println("n3 code-->"+ System.identityHashCode(n3));
	
	n3=88;
	System.out.println("n2 -->"+ n2);
	System.out.println("n3 -->"+ n3);
	
	//phan biet long, Long
	}
	

}

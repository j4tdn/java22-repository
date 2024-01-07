package view;

import bin.car; 
public class Ex02StaticAttributeDemo {
	public static void main(String[] args) {
		//Tao ra 1000 mau xa Audi voi mau sac khac nhau
		// Tao ra 10(demo)
		car c01 = new car("1", "Audi", "Yellow", 800d); //h1
		car c02 = new car("2", "Audi", "Red", 700d); //h1
		car c03 = new car("3", "Audi", "Blue", 600d); //h1
		car c04 = new car("4", "Audi", "Green", 800d); //h1
		car c05 = new car("1", "Audi", "White", 500d); //h1
		car c0k = new car("k", "Audi", "Orange", 200d); //h1
		car c10 = new car("10", "Audi", "Violet", 300d); //h1
		
		c01.setModel("MG");
		c01.setModel("MG");
		c01.setModel("MG");
		c01.setModel("MG");
		c01.setModel("MG");
		c01.setModel("MG");
		c01.setModel("MG");
		
		// Tat ca cac car khi minh tao ra deu co model = Audi
		//Thay vi luu tru moi doi tuong (o nho) quan ly 1 thong tin model rieng
		
		//+ Ton vung nho cho nhung gia tri trung nhau cua tat ca doi tuong oclass
		// + Tat ca doi tuong mang gia tri model chung, neu cat nhap gia tri cho model
		// --> phai cap nhat cho tat ca, thieu bug
		
		// iDea: Neu nhu thuoc tinh (thong tin) nao ma la thong tin (gia tri) chung	 cho tat ca doi tuong duoc tao ra tu 1 class
		
		// --> nen cho thuoc tinh do la static
		// --> thuoc tinh la static --> no se luu tru o 1 o nho rieng
		// --> tat ca doi tuong tu class deu dung chung 1 o nho thay vi luu tru nhiu noi
		
	}

}

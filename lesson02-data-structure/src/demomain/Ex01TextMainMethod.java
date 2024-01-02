package demomain;

public class Ex01TextMainMethod {
	
	/*
	 * comments - chu thich - duoc bo qua khi thuc thi chuong trinh
	 * Ex01TextMainMethod: Java executable class
	 * Method main: noi bat dau va ket thuc cua 1 chuong trinh
	 * texting, coding ... compile
	 * Run       ... [fn] ctrl f11
	 * debug     ... [fn] f11 --> chay qua tung dong code, dung lai tai breakpoints
	==== Syntax ====
	System.out.println: in ra noi dung va xuong hang 
	System.out.print: in ra noi dung va khong xuong hang
	 */
	
	public static void main(String[] args) {
		System.out.println("Welcome TO Java22 class");
		
		System.out.println("Today: lesson02-data-structure");
		
		System.out.println("=====================");
		printStarTriangle("1.Tam giac ngoi sao");
	
		System.out.println("2.Tam giac ngoi sao");
		printStarTriangle("2.Tam giac ngoi sao");
		
		System.out.println("3.Tam giac ngoi sao");
		printStarTriangle("3.Tam giac ngoi sao");
	}
	
	//khai bao ham in ra tam giac ngoi sao //
	public static void printStarTriangle(String prefixline) {
		System.out.println(prefixline);
		System.out.println("*");
		System.out.println("* *");
		System.out.println("* * *");
		System.out.println("* * * *");
	}

	public static void printNumberTriangle() {
		System.out.println("1");
		System.out.println("2 3");
		System.out.println("4 5 6");
		System.out.println("7 8 9 10");
	}
}

/* workspace
 * 	project
 * 		package 
 * 			class[.java]
 * 				data structure 
 * 				method 
 * 
 * 
 * 
 * 
 * Cu phap de khai bao mot ham/phuong thuc  --> xu ly mot chuc nang 
 * de trong ngoac vuong co cung duoc ko co cung dc 
 * [access modifier] [static] return_type method_name([parameters ...]) {
 * statements
 * body of method 
 * }
 * 
 * 1.[access modifier] = pham vi truy cap 
 * - 4 kha nang 
 * 	+ public: duoc phep goi, truy cap tu bat ky class nao trong project
 * 	+ private: duoc phep goi, truy cap trong class hien tai
 * 	+ protected/none: duoc phep goi, truy cap tu bat ky class nao package hien tai 
 * 
 * 2. [static] = thuoc pham vi class (co the duoc goi truc tiep tu ten class)
 * 		Vi du: EX01TestMainMethod.printTriangle();
 * 
 * 3. return_type = kieu du lieu tra ve cua ham/phuuong thuc 
 * 	+ void: muc dich cua ham sau khi xu ly xong ko can phai lay ket qua tra ve --> return void(ko tra ve chi ca)
 * 
 * 	+ !void(int, double, string ..)
 * 			: muc dich cua ham sau khi xu ly xong can lay ket qua tra ve de reuse, xu ly cac tac vu khac 
 * 
 * Vi du: Tim danh sach sinh vien co DTB > 8.8 de trao hoc bong cuoi ky 
 * input: danh sach sinh vien 
 * process: code tim sinh vien co DTB > 8.8
 * output: sinh vien thoa man dieu kien > 8.8 
 * 
 * + method_name: ten ham/phuong thuc 
 * dat ten theo chuc nang , thuong la 1 dong tu 
 * 
 * + ([parameters ...]): danh sach tham so (dau vao cua ham)
 *  . neu bai toan, ham ko co input ko can truyen tham so vao
 *  . khai bao tham so, nhan ket gia tri tu cho goi ham
 *  - cho nao goi ham --> phai truyen gia tri cho tham so 
 *  
 *  {...}: body, logic thuc thi cua ham
 * 
 * */

package view;

public class Ex04StaticMethodDemo {
	public static void main(String[] args) {
		
	
	/*
	 * cu phap cua 1 ham 
	 * [access_modifier] [static] [final] return data_type method_name(parameters) {
	 * body: statements
	 * }
	 * 
	 * +cac ham phu thuoc vao doi tuong goi no(dang goi)
	 * --> phu thuoc: moi doi tuong goi ham se dua ra ket qua khac nhau
	 * --> non-static
	 * + Cac ham ko phu thuoc vao doi tuong goi no(dang goi)
	 * --> ko phu thuoc: doi tuong nao goi cung nhu nhau
	 * --> static 
	 */
		//Ex04StaticMethodDemo o1= new Ex04StaticMethodDemo()
		//Ex04StaticMethodDemo 02 = new Ex04StaticMethodDemo()
		// o1.printTitle ();
		// o2.printTitle ();
		Ex04StaticMethodDemo.printlnTitle();
		Ex04StaticMethodDemo.printlnTitle();
		
		
	}
	// ham phu thuoc vao gia tri cua tham so truyen vao
	private static int sum (int a , int b) {
		return a + b;
	}
		private static void printlnTitle () {
			System.out.println("Title:Welcome OOP");
		}
	} 



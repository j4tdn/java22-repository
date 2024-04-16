package string_demo;

public class Ex01StringDemo {
	
	public static void main(String[] args) {
		String s = "Welcome to k22 class";
		//Tính chiều dài của s
		System.out.println(s.length());
		
		//Nối chuỗi s1 vào s;
		String s1 = "11/04/2024";
		
		String s2 = s + " " + s1;//s1.concat(s);(concatenate
		
		//Lấy 1 kí tự tại vị trí index(3) trong chuỗi s
		System.out.println(s.charAt(3));
		
		//Duyệt từng kí tự, từ trong chuỗi
		for (int i = 0; i <s.length(); i++) {
			System.out.println("kí tự tại thứ " + i + "trong chuỗi là : ");
			System.out.println(s.charAt(i));
		}
		
		//duyệt từng từ trong chuỗi, mỗi kí tự xong xuống hàng
		String[] elements = s.split("\s");//\s -> space
		for(int i = 0; i<elements.length; i++) {
			System.out.println(elements[i]);
		}
		
		//Tìm vị trị - chỉ số xuất hiện đầu tiên, cuối cùng của kí tự "e" trong chuỗi s
		System.out.println("Vị trí đầu tiên của kí tự e trong chuỗi s " + s.indexOf("e"));
		System.out.println("Vị trí cuối cùng của kí tự e trong chuỗi s " + s.lastIndexOf("e"));
	}
}

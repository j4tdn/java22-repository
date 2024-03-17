package bt2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class app {
	private static List<Vehicle> List = new ArrayList<Vehicle>();
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		
		do {
			System.out.println("======================================================================================"); 
			System.out.println("=      1. Nhập thông tin và tạo N đối tượng xe.                                      =");
			System.out.println("=      2. Xuất bảng kê khai tiền thuế trước bạ của các xe.                           =");
			System.out.println("=      3. Thoát chương trình.                                                        =");
			System.out.println("======================================================================================"); 

			String input = ip.nextLine();
			if("1".equals(input)) {
				do {

					System.out.println("       ==> Nhập số lượng xe: "); 
					String Nstr = ip.nextLine();
					if (isNumber(Nstr)) {
						inputInformation(Integer.parseInt(Nstr));
						break;
					}
				}while(true);
			}
			else if ("2".equals(input)) {
				if(List.size()>0) {
					outputInformation();
				}else System.out.println("       ==> Danh sách đang trống "); 
			}
			else if ("3".equals(input)) {
				System.out.println("       ==> Kết thúc chương trình "); 
				ip.close();
				break;
			}
			else {
				System.out.println("       ==> Không hợp lệ Nhập lại"); 
			}
				
		}while(true);
	}
	
	public static void inputInformation(int N) {
		if(List==null) {
		}else {
		}
		for (int i=1; i<=N; i++) {
			Vehicle v = new Vehicle();
			System.out.println("      "+i+". Nhập tên chủ xe: "); 
			v.setFullName(ip.nextLine());
			System.out.println("      "+i+". Nhập loại xe:"); 
			v.setType(ip.nextLine());
			do {
				System.out.println("      "+i+". Nhập giá trị của xe (vnđ): "); 
				String priceStr = ip.nextLine();
				if (isDouble(priceStr)) {
					v.setPrice(Double.parseDouble(priceStr));
					break;
				}
			}while(true);
			
			do {
				System.out.println("      "+i+". Nhập dung tích xy lanh của xe (cc): "); 
				String CapacityStr = ip.nextLine();
				if (isNumber(CapacityStr)) {
					v.setCapacity(Integer.parseInt(CapacityStr));
					break;
				}
			}while(true);
			v.setTax();
			List.add(v);
		}
	}
	public static void outputInformation() {
		System.out.println("======================================================================================"); 
		System.out.println("  Tên xe\tLoại xe\t\tDung tích\tTrị giá \t\tThuế phải nộp");
		System.out.println("======================================================================================"); 

		for(Vehicle v: List) {
			System.out.println(v.toString());
		}
	}

	
	 private static boolean isDouble(String text) {
	        try {
	            Double.parseDouble(text);
	            return true;
	        } catch (NumberFormatException e) {
	            return false;
	        }
	    }
	 private static boolean isNumber(String text) {
			for (int i = 0; i < text.length(); i++) {
				char letter = text.charAt(i);
				if (!Character.isDigit(letter)) {
					return false;
				}
			}
			return true;
		}
}

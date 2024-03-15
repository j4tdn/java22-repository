package validation_trycatch_throwthrows_finally;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Ex07Finally {
	/*
	 Cú pháp: 
	 + try catch(s)
	 + try catch(s) finally
	 + try finally
	 
	 Ý nghĩa của finally:
	  + dùng để thực thi những đoạn code dù exception, try/catch có xảy ra hay ko
	  + code trong finally luôn đc thực thi
	 */
	//Nhân viên: ID, NAME, AGE
	//Nhân viên(cần lưu file): ID, NAME, FACTOR = (AGE - 18)*2 Hệ số lương
	public static void main(String[] args) {
		String[] employees = mockData(100);
		employees[97] = "97, Le Van97, oo";
		generate("1. Danh sách nhân viên(mock data)", employees);
		
		File file = new File("java22_file.txt");
		if(file.exists()) {
			writeFile(file, employees);
			openFile(file);	
		}
		System.out.println("Kết thúc chương trình");	
	}
	private static void writeFile(File file, String[] employees) {
		FileWriter fw = null;
		try {
			//Khởi tạo đối tượng liên kết với file --> để ghi nội dung
			fw = new FileWriter(file);
			//yêu cầu: ghi từng dòng vào file
			for (String employee: employees) {
				//tiền xử lý
				String[] tokens = employee.split(", ");
				int factor = (Integer.parseInt(tokens[2]) - 18) * 2;
				String line = tokens[0] + ", " + tokens[1] + ", " + factor;
				//ghi từng dòng vào file rồi xuống hàng
				fw.write(line + "\n");
			}
			//save/close file
			//nếu bị exception, ko có dòng nào được ghi vào file => ko hợp lý
			//fw.close();
		} catch (IOException | NumberFormatException e) {
			e.printStackTrace();
			//nếu bị exception, ko có dòng nào được ghi vào file => ko hợp lý
			//fw.close();
		} finally {
			//ko bị exception --> vào đây
			//bị exception --> catch được --> vào đây
			//bị exception --> chưa catch --> vào đây
			
			//luôn được thực thi dù bị exception và xử lý hay ko
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
	}
	private static void openFile(File file) {
		try {
			System.out.println("File is ready to open ..");
			Desktop.getDesktop().open(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static String[] mockData(int nRows) {
		String[] rows = new String[nRows];
		Random rd = new Random();
		for (int i = 0; i < nRows; i++) {
			int id = i + 1;
			String name = "Le Van" + id;
			int age = rd.nextInt(20, 40);
			rows[i] = id + ", " + name + ", " + age;
		}
		return rows;
	}
	private static void generate(String prefix, String[] employees) {
		System.out.println(prefix + " {");
		for (String employee: employees) {
			System.out.println(" + " + employee);
		}
		System.out.println("}\n");
	}

}

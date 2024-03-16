package validation_trycatch_throwthows_finally;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/*
	 * cú pháp 
	 * + try catch(s)
	 * + try catch(s) finally
	 * + try finally
	 * 
	 * 
	 * ý nghĩa finally: 
	 * + dùng để thực thi những đoạn code  dù exception, try/catch xảy ra hay không
	 * + code trong finally luôn được thực thi
	 */
public class Ex07Finally {
	public static void main(String[] args) {
		String[] employees = mockData(100);
		employees[97] = "97,lee do huyn 997, oo";
		generate("1. danh sách", employees);
		
		File file = new File("java22_file.txt");
		if(file.exists()) {
			writeFile(file, employees);
			openFile(file);
		}
		
	}
	private static String[] mockData(int nRows) {
		Random rd = new Random();
		String[] rows = new String[nRows];
		for (int i=0; i<nRows ; i++ ) {
			int id = i+1;
			String name = "Lê Đỗ Huy " +id;
			int age = rd.nextInt(20,40);
			
			rows[i] = id + "," + name + "," + age;
		}
		return rows;
	}
	private static void generate(String prefix, String[] employee) {
		System.out.println(prefix + "--> {" );
		for (String i: employee) {
			System.out.println("    " + i);
		}
		System.out.println("}" );
	}
	private static void writeFile(File file, String[] employees) {
		FileWriter fw = null;
		try {
			// khởi tạo đối tượng liên kết để ghi file
			fw = new FileWriter(file);
			for(String employee: employees) {
				String[] tokens = employee.split(",");
				int factor = (Integer.parseInt(tokens[2]) - 18)* 2;
				String line = tokens[0] + ", " + tokens[1]+ ", " + factor;
				
				fw.write(line +"\n");
			}
//			fw.close();
			} catch (IOException | NumberFormatException e) {
			e.printStackTrace();
		}
		finally {
			
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	private static void openFile(File file) {
		try {
			System.out.println("file is ready to open");
			Desktop.getDesktop().open(file);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

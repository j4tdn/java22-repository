package validation_trycatch_throwthrows;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Ex07Finally {
	/*
	 * cú pháp 
	 *  try catch(s) 
	 *  try catch(s) finally
	 *  try finally
	 *  
	 *  Ý nghĩa của finally
	 *  	dùng để thực thi những đoạn code dù exception, thì vẫn luôn thực thi nó
	 */
	
	
	public static void main (String[] args) {
		String[] employees = mockData(100);
		employees[97]="97, Le Van97, oo";
		generate("1. Danh sach nhan vien (mock data) ", employees);
		
		File file = new File("Java22_file.txt");
		if(file.exists()) {
			writeFile(file,employees);
			openFile(file);
		}
		System.out.println(" Ket thuc chuong trinh ");
	}
	
	private static void writeFile(File file, String[] employees) {
		FileWriter fw = null;
		try {
			//khoi tao doi tuong lien ket voi file --> de ghi noi dung
			fw = new FileWriter(file);
			
			//yêu cầu ghi từng dòng vào file
			for(String employee : employees) {
				String[] tokens = employee.split(", ");
				int factor = (Integer.parseInt(tokens[2])-18)*2;
				String line = tokens[0]+ ", "+tokens[1]+", "+factor;
				
				//ghi từng dòng rồi xuống hàng
				fw.write(line +"\n");
			}
			
			//fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
	}
	
	private static void openFile(File file) {
		try {
			System.out.println(" File is ready to open ...");
			Desktop.getDesktop().open(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static String[] mockData(int nRows) {
		
		String[] rows = new String[nRows];
		Random rd = new Random();
		for(int i = 0; i<nRows; i++) {
			
			int id = i+1;
			String name = "Le Van" +id;
			int age = rd.nextInt(20,40);
			
			rows[i] = id + ", " + name + ", "+age;
		}
		return rows;
	}
	
	private static void generate(String prefix, String[] employees) {
		System.out.println(prefix + " --> {");
		for (String employee : employees) {
			System.out.println("    "+ employee);
		}
		System.out.println("}");
	}
}

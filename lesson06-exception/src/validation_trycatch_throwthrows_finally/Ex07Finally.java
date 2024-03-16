package validation_trycatch_throwthrows_finally;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Ex07Finally {
    public static void main(String[] args) {
		/*
		 Ý nghĩa finally
		 -Dùng để thực thi những đoạn code dù exception, try/catch có xảy ra hay không
		 -Code trong finally luôn được thực thi
		  */
    	String[] employees = mockData(100);
    	generate("1. Danh sách nhân viên", employees);
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
    		// Khởi tạo đối tượng liên kết với file --> ghi nội dung
    		fw = new FileWriter(file);
    		for (String employee: employees) {
    			String[] tokens = employee.split(", "); 
    			int factor = (Integer.parseInt(tokens[2])-18)*2;
    			String line = tokens[0]+", "+ tokens[1] + ", " + factor;
    			fw.write(line +"\n ");
    		}
    		fw.close();
    	} catch(IOException e) {
    		e.printStackTrace();
    	}
    }
    
    private static void openFile(File file) {
    	try {
    		System.out.println("File is ready to open");
    		Desktop.getDesktop().open(file);
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    }
    
    private static String[] mockData(int nRows) {
    	String[] rows = new String[nRows];
    	Random rd = new Random();
    	for (int i = 0; i<nRows;i++) {
    		int id = i+1;
    		String name = "Lê Văn " + id;
    		int age = rd.nextInt(20,40);
    		rows[i]=id+", " + name + ", " + age;
    	}
    	return rows;
    }
    
    private static void generate(String prefix, String[] employees) {
    	System.out.println(prefix + " ---> {");
    	for (String employee: employees) {
    		System.out.println("   " + employee);
    	}
    	System.out.println("\n");
    }
}

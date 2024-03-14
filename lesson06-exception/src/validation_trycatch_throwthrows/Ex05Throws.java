package validation_trycatch_throwthrows;

import java.io.File;
import java.io.IOException;

public class Ex05Throws {
	public static void main(String[] args) {
		//lưu ý: hàm main không được throws nữa, vì không có chỗ nào khác gọi hàm main
		try {
			File file =createNewFile("Java22_file.txt");
			System.out.println("file path "+file.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	private static File createNewFile(String filename) throws IOException {
		
		File file = new File(filename);
		boolean isSucess = file.createNewFile();	
		
		System.out.println("is File created successful ? " + isSucess);
		
		return file;
	}
	
}

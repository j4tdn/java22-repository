package validation_trycatch_throwthrows_finally;

import java.io.File;
import java.io.IOException;

public class Ex05Throws {

	public static void main(String[] args) {
		//lưu ý: hàm main ko dc throws nữa, vì ko có chỗ nào khác gọi hàm main 
//		createFile("java22_file.txt");
		
		try {
			File file = createFile("java22_file.txt");
			System.out.println("file path: " + file.getAbsolutePath());
			
		} catch(IOException e){
			e.printStackTrace();
		}
	}
	
	private static File createFile(String filename) throws IOException {
		File file = new File(filename);
		
		boolean isSuccess = file.createNewFile();
		
		System.out.println("is File create successful ? " + isSuccess);
		
		return file;
	}
}

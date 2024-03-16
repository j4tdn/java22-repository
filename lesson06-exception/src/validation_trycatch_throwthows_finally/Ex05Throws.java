package validation_trycatch_throwthows_finally;

import java.io.File;
import java.io.IOException;

public class Ex05Throws {
	public static void main(String[] args) {
		// lưu ý hàm main ko đc throws nửa, vì không có chỗ nào khác gọi hàm main
		try {
			File file = creatNewFile("java22_file.txt");	
			System.out.println("file path:" + file.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
	
	private static File creatNewFile(String fileName) throws IOException {
		File file = new File(fileName);
		// bắt buộc phải xử lí Exception (try/catch - throw/throws)
		
		boolean isSucess = file.createNewFile();
		
		System.out.println("is file created successful ?" + isSucess);
		return file;
	}
}

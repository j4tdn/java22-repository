package validation_trycatch_throwthrows_finally;

import java.io.File;
import java.io.IOException;

public class Ex05Throws {
	

	public static void main(String[] args) {
		//lưu ý hàm main ko đc gọi hàm main vì ko có chỗ nào khác gọi hàm main đc nữa
		
		try {
			File file = createNewFile("java22_file.txt");
			System.out.println("file path: "+ file.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static File createNewFile(String filename) throws IOException{
		File file = new File(filename);
		
		//bắt buộc xử lý exception
		boolean isSucess = file.createNewFile();
		
		System.out.println("is File created successful ? " + isSucess);
		
		return file;
	}
	
	/*
	 * Trong Java có 2 loại exception
	 * 
	 + compile exception: là những exc Java quy định bắt buộc phải xử lý tại compile
	 --> checked exception
	 --> công thức : class Exception nào là con đi ra từ nhánh IOException
	 
	 + runtime exception: là những exc java ko bắt buộc phải xử lý tại compile
	 --> unchecked exception
	 --> công thức : class Exception nào là con đi ra từ nhánh RuntimeException
	 
	 + đặc biệt: Exception thuộc nhóm compile
	 
	 
	 */
}

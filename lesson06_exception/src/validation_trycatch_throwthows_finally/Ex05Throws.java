package validation_trycatch_throwthows_finally;

import java.io.File;
import java.io.IOException;

public class Ex05Throws {
	
	public static void main(String[] args) {
		// lưu ý: hàm main ko được throws nữa, vì k có chỗ nào khác gọi hàm main
		
		try {
			File file = createFile("java22_file.txt");
			System.out.println("file path: " + file.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private static File createFile(String filename) throws IOException {
		
		File file = new File(filename);
		
		// bắt buộc phải xử lý exception(try/catch - throw/throws)
		// Unhandled exception type IOException
		boolean isSucess = file.createNewFile();
		
		System.out.println("is File created successful ? " + isSucess);
		
		return file;
	}
	
	/*
	 
	 Trong Java có 2 loại exception - quy ước
	 
	 + compile exception: là những exception Java quy định bắt bước phải xử lý tại compile
	   --> checked exception
	   --> công thức: class Exception nào là con đi ra từ nhánh IOException
	  
	 + runtime exception: là những exception Java ko bắt buộc phải xử lý tại compile
	   --> unchecked exception
	   --> công thức: class Exception nào là con đi ra từ nhánh RuntimeException
	  
	 + đặc biệt: Exception thuộc nhóm compile
	 
	 ===================================================================================
	 
	 Trong hàm nếu mình có 'throw' new 1 runtime exception(VD ArithmeticException) 
	 --> thì chỗ khai báo hàm không cần phải khai báo 'throws' exception đó
	 --> chỗ gọi hàm ko bắt buộc phải xử lý(nên xử lý)
	     
	 Trong hàm nếu mình có 'throw' new 1 compile exception(VD IOException) 
	 --> thì chỗ khai báo hàm bắt buộc phải khai báo 'throws' exception đó
	 --> chỗ gọi hàm bắt buộc phải xử lý(try/catch - throws đi chỗ khác)
	 
	 */
}
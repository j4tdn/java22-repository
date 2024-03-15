package validation_trycatch_throwthrows_finally;

import java.io.File;
import java.io.IOException;

public class Ex05Throws {
	public static void main(String[] args) {
		// lưu ý : hàm main ko đc throws nữa, vì ko có chỗ nào kahsc gọi hàm main
		try {
			File file = createNewFile("java22_file.txt");
			System.out.println("file path: " + file.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private static File createNewFile(String filename) throws IOException {
		File file = new File(filename);
		//bắt buộc phải xử lý exception(try/catch - throw/throws)
		// unhandled exception type IOException
		boolean isSuces = file.createNewFile();
		System.out.println("is File created successful ? " + isSuces);
		return file;
	}
	/*
	 Trong java có 2 loại exception - quy ước:
	 + compile exception: là những exception Java quy định bắt buộc phải xử lý
	   tại compile --> checked exception
	   --> công thức: class exception nào là con đi ra từ nhánh IOException
	   
	 + runtime exception: là những exception Java ko bắt buộc phải xử lý tại  compile
	   --> unchecked exception
	   --> công thức: class exception nào là con đi ra từ nhánh RuntimeException
	 
	 + đặc biệt: exception thuộc nhóm compile
	 */

}

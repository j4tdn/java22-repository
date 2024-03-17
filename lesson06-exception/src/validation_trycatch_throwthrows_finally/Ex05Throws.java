package validation_trycatch_throwthrows_finally;

import java.io.File;
import java.io.IOException;

public class Ex05Throws {

	public static void main(String[] args) {
		
		try {
			File file = creatFile("java 22 file.txt");
			System.out.println("file path: " + file.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static File creatFile(String fileName) throws IOException {
		
		File file = new File(fileName);
		
		boolean isSucess = file.createNewFile();
	
		System.out.println("is File created successful ? " + isSucess);
		
		return file;
	}
}

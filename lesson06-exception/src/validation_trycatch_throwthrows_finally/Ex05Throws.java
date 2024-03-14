package validation_trycatch_throwthrows_finally;

import java.io.File;
import java.io.IOException;

public class Ex05Throws {

	public static void main(String[] args) {
		try {
			File file = createFile("java22_file.txt");
			System.out.println("file path " + file.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static File createFile(String filename) throws IOException {
		File file = new File(filename);

		boolean isSuccess = file.createNewFile();

		System.out.println("is File created successful? " + isSuccess);

		return file;
	}
}

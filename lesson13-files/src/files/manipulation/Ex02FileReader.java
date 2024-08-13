package files.manipulation;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class Ex02FileReader {
	
	public static void main(String[] args) {
		File file  = new File("private/text02.txt");
		
		try {
			List<String> lines = Files.readAllLines(file.toPath());
			lines.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

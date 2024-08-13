package files.definition;

import java.io.File;

import utils.FileUtils;

public class Ex02FilesRemoval {
	public static void main(String[] args) {
		File file = new File("private/text01.txt");
		file.delete();
		
//		File folder = new File("private");
//		file.delete();
		
		File folder = new File("xxx");
		FileUtils.deleteFolder(folder, true);
		
	}
}

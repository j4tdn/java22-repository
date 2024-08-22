package file.definition;

import java.io.File;

import utils.FileUtils;

public class Ex02FileRemoval {
	public static void main(String[] args) {
		// File file = new File("private/security.txt");
		// file.delete();
				
		// File folder = new File("private");
		// folder.delete();
				
		File folder = new File("xxx");
		FileUtils.deleteFolder(folder, true);
				
		System.out.println("== Finished ==");
	}
	
}

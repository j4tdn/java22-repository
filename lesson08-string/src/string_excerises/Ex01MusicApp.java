package string_excerises;

import java.awt.desktop.PrintFilesEvent;
import java.io.File;
import java.io.FileFilter;

public class Ex01MusicApp {
	
	public static void main(String[] args) {
		String dirPath = "metadata/music";
		
		// tạo đối tượng file trỏ đến thư muc music
		// file tương tác được cả file và folder
		File dir = new File(dirPath);
		if(dir.exists()) {
//			String[] files = dir.list();
			
//			//cách 1
//			File[] files = dir.listFiles();
//			for(File file : files) {
//				if(file.isFile()) {
//					String fileName = file.getName();
//					if(fileName.endsWith(".mp3"))
//						System.out.println("file --> " + fileName);
//				}
//			}
			
			//cách 2
			File[] mp3files = dir.listFiles(file -> file.isFile() && file.getName().endsWith(".mp3"));
			printf(mp3files);
			return;
		}
		System.out.println("Thư mục " + dirPath+ " Không tồn tại!!!");
	}
	private static void printf(File[] files) {
		for(File file : files) {
			
					System.out.println("file --> " + file.getName());
			
		}
	}
}
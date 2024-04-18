package string_exercises;

import java.io.File;

public class Ex01MusicApp {

	
	public static void main(String[] args) {
		String dirPath = "metadata/music";
		
		//tạo đối tượng file trỏ đến thư mục music 
		//Java --> Java.io.File tưogn tác dc với cả file, folder
		File dir = new File(dirPath);
//		if (dir.exists()) {
//			File[] files = dir.listFiles();
//			for (File file: files) {
//				if (file.isFile()) {
//					String filename = file.getName();
//					if (filename.endsWith(dirPath))
//				}
//				System.out.println("file --> " + file);
//			}
//			return; 
//		}
		
		if (dir.exists()) {
			File[] mp3Files = dir.listFiles(file -> file.isFile() && file.getName().endsWith(".mp3"));
			printf(mp3Files);
			return;
		}
		
		System.out.println("Thư mục '" + dirPath + "' không tồn tại !!");
		
		
	}
	
	private static void printf(File[] files) {
		for (int i = 0 ; i < files.length; i++) {
			System.out.println(i+1 + ". " + files[i].getName());
		}
	}
}

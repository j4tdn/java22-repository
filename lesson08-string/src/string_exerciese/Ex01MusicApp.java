package string_exerciese;

import java.io.File;

public class Ex01MusicApp {
	public static void main(String[] args) {
		// đường dẫn đến thư mục music
		String dirPath = "metadata/music";
				
		// tạo đối tượng file trỏ đến thư mục music
		// Java --> java.io.File tương tác được với cả file, folder
		File dir = new File(dirPath);
		if (dir.exists()) {
			// list --> lấy ra tên các file/folder trong dir
			// String[] files = dir.list();
			File[] mp3Files = dir.listFiles(file -> file.isFile() && file.getName().endsWith(".mp3"));
			printf(mp3Files);
			return;
		}
		System.out.println("Thư mục '" + dirPath + "' không tồn tại");
	}
	private static void printf(File[] files) {
		for (int i = 0; i < files.length; i++) {
			System.out.println(i+1 + ". " + files[i].getName());
		}
	}
}

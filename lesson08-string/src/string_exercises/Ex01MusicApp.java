package string_exercises;

import java.io.File;

public class Ex01MusicApp {
	
	public static void main(String[] args) {
		//Duong dan 
		String dirPath = "metadata/music";
		
		//Tao doi tuong file tro den thu muc music
		
		File dir = new File(dirPath);
        if (dir.exists()) {
        	File[] mp3Files = dir.listFiles(file -> file.isFile() && file.getName().endsWith(".mp3"));
        	printf(mp3Files);
        	return;
        }
        System.out.println("Thu muc" + dirPath + "khong ton tai");
	}
	private static void printf(File[] files) {
		for( int i = 0 ; i < files.length ; i++) {
			System.out.println(i+1 + "." + files[i].getName());
		}
	}

}

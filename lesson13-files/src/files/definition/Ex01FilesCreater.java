package files.definition;

import java.io.File;

public class Ex01FilesCreater {
	
	public static void main(String[] args) {
		
		String path = "private/text01.txt";
		
		File file = new File(path);
		if(!file.exists()) {
			File parent = file.getParentFile();
			if(!parent.exists()) {
				parent.mkdirs();
				System.out.println("Creating parent folder "+ parent.getPath() );				
			}
			try {
				file.createNewFile();
				System.out.println("Creating file"+ file.getPath() );
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("...");
	}
}
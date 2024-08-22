package file.definition;

import java.io.File;
import java.io.IOException;

public class Ex01FileCreater {
	/*
	 Tạo file, folder sử dụng class >>java.io.file<< hoặc java.nio.file.Path trong java
	 
	 + file   --> createNewFile
	 + folder --> mkdir/mkdirs
	 */
	public static void main(String[] args) {
		// path: filename, path fron parent folder to filename
		//     : relative path( đường dẫn tương đói, oath ko có tên ô đĩa) --> tạo từ vị trí đang đứng trong dự án
		//     : absolute path(đường dẫn tuyệt đối) --> tạo từ giá trị path điền vào
		
		// mặc định: tạo file trong folder chưa tồn tại --> báo lỗi
		
		System.out.println("=== Start ===\n");
		File file = new File("public/data.txt");
		if (!file.exists()) {
			boolean isSuccess = false;
			File parent = file.getParentFile();
			if(!parent.exists()) {
				isSuccess = parent.mkdir();
				System.out.println("Craeting parent folder '" + parent.getPath() + "' --> " + isSuccess);
			}
			try {
				isSuccess = file.createNewFile();
				System.out.println("Create file '" + file.getName() + "' --> " + isSuccess);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("File '" + file.getPath() + "' is already existed !!!");
		}
		
		System.out.println("\n=== End ===");
	}

}

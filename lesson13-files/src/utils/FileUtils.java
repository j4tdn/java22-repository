package utils;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class FileUtils {
	public FileUtils() {
	}
	

	public static <T> void writeFile(File file, Collection<T> elements, Function<T, String> transformer) {
		Path path = file.toPath();
		List<String> lines = elements.stream().map(e -> transformer.apply(e)).toList();
		
		try {
			Files.write(path, lines);
			Desktop.getDesktop().open(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void writeFile(File file, Iterable<? extends CharSequence> lines) {
		Path path = file.toPath();
		try {
			Files.write(path, lines);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
// =============================================
	public static void deleteFile(File file) {
		if(file.isDirectory()) {
			file.delete();
		}
	}
	public static void deleteFolder(File folder) {
		if(folder.isDirectory()) {
			folder.delete();
		}
	}
	public static void deleteFolder(File folder, boolean removeSubFiles) {
		if(folder.isDirectory()) {
			if(removeSubFiles) {
				File[] subFiles = folder.listFiles();
				Arrays.stream(subFiles).forEach(subFile -> {
					subFile.delete();
					System.out.println("deleted file --> "+ subFile.getPath());
				});
			}
			System.out.println("deleted file --> "+ folder.getPath());
			folder.delete();
		}
	}
	
	public static File CreateFile(String path) {
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
		return file;
	}
	public static File CreateFolder(String path) {
		File folder = new File(path);
		if (!folder.exists()) {
			try {
				boolean isSuccess = folder.mkdirs();
				System.out.println("Creating parent folder '" + folder.getPath() + "' --> " + isSuccess);
			} catch (Exception e) {
				folder = null;
				e.printStackTrace();
			}
		}
		return folder;
	}
}

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

import bean.Item;
import model.DataModel;

public class FileUtils {
	
	private FileUtils() {
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
	
	
	// ===========================================================
	
	public static void deleteFile(File file) {
		if(file.isFile()) {
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
			if (removeSubFiles) {
				File[] subFiles = folder.listFiles();
				Arrays.stream(subFiles).forEach(subFile -> {
					subFile.delete();
					System.out.println("deleted file --> " + subFile.getPath());
				});
			}
			folder.delete();
		}
	}
	
	public static File createFile(String path) {
		File file = new File("public/data.txt");
		if (!file.exists()) {
			boolean isSuccess = false;
			File parent = file.getParentFile();
			if (!parent.exists()) {
				isSuccess = parent.mkdirs();
				System.out.println("Creating parent folder '" + parent.getPath() + "' --> " + isSuccess);
			}
			try {
				isSuccess = file.createNewFile();
				System.out.println("Creating file '" + file.getPath() + "' --> " + isSuccess);
			} catch (IOException e) {
				file = null;
				e.printStackTrace();
			}
		} else {
			System.out.println("File '" + file.getPath()  + "' is already existed !!!");
		}
		return file;
	}
	
	public static File createFolder(String path) {
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

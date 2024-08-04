package files.manipulation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import bean.Item;

public class Ex04FileReaderSerialized {
	
	public static void main(String[] args) {
		
		File file = new File("testcase/test03.txt");
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			
			Object object = ois.readObject();
			
			@SuppressWarnings("unchecked")
			List<Item> items = (List<Item>)object;
			
			items.forEach(System.out::println);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
}

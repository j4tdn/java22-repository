package files.manipulation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import bean.Item;
import model.DataModel;

public class Ex03FileWriterSerialized {

public static void main(String[] args) {
		
		File file = new File("private/text01.txt");
		List<Item> items = DataModel.getItems();
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			if(!file.exists()) {
				file.createNewFile();
				System.out.println(" .1. ");
			}
			
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(items);
			System.out.println(" .2. ");
			
		
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
}

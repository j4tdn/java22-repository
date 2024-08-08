package files.manipulation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

import bean.Item;
import model.DataModel;

public class Ex03FileWriterSerialized {
	
	public static void main(String[] args) {
		
		List<Item> items = DataModel.getItems();
		
		File file = new File("testcase/test03.txt");
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			
			// lưu data ở dạng serializeds
			oos.writeObject(items);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// close connection, save file
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("finished");
		
	}
	
}

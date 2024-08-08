package files.manipulation;

import java.io.File;

import bean.Item;
import model.DataModel;
import utils.FileUtils;

public class Ex01FileWriter {
	
	public static void main(String[] args) {
		File file = new File("testcase/test01.txt");
		
		FileUtils.writeFile(file, DataModel.getItems(), Item::toLine);
		
		System.out.println("=== Finished ===");
	}
	
}

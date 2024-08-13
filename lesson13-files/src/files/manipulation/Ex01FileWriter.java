package files.manipulation;

import java.io.File;
import bean.Item;
import model.DataModel;
import utils.FileUtils;

public class Ex01FileWriter {
	public static void main(String[] args) {
		
		File file = new File("private/text02.txt");
		
//		Path path = Paths.get("private/text02.txt");
		
		FileUtils.writeFile(file, DataModel.getItems(), Item::toLine);
	}
}

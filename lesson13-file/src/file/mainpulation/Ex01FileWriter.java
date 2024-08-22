package file.mainpulation;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

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

package view;


import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import static utils.PrintUtils.*;


import bean.Apple;

public class Ex05ConstructorReferenceDemo {

	private static final String PATH = "inventory.txt";
	public static void main(String[] args) {
		List<String> lines = readFile(PATH);
		generate("lines", lines);
		
		// Yêu cầu:
		// Convert lines(List<String>) -> List<Apple>
		
		List<Apple> apples = convert(lines, Apple::new);
		generate("Convert lines to apple", apples);
	}

	
	private static<T> List<T> convert(List<String> lines, Function<String, T> function)  {
		List<T> result = new ArrayList<>();
		for(String line: lines) {
			result.add(function.apply(line));
		}
		return result;
	}
	
	private static List<String> readFile(String path){
		List<String> data = new ArrayList<>();
		try {
			data = Files.readAllLines(Path.of(path));
		}catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}
	
}
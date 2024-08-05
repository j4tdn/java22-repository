package view;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import bean.Apple;

import static utils.PrintUtils.*;

public class Ex05ConstructorReferenceDemo {
	
	private static final String PATH = "inventory-187.txt";
	
	public static void main(String[] args) {
		List<String> lines = readFile(PATH);
		
		generate("lines", lines);
		
		// Yêu cầu
		// Convert lines(List<String>) -> List<Apple>
		
//		List<Apple> apples = convert(lines, line -> {
//			String[] tokens = line.split("[ ,]+");
//			Double weight = Double.parseDouble(tokens[2].substring(0, tokens[2].length() - 1));
//			return new Apple(Integer.parseInt(tokens[0]), tokens[1], weight, tokens[3]);
//		});
		
		//List<Apple> apples = convert(lines, Apple::transfer);
		List<Apple> apples = convert(lines, Apple::new);
		generate("Convert lines to apples", apples);
		
	}
	
	// file -> List<String> -> List<Apple>
	// file -> List<String> -> List<Item>
	
	private static <T> List<T> convert(List<String> lines, Function<String, T> function){
		List<T> elements = new ArrayList<>();
		for(String line: lines) {
			// 101, red, 22g, DaNang
			T apple = function.apply(line);
			elements.add(apple);
		}
		return elements;
	}
	
	private static List<String> readFile(String path){
		List<String> data = new ArrayList<>();
		try {
			data = Files.readAllLines(Path.of(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}
	
}

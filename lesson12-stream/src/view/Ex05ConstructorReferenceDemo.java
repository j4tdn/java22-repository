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
		generate("lines",lines);
		
		List<Apple> apples = convert(lines, Apple::new);
		generate("apples", apples);
        
			
		
		
	}

	private static <T> List<T> convert(List<String> lines, Function<String, T> function){
		List<T> element = new ArrayList<>();
		
		for( String line: lines) {
			T t = function.apply(line);
			element.add(t);
		}
		return element;
		
	}
	private static List<String> readFile(String path){
		List<String> data = new ArrayList<>();
		try {
			data = Files.readAllLines(Path.of(path));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return data;
		
		
	}
}

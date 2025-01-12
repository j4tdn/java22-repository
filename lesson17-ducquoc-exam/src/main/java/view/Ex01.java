package view;

import javax.annotation.processing.Generated;
import static utils.PrintUtils.*;

import service.ClassResultService;
import service.ClassResultServiceImpl;
import service.studenService;
import service.studenServiceImpl;

public class Ex01 {
	
	private static ClassResultService classResultService;
	static {
		classResultService = new ClassResultServiceImpl();
	}
	private static studenService studenService;
	static {
		studenService = new studenServiceImpl(); 
	}
	public static void main(String[] args) {
		System.out.println("Bắt đầu chương trình");
		System.out.println("==================\n");
		
		generate(
			"1. liệt kê các hjocj sinh theo id lớp ", 
			studenService.get(1)
		);
		generate(
				"1. Liệt kê tên lớp tên học sinh có điểm toán trên 8 văn trên 8 ", 
				classResultService.getAll()
			);
	}
}

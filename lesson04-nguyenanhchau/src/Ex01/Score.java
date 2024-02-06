package Ex01;

import java.math.BigDecimal;

public class Score {
	public static void main(String[] args) {
		Student sv1 = new Student(01,"AnhChau",new BigDecimal("9.0"),new BigDecimal("10.0"));
		Student sv2 = new Student(02,"Lily",new BigDecimal("10.0"),new BigDecimal("9.0"));
        Student sv3 = new Student();
        sv3.inputInfo();
        
        Student[] arrStudent = {sv1, sv2, sv3};

        Student.averageScore(arrStudent);
        Student.highertheoryScore(arrStudent);
        
        
	}

}

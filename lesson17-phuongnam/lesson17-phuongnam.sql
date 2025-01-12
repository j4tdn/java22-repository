
CREATE DATABASE java22_student CHAR SET utf8mb4;
use java22_student;

CREATE TABLE T01_STUDENT(
	C01_ID_STUDENT INT PRIMARY KEY AUTO_INCREMENT,
	C01_STUDENT_NAME VARCHAR(255) NOT NULL, 
	C01_GENDER VARCHAR(255), 
	C01_ID_CLASS INT NOT NULL

);

CREATE TABLE T02_RESULT(
    C02_ID_STUDENT INT NOT NULL,
    C02_SUBJECT VARCHAR(255) NOT NULL,
    C02_RESULT DECIMAL(2,1) NOT NULL
    
);

CREATE TABLE T03_CLASS(
	C03_ID_CLASS INT PRIMARY KEY AUTO_INCREMENT,
    C03_CLASS_NAME VARCHAR(255) NOT NULL,
    C03_TEACHER VARCHAR(255) NOT NULL,
	CONSTRAINT UNQ_T03_C03_CLASS_NAME UNIQUE(C03_CLASS_NAME)

);

ALTER TABLE t02_result ADD UNIQUE `unique_index`(`C02_ID_STUDENT`, `C02_SUBJECT`);

ALTER TABLE T01_STUDENT
ADD CONSTRAINT FK_T01_T03 FOREIGN KEY (C01_ID_CLASS) REFERENCES T03_CLASS(C03_ID_CLASS);

ALTER TABLE T02_RESULT
ADD CONSTRAINT FK_T02_T01 FOREIGN KEY (C02_ID_STUDENT) REFERENCES T01_STUDENT(C01_ID_STUDENT);

SET FOREIGN_KEY_CHECKS = 0;
SET FOREIGN_KEY_CHECKS = 1;

INSERT INTO T01_STUDENT 
VALUES (1, 'Dinh Thi Ngoc', "Female", 2),
	   (2, "Nguyen Thanh Hung", "Male", 1),
       (3, "Tran Mai Hoa", "Female", 2),
       (4, "Doan Quang Vinh", "Male", 1),
       (5, "Cao Anh Dao", "Female", 3),
       (6, "Tran Van A", "Male", 3);
       

INSERT INTO t02_result
VALUES ( 1, "Math", 8.0),
	   ( 2, "Literature", 7.0),
       ( 3, "History", 9.5),
       ( 4, "Math", 6.8),
       ( 5, "Literature", 4.9),
       ( 6, "History", 8.2),
       ( 7, "Math", 9.8),
       ( 8, "Literature", 7.2),
       ( 9, "History", 8.8);
       
INSERT INTO t03_class
VALUES (1, "12A", "Ho Cong Trung"),
	   (2, "12B", "Dang Tu Anh"),
       (3, "12C", "Nguyen Van Tam");
       
       
-- Quesition 1 : Primary key of Result table is C02_ID_STUDENT and  C02_SUBJECT

-- question 2 :
SELECT t01_student.C01_STUDENT_NAME, t01_student.C01_GENDER, t03_class.C03_TEACHER
FROM t01_student 
JOIN t03_class 
ON t01_student.C01_ID_CLASS = t03_class.C03_ID_CLASS;

SELECT t03_class.C03_TEACHER, COUNT(*) 
FROM t01_student
JOIN t03_class 
ON t01_student.C01_ID_CLASS = t03_class.C03_ID_CLASS
WHERE t03_class.C03_CLASS_NAME = "12C"
GROUP BY t03_class.C03_CLASS_NAME;

SELECT t03_class.C03_CLASS_NAME , COUNT(*) 
FROM t01_student
JOIN t03_class
ON t01_student.C01_ID_CLASS = t03_class.C03_ID_CLASS
JOIN t02_result
ON t01_student.C01_ID_STUDENT = t02_result.C02_ID_STUDENT
WHERE t02_result.C02_SUBJECT = "Math" AND t02_result.C02_SUBJECT = "Literature"
AND t02_result.C02_RESULT >= 8.0 
GROUP BY t03_class.C03_CLASS_NAME
 

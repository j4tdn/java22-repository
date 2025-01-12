CREATE DATABASE lesson17_hdoan;

USE lesson17_hdoan;
-- 1 class N student
-- 1 student N result 

-- 1. What is primary key of Result table
-- Khóa chính của bảng Result sẽ là tổ hợp của student_id và subject
-- Để đảm bảo tính duy nhất của mỗi record --> mỗi student sẽ có 1 score cho 1 subject nhất định

CREATE TABLE CLASS(
	ID INT PRIMARY KEY,
    NAME_CLASS VARCHAR(50),
    TEACHER VARCHAR(50)
);

CREATE TABLE STUDENT(
	ID INT PRIMARY KEY,
    NAME_STUDENT VARCHAR(50),
    GENDER VARCHAR(10),
    CLASS_ID INT,
    FOREIGN KEY (CLASS_ID) REFERENCES CLASS(ID)
);

CREATE TABLE RESULT(
	STUDENT_ID INT, 
    SUBJECT_RESULT VARCHAR(50),
    SCORE DECIMAL(5,2),
    PRIMARY KEY (STUDENT_ID, SUBJECT_RESULT),
    FOREIGN KEY (STUDENT_ID) REFERENCES STUDENT(ID)
);

INSERT INTO CLASS(ID, NAME_CLASS, TEACHER)
VALUES (1, "12A", "Ho Cong Trung"),
(2, "12B", "Dang Tu Anh"),
(3, "12C", "Nguyen Van Tam");

INSERT INTO STUDENT(ID, NAME_STUDENT, GENDER, CLASS_ID)
VALUES (1, "Dinh Thi Ngoc", "Female", 2),
(2, "Tran Thanh Hung", "Male", 1),
(3, "Tran Mai Hoa", "Female", 2),
(4, "Doan Quang Vinh", "Female", 1),
(5, "Cao Anh Dao", "Female", 3),
(6, "Tran Kim Tuyen", "Female", 3);

SET FOREIGN_KEY_CHECKS = 0;

INSERT INTO RESULT(STUDENT_ID, SUBJECT_RESULT, SCORE)
VALUES (1, "Math", 8),
(2, "Literature", 7),
(3, "History", 9.5),
(4, "Math", 6.8),
(5, "Literature", 4.9),
(6, "History", 8.2),
(7, "Math", 9.8),
(8, "Literature", 7.2),
(9, "History", 8.8);

SET FOREIGN_KEY_CHECKS = 1;

-- 2. List name, gender and teacher name of all students
SELECT NAME_STUDENT,
	   GENDER, 
       c.TEACHER
FROM STUDENT s 
JOIN CLASS c ON s.CLASS_ID = c.ID;

-- 3. List teacher name and number of all student in class 12C
SELECT c.TEACHER,
	   COUNT(*) StudentAmount
FROM STUDENT s
JOIN CLASS c ON s.CLASS_ID = c.ID
WHERE c.NAME_CLASS = '12C'
GROUP BY c.TEACHER;

-- 4. List the class name and number of the students who have good at Math(score >= 8) and good at Literature (score >= 8)
SELECT c.NAME_CLASS,
	   COUNT(*) AmountStudent
FROM STUDENT s
JOIN CLASS c ON s.CLASS_ID = c.ID
JOIN RESULT r ON s.ID = r.STUDENT_ID
WHERE (r.SUBJECT_RESULT = 'Math' AND r.SCORE >= 8)
AND (r.SUBJECT_RESULT = 'Literature' AND r.SCORE >= 8)
GROUP BY c.NAME_CLASS








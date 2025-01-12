CREATE DATABASE LESSON17_JDBC;
USE LESSON17_JDBC;

CREATE TABLE CLASS(
	ID INT PRIMARY KEY NOT NULL,
    NAME VARCHAR(255) NOT NULL,
    TEACHER VARCHAR(255) NOT NULL
);

CREATE TABLE STUDENT(
	ID INT PRIMARY KEY NOT NULL,
    NAME VARCHAR(255) NOT NULL,
    GENDER VARCHAR(10) NOT NULL,
	CLASS_ID INT NOT NULL,
    CONSTRAINT CHECK_GENDER CHECK (GENDER IN ('Male', 'Female')),
    CONSTRAINT FK_STUDENT_CLASS_ID FOREIGN KEY (CLASS_ID) REFERENCES CLASS(ID)
);



SET FOREIGN_KEY_CHECKS = 1;
CREATE TABLE RESULT(
	STUDENT_ID INT PRIMARY KEY NOT NULL,
    SUBJECT VARCHAR(255) NOT NULL, 
    SCORE FLOAT NOT NULL,
    CONSTRAINT FK_RESULT_STUDENT_ID FOREIGN KEY (STUDENT_ID) REFERENCES STUDENT(ID)
);

INSERT INTO STUDENT(ID, NAME, GENDER, CLASS_ID)
VALUES
	(1, 'Dinh Thi Ngoc', 'Female', 2),
    (2, 'Nguyen Thanh Hung', 'Male', 1),
    (3, 'Tran Mai Hoa', 'Female', 2),
    (4, 'Doan Quang Vinh', 'Male', 1),
    (5, 'Cao Anh Dao', 'Female', 3),
    (6, 'Tran Kim Tuyen', 'Male', 3);
    
INSERT INTO result(STUDENT_ID, SUBJECT, SCORE)
VALUES
	(1, 'Math', 8),
    (2, 'Literature', 7),
    (3, 'History', 9.5),
    (4, 'Math', 6.8),
    (5, 'Literature', 4.9),
    (6, 'History', 8.2),
	(7, 'Math', 9.8),
    (8, 'Literature', 7.2),
    (9, 'History', 8.8);
    
INSERT INTO CLASS(ID,NAME,TEACHER)
VALUES
	(1, '12A', 'Ho Cong Trung'),
	(2, '12B', 'Dang Tu Anh'),
    (3, '12C', 'Nguyen Van Tam');


-- Câu 1: STUDENT_ID
-- Câu 2: 
SELECT s.NAME, s.GENDER, c.ID
FROM STUDENT s 
JOIN CLASS c 
ON s.ID = c.ID;

-- Câu 3:
SELECT TEACHER AS TenGiaoVien,
		count(s.CLASS_ID) AS SoHocSinh
FROM CLASS c
JOIN STUDENT s
ON s.ID = c.ID
WHERE c.NAME = '12C'
GROUP BY c.TEACHER;
-- Câu 4:
SELECT c.TEACHER, COUNT(s.ID) AS SoluongHS
FROM class c
JOIN student s
ON c.ID = s.id
JOIN result r
ON s.id = r.STUDENT_ID
WHERE r.SUBJECT = 'Math' and r.SCORE >= 8 AND r.SUBJECT ='Literature' >= 8
GROUP BY c.TEACHER;

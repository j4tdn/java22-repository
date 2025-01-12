CREATE DATABASE lesson17_ngocquy CHAR SET utf8mb4;

USE lesson17_ngocquy;

CREATE TABLE Class(
	id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    teacher VARCHAR(100)
);

CREATE TABLE Student(
	id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    gender VARCHAR(10),
    class_id INT,
    CONSTRAINT FK_Class_Student FOREIGN KEY (class_id)
                          REFERENCES Class(id)
);

CREATE TABLE Result(
	id INT PRIMARY KEY AUTO_INCREMENT,
	student_id INT,
    subject VARCHAR(100) NOT NULL,
    score DOUBLE,
    CONSTRAINT FK_Result_Student FOREIGN KEY (student_id)
							REFERENCES Student(id)
);


-- INSERT

INSERT INTO class (name, teacher)
VALUES ("12A", "Ho Cong Trung"),
("12B", "Dang Tu Anh"),
("12C", "Nguyen Van Tam")
;

INSERT INTO Student (name, gender, class_id)
VALUES ("Dinh Thi Ngoc", "Female", 2),
("Nguyen Thanh Hung", "Male", 1),
("Tran Mai Hoa", "Female", 2),
("Doan Quang Vinh", "Male", 1),
("Cao Ngoc Quy", "Male", 3),
("Tran Kim Tuyen", "Female", 3),
("Cao Anh Dao", "Female", 1),
("Nguyen Cong Trinh", "Male", 3),
("Nguyen Thi Thuy Linh", "Female", 2)
;

INSERT INTO Result (Student_id, subject, score)
VALUES (1, "Math", 8),
(2, "Literature", 7),
(3, "History", 9.5),
(4, "Math", 6.8),
(5, "Literature", 8.5),
(6, "History", 8.2),
(7, "Math", 9.8),
(8, "Literature", 7.2),
(9, "History", 8.8)
;

-- Questions
-- Answer 1 questions:
-- primary key của Result em sẽ để là id. để student_id làm khóa ngoại liên kết với bảng Student. Để mỗi học sinh có thể xem được điểm các môn học.

-- Write 3 question to:
-- 2. List name, gender and teacher name off all Student
SELECT Student.name,
		Student.gender,
		Class.teacher 
FROM
	Student
    JOIN Class ON Student.class_id = Class.id
;
-- 3. List teacher name number of all student in class 12C
SELECT Class.teacher,
	COUNT(DISTINCT Student.id) AS Student_count
FROM 
	Class 
    JOIN Student ON Class.id = Student.class_id
    Where Class.name = "12C"
;

-- 4. List the class name and number of the students who have good at Math(score>=8) and good at Literature(score>=8)
SELECT  Class.name AS Class_name,
		COUNT(DISTINCT Student.id) AS Number_of_students
FROM 
	Student 
	JOIN Class ON Student.class_id = Class.id
    WHERE Student.id IN (
		SELECT r1.student_id
        FROM Result r1
        WHERE r1.subject = "Math" AND r1.score >= 8
    )
    AND Student.id IN (
		SELECT r2.student_id
        FROM Result r2
        WHERE r2.subject = "Literature" AND r2.score >= 8
    )
    GROUP BY Class.name
;
SELECT * FROM Result;
    
    






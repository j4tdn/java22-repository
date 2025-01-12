CREATE DATABASE lesson17_exam;
USE lesson17_exam;

CREATE TABLE Student (
	id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    gender VARCHAR(50) NOT NULL,
    class_id INT NOT NULL,
    FOREIGN KEY (class_id) REFERENCES Class(id) ON DELETE CASCADE
);

CREATE TABLE Result (
	student_id int PRIMARY KEY AUTO_INCREMENT,
    subject VARCHAR(50) NOT NULL,
    score DECIMAL(4,2) NOT NULL
);

CREATE TABLE Class (
	id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    teacher VARCHAR(50) NOT NULL
);

INSERT INTO Class(name, teacher) VALUES
('12A','Ho Cong Trung'),
('12B','Dang Tu Anh'),
('12C','Nguyen Van Tam');

SELECT * FROM Class;

INSERT INTO Student(name, gender, class_id) VALUES
('Dinh Thi Ngoc','Female',2),
('Nguyen Thanh Hung','Male',1),
('Tran Mai Hoa','Female',2),
('Doan Quang Vinh','Male',1),
('Cao Anh Dao','Female',3),
('Tran Kim Tuyen','Male',3);

SELECT * FROM Student;

INSERT INTO Result(subject, score) VALUES
('Math',8),
('Literature',7),
('History',9.5),
('Math',6.8),
('Literature',4.9),
('History',8.2),
('Math',9.8),
('Literature',7.2),
('History',8.8)	;

SELECT * FROM Result;

-- CAU LY THUYET
--  Khóa chính của bảng Result là Cột dùng để nhận diện các hàng dữ liệu trong bảng
-- (Phân biệt các hàng dữ liệu với nhau nếu như có các bảng có một số trường dữ liệu trùng nhau)

-- Cau 1
SELECT Student.name student_name,
	Student.gender student_gender,
    Class.teacher teacher
FROM Student
JOIN Class
ON Student.class_id = Class.id;

-- Cau 2
SELECT Class.teacher,
	COUNT(Student.id)
FROM Class
JOIN Student
ON Class.id = Student.class_id
WHERE Class.name = '12C'
GROUP BY Class.teacher;

-- Cau 3


-- Nhap
SELECT * 
FROM Student
ORDER BY class_id;

    
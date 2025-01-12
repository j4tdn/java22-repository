CREATE TABLE java22_lesson17.student (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    gender VARCHAR(10),
    classid INT,
	FOREIGN KEY (classid)
    REFERENCES java22_lesson17.class(id)
);


CREATE TABLE java22_lesson17.class (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    teacher VARCHAR(100) NOT NULL
);
CREATE TABLE java22_lesson17.result (
	id INT PRIMARY KEY AUTO_INCREMENT,
	student_id INT ,
    subject VARCHAR(100) NOT NULL,
    score DOUBLE,
    FOREIGN KEY (student_id)
    REFERENCES java22_lesson17.student(id)
);


INSERT INTO java22_lesson17.class(name,teacher)
VALUES ("12A", "Ho Cong Trung"),
("12B", "Dang Tu Anh"),
("12C", "Nguyen Van Tam")
;


INSERT INTO java22_lesson17.student(name,gender,classid)
VALUES ("Dinh Thi Ngoc", "Female", 2),
("Nguyen Thanh Hung", "Male", 1),
("Tran Mai Hoa", "Female", 2),
("Doan Quang Vinh", "Male",1),
("Cao Anh Dao", "Female", 3),
("Tran Kim Tuyen", "Male", 3),
("Tran Mai Tuyer", "Female", 2),
("Doan Vinh", "Male",1),
("Cao Chau", "Female", 3),
("Huy Tuyen", "Male", 3)
;


INSERT INTO java22_lesson17.result(subject,score)
VALUES ("Math", 8),
("Literature", 7),
("History", 9.5),
("Math",6.8),
("Literature", 4.9),
("History", 8.2),
("Math", 9.8),
("Literature", 7.2),
("History", 8.8)
;



-- 1. 
-- Primary key of result table is id.

-- Write 3 queries to :
-- 2. 
SELECT java22_lesson17.student.name,
 java22_lesson17.student.gender, java22_lesson17.class.teacher
 FROM java22_lesson17.student
 INNER JOIN java22_lesson17.class ON
 java22_lesson17.student.classid = java22_lesson17.class.id;


-- 3. 
SELECT java22_lesson17.class.teacher, 
COUNT(java22_lesson17.student.id) AS numberOfstudent 
FROM java22_lesson17.student
INNER JOIN java22_lesson17.class ON
java22_lesson17.student.classid = java22_lesson17.class.id
WHERE java22_lesson17.class.name = "12C"
GROUP BY java22_lesson17.class.teacher; 

-- 4.

SELECT java22_lesson17.class.name,
COUNT(java22_lesson17.student.id) AS numberOfstudentHaveGoodAtMandL 
FROM java22_lesson17.student As s
JOIN java22_lesson17.result r1 ON
s.id = r1.student_id and r1.subject = "Math" and r1.score >=8
JOIN java22_lesson17.result r2 ON
s.id = r2.student_id and r2.subject = "Literature" and r2.score >=8
JOIN java22_lesson17.class ON
s.classid =  java22_lesson17.class.id
GROUP BY java22_lesson17.class.name; 







 


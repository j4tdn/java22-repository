
CREATE DATABASE lesson17Test  char set utf8mb4;

CREATE TABLE class(
	class_id  INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    teacher VARCHAR(255) NOT NULL
);

CREATE TABLE student(
	student_id  INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    gender VARCHAR(255) NOT NULL,
    class_id INT NOT NULL,
    CONSTRAINT FK_STUDENT_CLASS FOREIGN KEY (class_id)
									  REFERENCES class(class_id)
);

CREATE TABLE result(
	student_id  INT NOT NULL,
    subject VARCHAR(255) NOT NULL,
    score int ,
    CONSTRAINT PK_RESULT PRIMARY KEY (student_id, subject),
    CONSTRAINT FK_RESULT_STUDENT FOREIGN KEY (student_id)
									  REFERENCES student(student_id),
	CONSTRAINT CHECK_SUBJECT CHECK (subject in ('Marth','Literature','History'))
);
ALTER TABLE result DROP CONSTRAINT CHECK_SUBJECT;
ALTER TABLE result ADD CONSTRAINT CHECK_SUBJECT CHECK (subject in ('Math','Literature','History'));


INSERT INTO class (name, teacher)
VALUES ('12A1', 'Hoàng Việt'),
('12A2', 'Hoàng Tùng'),('12B1', 'Lê Viết'),('12B2', 'Nguyễn Minh'),('12B3', 'Nguyễn Sơn');
SELECT * FROM class;

INSERT INTO student (name, gender, class_id)
VALUES ('Hoàng Văn Thái', 'Male', 1),
('Đố Tiến Sỹ', 'Male', 2),
('Hoàng Trọng Lịch', 'Male', 1),
('Nguyễn Khánh Linh', 'Female', 3),
('Hoàng Ngân', 'Female', 3),
('Đố Tiến Linh', 'Male', 5),
('Hoàng Trọng Vũ', 'Male', 4),
('Nguyễn Khánh Như', 'Female', 4),
('Hoàng Hà', 'Female', 5 )
;
SELECT * FROM student;

INSERT INTO result (student_id, subject,score)
VALUES 
(1, 'Marth', 9),
(2, 'Marth', 4),
(3, 'Marth', 5),
(4, 'Marth', 10),
(5, 'Marth', 8),
(6, 'Marth', 9),
(7, 'Literature', 9),
(8, 'Literature', 4),
(9, 'Literature', 5),
(10, 'Literature', 10),
(1, 'Literature', 8),
(2, 'Literature', 9),
(3, 'History', 5),
(4, 'History', 10),
(5, 'History', 8),
(6, 'History', 9),
(7, 'History', 9),
(8, 'History', 4),
(9, 'History', 5),
(10, 'History', 10);
SELECT * FROM result;


--- 1. PRIMARY KEY of result is: (student_id, subject)
--- 2. List name, gender, teacher_name of all students
	SELECT s.name, s.gender, c.teacher
	FROM student s
	JOIN class c ON  s.class_id = c.class_id;
--- 3. List teacher_name and number of all student in class 12A1
	SELECT c.teacher, count(s.student_id)
    FROM student s
	JOIN class c ON  s.class_id = c.class_id
    WHERE c.name = '12A1'
    GROUP BY c.class_id, c.teacher;

--- 4. List the class_name and number ofstudents who have good at Math(score>= 8) and good at Literature(score>= 8)
	with cte_math_score as (
		SELECT r.student_id   student_id,
				r.score  math_score
		FROM result r 
		WHERE (r.subject = 'Math' and r.score >= 8))
	SELECT c.name, count(s.student_id)
    FROM result r
    JOIN cte_math_score cte ON cte.student_id = r.student_id
    JOIN student s ON s.student_id = cte.student_id
    JOIN class c on c.class_id =  s.class_id
    WHERE (r.subject = 'Literature' and r.score >= 8)
    GROUP BY c.class_id, c.name

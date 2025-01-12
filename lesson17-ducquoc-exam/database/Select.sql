-- what is primany key of result table 
-- khóa chính của bảng result là student_id ở trường hợp này thì studen_id vừa làm khóa chính vừa làm khóa ngoại 

-- hiển thị tên giới tính giáo viên của tất cả các học sinh 
USE test_database;
SELECT studens.name AS studen_name ,
		studens.gender AS gender,
        class.teacher AS teacher_name
        FROM studens JOIN class ON studens.class_id = class.id ;
			 
 -- liệt kê tên giáo viên và số hiệu của tất cả các học sinh lớp 12c
 
 SELECT class.teacher AS  teacher_name ,
		COUNT(studens.id) AS count
        FROM studens JOIN class ON studens.class_id = class.id
        where class.name = "12C"
        GROUP BY (class.teacher);
        
SELECT class.name AS class_name ,
		COUNT(CASE 
				WHEN result.subject = "math" AND result.score >= 8.0 THEN studens.id END ) AS count_math ,
		COUNT(CASE 
				WHEN result.subject = "Literature" AND result.score >= 8.0 THEN studens.id END ) AS count_Literature
        FROM studens JOIN class ON studens.class_id = class.id
        JOIN result ON studens.id = result.studen_id 
        GROUP BY class.name;
        
        
        
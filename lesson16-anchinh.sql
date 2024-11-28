-- Công ty được tổ chức thành các phòng ban chức năng.

-- Một nhân viên chỉ làm việc cho một phòng ban nhưng có thể làm việc cho nhiều dự án.
-- Chúng ta lưu giữ lại số giờ làm việc của mỗi nhân viên trên dự án mà nhân viên đó tham gia. Mỗi

-- Phần A. Phân tích và viết các lệnh để xây dựng cơ sở dữ liệu dựa vào mô tả phía trên
CREATE DATABASE EXAM;
USE EXAM;

-- Mỗi phòng ban sẽ có một tên duy nhất, một mã số duy nhất và các nhân viên, 
-- trong đó có một nhân viên là người quản lý phòng ban đó.
-- Việc nhân viên quản lý phòng ban được ghi lại bằng ngày nhân viên đó bắt đầu quản lý và được gọi
-- là trưởng phòng. Ta ghi nhận lại ngày nhận chức của trưởng phòng.
CREATE TABLE DEPARTMENT(
	DEPARTMENT_ID INT PRIMARY KEY AUTO_INCREMENT,
    DEPARTMENT_NAME VARCHAR(255) NOT NULL, 
    MANAGER_ID INT NOT NULL,
    START_DATE DATE NOT NULL,
    CONSTRAINT UNQ_DEPARTMENT_NAME UNIQUE(DEPARTMENT_NAME),
    CONSTRAINT UNQ_DEPARMENT_MANAGER_ID UNIQUE(MANAGER_ID)
);
-- Với mỗi nhân viên chúng ta lưu giữ lại các thông tin bao gồm họ tên, mã số duy nhất, địa chỉ,
-- lương, giới tính, ngày sinh, ngày vào công ty
-- nhân viên có thể có một người quản lý giám sát trực tiếp, người đó cũng là một nhân viên, nhân
-- viên và quản lý/giám sát của nhân viên có thể tham gia cùng/khác dự án.
CREATE TABLE EMPLOYEE(
	EMPLOYEE_ID INT PRIMARY KEY AUTO_INCREMENT,
    EMPLOYEE_NAME VARCHAR(255) NOT NULL,
    EMPLOYEE_ADDRESS VARCHAR(255) NOT NULL,
    EMPLOYEE_SALARY DOUBLE NOT NULL,
    EMPLOYEE_GENDER BIT(1) NOT NULL,
    EMPLOYEE_DATE_OF_BIRTH DATE NOT NULL,
    EMPLOYEE_HIRED_DAY DATE NOT NULL,
    EMPLOYEE_SUPERVISOR_ID INT NOT NULL,
    MANAGER_ID INT NOT NULL,
    DEPARTMENT_ID INT NOT NULL,
    CONSTRAINT FK_EMPLOYEE_DEPARTMENT FOREIGN KEY(DEPARTMENT_ID) REFERENCES DEPARTMENT(DEPARTMENT_ID),
    CONSTRAINT FK_EMPLOYEE_SUPERVISOR FOREIGN KEY(EMPLOYEE_SUPERVISOR_ID) REFERENCES EMPLOYEE(EMPLOYEE_ID)
);
ALTER TABLE EMPLOYEE ADD EMPLOYEE_SUPERVISOR_SALARY DOUBLE NOT NULL;
-- Công ty sẽ có nhiều dự án, một dự án có một tên duy nhất, một mã số duy nhất, ngày bắt đầu, ngày
-- kết thúc(hoàn thành dự án), số tiền thu được(đơn vị VNĐ) từ dự án đó.
-- Dự án được thực hiện bởi một hoặc nhiều nhân viên, có một nhân viên duy nhất làm quản lý dự án.
CREATE TABLE PROJECT(
	PROJECT_ID INT PRIMARY KEY AUTO_INCREMENT,
    PROJECT_NAME VARCHAR(255) NOT NULL,
    START_DATE DATE NOT NULL,
    END_DATE DATE NOT NULL,
    GAIN_MONEY INT NOT NULL,
    EMPLOYEE_ID INT NOT NULL,
    CONSTRAINT FK_PROJECT_EMPLOYEE FOREIGN KEY (EMPLOYEE_ID) REFERENCES EMPLOYEE(EMPLOYEE_ID),
    CONSTRAINT UNQ_PROJECT_NAME UNIQUE(PROJECT_NAME)
);

CREATE TABLE PROJECT_WORKING(
	PROJECT_WORKING_ID INT PRIMARY KEY AUTO_INCREMENT,
	EMPLOYEE_ID INT NOT NULL,
    PROJECT_ID INT NOT NULL,
    WORKING_HOUR INT NOT NULL, -- SỐ GIỜ LÀM VIỆC
    CONSTRAINT FK_PROJECT_WORKING_PROJECT FOREIGN KEY (PROJECT_ID) REFERENCES PROJECT(PROJECT_ID),
    CONSTRAINT FK_PROJECT_WORKING_EMPLOYEE FOREIGN KEY (EMPLOYEE_ID) REFERENCES EMPLOYEE(EMPLOYEE_ID)
);
-- Phần B. Viết các lệnh để tạo dữ liệu kiểm thử cho dự án
INSERT INTO DEPARTMENT (DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, START_DATE)
VALUES
	(1, 'Phòng kinh doanh', '1', '2023-01-01'),
    (2, 'Phòng đào tạo', '2', '2023-01-02'),
    (3, 'Phòng quản lí', '3', '2023-01-03'),
    (4, 'Phòng dân sự', '4', '2023-01-04'),
    (5, 'Phòng lập trình', '5', '2023-01-05');

INSERT INTO EMPLOYEE(EMPLOYEE_ID,EMPLOYEE_NAME,EMPLOYEE_ADDRESS,EMPLOYEE_SALARY,EMPLOYEE_GENDER,EMPLOYEE_DATE_OF_BIRTH,EMPLOYEE_HIRED_DAY
,EMPLOYEE_SUPERVISOR_ID,MANAGER_ID,DEPARTMENT_ID, EMPLOYEE_SUPERVISOR_SALARY)
VALUES
	(1, 'Nguyễn Văn A', 'Đà Nẵng, Quận Sơn Trà', 100.000, 0, '2003-12-02', '2023-02-20', 5, 1, 1, 100.000), 
    (2, 'Nguyễn Văn B', 'Đà Nẵng, Quận Sơn Trà', 200.000, 0, '2002-02-02', '2023-02-20', 1, 3, 2, 100.000), 
    (3, 'Nguyễn Văn C', 'Đà Nẵng, Quận Sơn Trà', 300.000, 0, '2004-11-02', '2023-02-20', 3, 2, 3, 100.000), 
    (4, 'Nguyễn Văn D', 'Đà Nẵng, Quận Sơn Trà', 400.000, 0, '2001-12-02', '2023-02-20', 4, 2, 4, 100.000), 
    (5, 'Nguyễn Văn E', 'Đà Nẵng, Quận Sơn Trà', 500.000, 0, '2000-05-02', '2023-02-20', 2, 5, 5, 100.000);
SET FOREIGN_KEY_CHECKS = 0;
TRUNCATE TABLE EMPLOYEE;
INSERT INTO PROJECT(PROJECT_ID, PROJECT_NAME, START_DATE, END_DATE, GAIN_MONEY, EMPLOYEE_ID)
VALUES
	(1, 'A', '2023-02-20',  '2024-02-20', 100000, 1),
    (2, 'B', '2023-05-10',  '2024-02-20', 200000, 2),
    (3, 'C', '2023-04-12',  '2024-10-20', 300000, 3),
    (4, 'D', '2023-01-10',  '2024-11-20', 400000, 4),
    (5, 'E', '2023-05-20',  '2024-12-20', 500000, 5);
    
INSERT INTO PROJECT_WORKING(PROJECT_WORKING_ID, EMPLOYEE_ID, PROJECT_ID, WORKING_HOUR)
VALUES
	(1, 1,  1, 1), 
    (2, 2,  2, 2), 
    (3, 3,  3, 3), 
    (4, 4,  4, 4),
    (5, 5,  5, 5);
    
-- Phần C. Thực hiện truy vấn
-- 1. Liệt kê các dự án diễn ra trong năm 2023 có số tiền thu được trên 300000 VND
    SELECT * FROM project
    WHERE YEAR(START_DATE) = '2023' AND GAIN_MONEY >= 300000;
    
-- 2. Liệt kê các nhân viên đã tham gia hơn 2 giờ trong các dự án, hiển thị chi tiết số giờ trong mỗi
-- dự án mà nhân viên tham gia
	SELECT e.EMPLOYEE_NAME,
			p.PROJECT_NAME,
		    pw.WORKING_HOUR
    FROM employee e
    JOIN project_working pw
    ON e.EMPLOYEE_ID = pw.EMPLOYEE_ID
    JOIN project p ON e.EMPLOYEE_ID = p.EMPLOYEE_ID
    WHERE WORKING_HOUR > 2;
-- 3. Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp nhân
-- viên đó
	SELECT e1.EMPLOYEE_NAME, e1.EMPLOYEE_SALARY
    FROM employee e1 
    JOIN employee e2
    ON e1.EMPLOYEE_ID = e2.EMPLOYEE_SUPERVISOR_ID
    WHERE e1.EMPLOYEE_SALARY >= e2.EMPLOYEE_SALARY;
-- 4. Liệt kê các phòng ban có số lượng nhân viên lớn hơn 0
	SELECT d.DEPARTMENT_NAME,
			count(EMPLOYEE_ID) EMPLOYEE_NUMBER			
    FROM department d
    JOIN employee e ON d.DEPARTMENT_ID = e.DEPARTMENT_ID
    GROUP BY d.DEPARTMENT_NAME
    HAVING EMPLOYEE_NUMBER > 0;
    
-- 5. Liệt kê các nhân viên đã làm việc cho công ty hơn ?*? năm
	SELECT * FROM employee
    
-- 6. Liệt kê các nhân viên vừa là trưởng phòng ban, và là quản lý dự án
-- --
-- 7. Liệt kê các nhân viên quản lý nhiều hơn 1 dự án
-- --
-- 8. Mỗi khi nhân viên tham gia vào dự án chúng ta cần lưu lại thông tin hay còn được gọi là log để
-- biết nhân viên đó tham gia vào dự án vào thời gian nào
-- Mỗi khi nhân viên cập nhật số giờ tham gia dự án, ta cần lưu lại thông tin thời gian cập nhật khi
-- nào, số giờ tham gia cũ, số giờ tham gia mới
-- Công việc được thực hiện tự động khi dự dữ liệu được thêm, cập nhật












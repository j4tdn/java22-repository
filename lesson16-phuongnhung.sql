-- Phần A. Phân tích và viết các lệnh để xây dựng cơ sở dữ liệu dựa vào mô tả phía trên 

CREATE DATABASE java22_Company char set utf8mb4;

CREATE TABLE t01_role(
	C01_ROLE_ID INT PRIMARY KEY AUTO_INCREMENT,
    C01_ROLE_NAME VARCHAR(255) NOT NULL,
    CONSTRAINT T01_CHECK CHECK (C01_ROLE_NAME IN ('Trưởng phòng', 'Nhân viên'))
);

CREATE TABLE t02_department (
	C02_DEPARMENT_ID INT PRIMARY KEY AUTO_INCREMENT,
    C02_DEPARMENT_NAME VARCHAR(255) NOT NULL,
    C02_HEAD_EMPLOYEE_ID INT,
    C02_START_DAY DATE NOT NULL,
    CONSTRAINT T02_UNIQUE_DEPARMENT_NAME UNIQUE(C02_DEPARMENT_NAME),
    CONSTRAINT T02_UNIQUE_HEAD_EMPLOYEE_ID UNIQUE(C02_HEAD_EMPLOYEE_ID)
);
ALTER TABLE t02_department ADD CONSTRAINT FK_T02_T04 FOREIGN KEY(C02_HEAD_EMPLOYEE_ID) REFERENCES t04_employee(C04_EMPLOYEE_ID);
ALTER TABLE t02_department DROP COLUMN C02_START_DAY ;
ALTER TABLE t02_department Add COLUMN C02_START_DAY DATE;


CREATE TABLE t03_project (
	C03_PROJECT_ID INT PRIMARY KEY AUTO_INCREMENT,
    C03_PROJECT_NAME VARCHAR(255) NOT NULL,
    C03_PROJECT_START_DAY DATE NOT NULL,
    C03_PROJECT_END_DAY DATE NOT NULL,
    C03_PROJECT_MONEY INT NOT NULL,
    C03_LEAD_EMPLOYEE_ID INT
);
ALTER TABLE t03_project ADD CONSTRAINT FK_T03_T04 FOREIGN KEY (C03_LEAD_EMPLOYEE_ID) REFERENCES t04_employee(C04_EMPLOYEE_ID);
ALTER TABLE t03_project DROP COLUMN C03_PROJECT_MONEY ;
ALTER TABLE t03_project ADD COLUMN C03_PROJECT_MONEY BIGINT not null;


CREATE TABLE t04_Employee(
	C04_EMPLOYEE_ID INT PRIMARY KEY AUTO_INCREMENT,
    C04_DEPARMENT_ID INT NOT NULL,
    C04_EMPLOYEE_ROLE_ID INT NOT NULL,
    C04_EMPLOYEE_MENTOR_ID INT,
    C04_EMPLOYEE_NAME VARCHAR(255) NOT NULL,
    C04_EMPLOYEE_ADDRESS VARCHAR(255) NOT NULL,
    C04_EMPLOYEE_GENDER VARCHAR(255) NOT NULL,
    C04_EMPLOYEE_BIRTHDAY DATE NOT NULL,
    C04_EMPLOYEE_STARTDAY DATE NOT NULL,
    CONSTRAINT FK_T04_T02 FOREIGN KEY (C04_DEPARMENT_ID)
						REFERENCES t02_department(C02_DEPARMENT_ID),
    CONSTRAINT FK_TO4_TO1 FOREIGN KEY (C04_EMPLOYEE_ROLE_ID) 
						REFERENCES t01_role(C01_ROLE_ID)
);
ALTER TABLE t04_employee DROP COLUMN C04_EMPLOYEE_GENDER;
ALTER table t04_employee ADD COLUMN C04_EMPLOYEE_GENDER BIT(1) NOT NULL;
ALTER TABLE t04_employee ADD COLUMN C04_EMPLOYEE_SALARY BIGINT not null;

CREATE TABLE t05_employee_project(
	C05_EMPLOYEE_PROJECT_ID INT PRIMARY KEY AUTO_INCREMENT,
	C05_EMPLOYEE_ID INT NOT NULL,
    C05_PROJECT_ID INT NOT NULL, 
    C05_TIMEWORK INT NOT NULL, 
    CONSTRAINT FK_T05_T04 FOREIGN KEY (C05_EMPLOYEE_ID) REFERENCES t04_employee(C04_EMPLOYEE_ID),
    CONSTRAINT FK_T05_T03 FOREIGN KEY (C05_PROJECT_ID) REFERENCES t03_project(C03_PROJECT_ID),
    CONSTRAINT T05_UNIQUE UNIQUE (C05_EMPLOYEE_ID, C05_PROJECT_ID)
);


-- Phần B. Viết các lệnh để tạo dữ liệu kiểm thử cho dự án 

INSERT INTO t01_role (C01_ROLE_NAME) VALUES ('Trưởng phòng'), ('Nhân viên');

INSERT INTO t02_department (C02_DEPARMENT_NAME) VALUES 
	("phát triển phần mềm"),
    ("Thiết kế giao diện"),
    ("Kiểm thử"),
    ("Quản lý dự án"),
    ("Phân tích dữ liệu"),
    ("An ninh mạng")
;
INSERT INTO t04_employee (C04_DEPARMENT_ID, C04_EMPLOYEE_ROLE_ID,C04_EMPLOYEE_NAME,
 C04_EMPLOYEE_ADDRESS,C04_EMPLOYEE_BIRTHDAY,C04_EMPLOYEE_STARTDAY,C04_EMPLOYEE_GENDER, C04_EMPLOYEE_SALARY) VALUEs
	(2,1,"emloyee 2", "dia chi 1", DATE'2002-01-04',DATE'2022-01-04', 0, 500000000),
    (3,1,"emloyee 3", "dia chi 1", DATE'2002-03-04',DATE'2022-01-04', 0, 500000000),
    (4,1,"emloyee 4", "dia chi 1", DATE'2002-04-04',DATE'2022-01-04', 0, 500000000),
    (5,1,"emloyee 5", "dia chi 1", DATE'2001-05-04',DATE'2021-01-04', 0, 500000000),
	(6,1,"emloyee 6", "dia chi 1", DATE'2002-01-04',DATE'2022-01-04', 0, 500000000),
    (1,2,"emloyee 7", "dia chi 1", DATE'2002-03-04',DATE'2022-01-04', 0, 500000000),
    (2,2,"emloyee 8", "dia chi 1", DATE'2002-04-04',DATE'2022-01-04', 0, 500000000),
    (3,2,"emloyee 9", "dia chi 1", DATE'2001-05-04',DATE'2021-01-04', 0, 500000000)
 ;

TRUNCATE t03_project;
INSERT INTO t03_project (C03_PROJECT_NAME, C03_PROJECT_START_DAY, C03_PROJECT_END_DAY, C03_PROJECT_MONEY) VALUES 
	("hệ thống quản lí nhan sự ",DATE'2024-01-04', DATE'2024-04-30', 5000000000),
    ("hệ thống quản lí bán hàng",DATE'2024-01-04', DATE'2024-04-30', 5000000000),
    ("phát triền hệ thống ",DATE'2024-01-04', DATE'2024-04-30', 5000000000),
    ("dự án 2 ",DATE'2024-01-04', DATE'2024-04-30', 5000000000),
    ("dự án 3",DATE'2024-01-04', DATE'2024-04-30', 5000000000),
    ("dự án 4",DATE'2024-01-04', DATE'2024-04-30', 5000000000)
;

-- Phần C. Thực hiện truy vấn
-- 1. Liệt kê các dự án diễn ra trong năm *?* có số tiền thu được trên *?* triệu VND

SELECT * 
FROM t03_project
WHERE cast(C03_PROJECT_START_DAY as DATE) =  str_to_date('04/01/2024', '%d/%m/%Y');

-- 2. Liệt kê các nhân viên đã tham gia hơn ?*? giờ trong các dự án, hiển thị chi tiết số giờ trong mỗi
-- dự án mà nhân viên tham gia
--
-- 3. Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp nhân
-- viên đó
--
-- 4. Liệt kê các phòng ban có số lượng nhân viên lớn hơn *?*
--
-- 5. Liệt kê các nhân viên đã làm việc cho công ty hơn ?*? năm
--
-- 6. Liệt kê các nhân viên vừa là trưởng phòng ban, và là quản lý dự án
--
-- 7. Liệt kê các nhân viên quản lý nhiều hơn 1 dự án
--
-- 8. Mỗi khi nhân viên tham gia vào dự án chúng ta cần lưu lại thông tin hay còn được gọi là log để
-- biết nhân viên đó tham gia vào dự án vào thời gian nào
-- Mỗi khi nhân viên cập nhật số giờ tham gia dự án, ta cần lưu lại thông tin thời gian cập nhật khi
-- nào, số giờ tham gia cũ, số giờ tham gia mới
-- Công việc được thực hiện tự động khi dự dữ liệu được thêm, cập nhật
 

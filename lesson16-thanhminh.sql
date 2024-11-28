
-- Đề bài: Xây dựng cơ sở dữ liệu quản lý công ty để theo dõi các thông tin liên quan đến nhân viên, phòng ban và dự án, chi tiết được mô tả như sau:
-- Công ty được tổ chức thành các phòng ban chức năng. Mỗi phòng ban sẽ có một tên duy nhất, một mã số duy nhất và các nhân viên, trong đó có một nhân viên là người quản lý phòng ban đó.
-- Việc nhân viên quản lý phòng ban được ghi lại bằng ngày nhân viên đó bắt đầu quản lý và được gọi là trưởng phòng. Ta ghi nhận lại ngày nhận chức của trưởng phòng.
-- Công ty sẽ có nhiều dự án, một dự án có một tên duy nhất, một mã số duy nhất, ngày bắt đầu, ngày kết thúc(hoàn thành dự án), số tiền thu được(đơn vị VNĐ) từ dự án đó.
-- Dự án được thực hiện bởi một hoặc nhiều nhân viên, có một nhân viên duy nhất làm quản lý dự án.
-- Với mỗi nhân viên chúng ta lưu giữ lại các thông tin bao gồm họ tên, mã số duy nhất, địa chỉ, lương, giới tính, ngày sinh, ngày vào công ty
-- Một nhân viên chỉ làm việc cho một phòng ban nhưng có thể làm việc cho nhiều dự án.
-- Chúng ta lưu giữ lại số giờ làm việc của mỗi nhân viên trên dự án mà nhân viên đó tham gia. Mỗi nhân viên có thể có một người quản lý giám sát trực tiếp, 
-- người đó cũng là một nhân viên, nhân viên và quản lý/giám sát của nhân viên có thể tham gia cùng/khác dự án.

-- Phần A. Phân tích và viết các lệnh để xây dựng cơ sở dữ liệu dựa vào mô tả phía trên
DROP DATABASE IF EXISTS lesson16_exam;
CREATE DATABASE lesson16_exam CHAR SET utf8mb4;
USE lesson16_exam;

CREATE TABLE DEPARMENT (
DEPARMENT_ID INT PRIMARY KEY,
DEPARMENT_NAME VARCHAR(255) NOT NULL,
MANEGER_ID INT NOT NULL,
DATE_OF_TAKING DATE NOT NULL
);

CREATE TABLE EMPLOYEE (
EMPLOYEE_ID INT PRIMARY KEY,
EMPLOYEE_NAME VARCHAR(255) NOT NULL,
EMPLOYEE_ADDRESS TEXT NOT NULL,
SALARY DOUBLE NOT NULL,
GENDER BIT(1) NOT NULL,
DATE_OF_BIRTH DATE NOT NULL,
DATE_OF_JOIN DATE NOT NULL,
DEPARMENT_ID INT NOT NULL,
MANEGER_ID INT NOT NULL,
CONSTRAINT FK_EMPLOYEE_DEPARMENT FOREIGN KEY (DEPARMENT_ID) REFERENCES DEPARMENT(DEPARMENT_ID),
CONSTRAINT FK_MANEGER_EMPLOYEE FOREIGN KEY (MANEGER_ID) REFERENCES EMPLOYEE(EMPLOYEE_ID)
);

ALTER TABLE DEPARMENT
ADD CONSTRAINT FK_DEPARMENT_EMPLOYEE FOREIGN KEY (MANEGER_ID) REFERENCES EMPLOYEE(EMPLOYEE_ID);

CREATE TABLE PROJECT (
PROJECT_ID INT PRIMARY KEY,
PROJECT_NAME VARCHAR(255) NOT NULL,
START_DATE DATE NOT NULL,
END_DATE DATE NOT NULL,
PROCEED INT NOT NULL,
MANEGER_ID INT NOT NULL,
CONSTRAINT FK_PROJECT_EMPLOYEE FOREIGN KEY (MANEGER_ID) REFERENCES EMPLOYEE(EMPLOYEE_ID)
);

CREATE TABLE PROJECT_EMPLOYEE_HOUR (
PROJECT_EMPLOYEE_HOUR_ID INT PRIMARY KEY,
EMPLOYEE_ID INT NOT NULL,
PROJECT_ID INT NOT NULL,
TIME_WORK INT NOT NULL,
CONSTRAINT FK_PEH_EMPLOYEE FOREIGN KEY (EMPLOYEE_ID) REFERENCES EMPLOYEE(EMPLOYEE_ID),
CONSTRAINT FK_PEH_PROJECT FOREIGN KEY (PROJECT_ID) REFERENCES PROJECT(PROJECT_ID)
);


-- Phần B. Viết các lệnh để tạo dữ liệu kiểm thử cho dự án
-- Yêu cầu: Ít nhất 5 dòng cho mỗi bảng dữ liệu

INSERT INTO DEPARMENT(DEPARMENT_ID, DEPARMENT_NAME, MANEGER_ID, DATE_OF_TAKING) VALUES 
(1, 'Phòng 1', 1, '2023-1-1'), 
(2, 'Phòng 2', 2, '2023-2-2'), 
(3, 'Phòng 3', 3, '2023-3-3'), 
(4, 'Phòng 4', 4, '2023-5-6'), 
(5, 'Phòng 5', 5, '2023-10-11');

INSERT INTO EMPLOYEE(EMPLOYEE_ID, EMPLOYEE_NAME, EMPLOYEE_ADDRESS, SALARY, GENDER, DATE_OF_BIRTH, DATE_OF_JOIN, DEPARMENT_ID, MANEGER_ID) VALUES 
(1, 'Nhan Vien 1', 'Ha Tinh', 3000, 1, '1993-10-20', '2021-12-12', 1, 1),
(2, 'Nhan Vien 2', 'Nghe An', 2000, 1, '1995-1-20', '2022-2-15', 2, 2),
(3, 'Nhan Vien 3', 'Quang Binh', 1300, 0, '1997-11-2', '2023-11-1', 3, 1),
(4, 'Nhan Vien 4', 'Quang Tri', 2200, 1, '1995-6-6', '2022-4-4', 4, 3),
(5, 'Nhan Vien 5', 'Hue', 1500, 0, '1994-7-8', '2023-10-10', 5, 2),
(6, 'Nhan Vien 6', 'Da Nang', 1800, 1, '1994-12-22', '2023-1-30', 1, 2),
(7, 'Nhan Vien 7', 'Quang Nam', 2500, 1, '1996-3-14', '2021-6-1', 2, 4),
(8, 'Nhan Vien 8', 'Ha Tinh', 2400, 0, '1996-5-5', '2021-7-16', 3, 4),
(9, 'Nhan Vien 9', 'Quang Binh', 1400, 1, '1998-4-1', '2023-5-5', 4, 1),
(10, 'Nhan Vien 10', 'Hue', 1700, 0, '1997-9-9', '2023-3-20', 4, 3);

INSERT INTO PROJECT(PROJECT_ID, PROJECT_NAME, START_DATE, END_DATE, PROCEED, MANEGER_ID) VALUES 
(1, 'Du An 1', '2024-1-12', '2024-3-20', 20000, 1),
(2, 'Du An 2', '2024-2-23', '2024-5-10', 30000, 2),
(3, 'Du An 3', '2024-3-15', '2024-4-25', 25000, 3),
(4, 'Du An 4', '2024-4-3', '2024-5-31', 50000, 2),
(5, 'Du An 5', '2024-5-5', '2024-6-30', 40000, 1);

INSERT INTO PROJECT_EMPLOYEE_HOUR(PROJECT_EMPLOYEE_HOUR_ID, EMPLOYEE_ID, PROJECT_ID, TIME_WORK) VALUES 
(1, 1, 1, 50),
(2, 3, 1, 60),
(3, 7, 1, 65),
(4, 2, 2, 70),
(5, 4, 2, 40),
(6, 6, 2, 55),
(7, 5, 3, 50),
(8, 8, 3, 70),
(9, 10, 3, 60),
(10, 3, 4, 90),
(11, 6, 4, 80),
(12, 9, 4, 85),
(13, 1, 5, 55),
(14, 4, 5, 60),
(15, 8, 5, 65);

SELECT * FROM DEPARMENT;
SELECT * FROM EMPLOYEE;
SELECT * FROM PROJECT;
SELECT * FROM PROJECT_EMPLOYEE;


-- Phần C. Thực hiện truy vấn
-- 1. Liệt kê các dự án diễn ra trong năm *?* có số tiền thu được trên *?* triệu VND
SELECT * FROM PROJECT
WHERE year(START_DATE) = 2024 AND PROCEED > 30000;

-- 2. Liệt kê các nhân viên đã tham gia hơn ?*? giờ trong các dự án, hiển thị chi tiết số giờ trong mỗi dự án mà nhân viên tham gia
SELECT EMPLOYEE.EMPLOYEE_NAME,
       PROJECT.PROJECT_NAME,
       PROJECT_EMPLOYEE_HOUR.TIME_WORK
FROM EMPLOYEE
JOIN PROJECT_EMPLOYEE_HOUR ON EMPLOYEE.EMPLOYEE_ID = PROJECT_EMPLOYEE_HOUR.EMPLOYEE_ID
JOIN PROJECT_EMPLOYEE_HOUR ON PROJECT.PROJECT_ID = PROJECT_EMPLOYEE_HOUR.PROJECT_ID
WHERE PROJECT_EMPLOYEE_HOUR.TIME_WORK > 70;

-- 3. Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp nhân viên đó


-- 4. Liệt kê các phòng ban có số lượng nhân viên lớn hơn *?*
SELECT DEPARMENT.DEPARMENT_NAME,
       COUNT(EMPLOYEE.DEPARMENT_ID) 
FROM DEPARMENT
JOIN DEPARMENT ON DEPARMENT.DEPARMENT_ID = EMPLOYEE.DEPARMENT_ID
GROUP BY DEPARMENT.DEPARMENT_NAME
HAVING COUNT(EMPLOYEE.DEPARMENT_ID) > 2;

-- 5. Liệt kê các nhân viên đã làm việc cho công ty hơn ?*? năm


-- 6. Liệt kê các nhân viên vừa là trưởng phòng ban, và là quản lý dự án


-- 7. Liệt kê các nhân viên quản lý nhiều hơn 1 dự án


-- 8. Mỗi khi nhân viên tham gia vào dự án chúng ta cần lưu lại thông tin hay còn được gọi là log để biết nhân viên đó tham gia vào dự án vào thời gian nào
-- Mỗi khi nhân viên cập nhật số giờ tham gia dự án, ta cần lưu lại thông tin thời gian cập nhật khi nào, số giờ tham gia cũ, số giờ tham gia mới
-- Công việc được thực hiện tự động khi dự dữ liệu được thêm, cập nhật


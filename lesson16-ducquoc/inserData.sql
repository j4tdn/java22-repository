USE Lesson16_exam ;
INSERT INTO Departments (departmentsName, numberOfEmployees) VALUES
('Phòng IT', 25),
('Phòng Kinh doanh', 15);


INSERT INTO Position (positionName) VALUES
('Nhân viên'),
('Trưởng phòng ');

INSERT INTO Employees (employeesName, employeesAdress, dateOfBirth, gender, employeeWage, dateOfJoining, positionId, managerId, departmentsId , dateOfJoiningPosition) VALUES
('Nguyễn Văn A', 'Hà Nội', '1990-05-20', 'Nam', 15000000, '2018-05-15', 2, 0, 1,'2020-05-15'),
('Trần Thị B', 'TP HCM', '1992-08-14', 'Nữ', 12000000, '2019-07-10', 1, 1, 2,'2019-07-10'),
('Lê Văn C', 'Đà Nẵng', '1985-11-03', 'Nam', 20000000, '2016-04-20', 1, 4, 2,'2016-04-20'),
('Phạm Thị D', 'Huế', '1998-01-12', 'Nữ', 8000000, '2021-09-01', 1, 2, 1, '2021-09-01'),
('Vũ Văn E', 'Hải Phòng', '1994-03-25', 'Nam', 10000000, '2020-12-15', 1, 3, 1,'2020-12-15'),
('Đinh Thị F', 'Cần Thơ', '1990-07-16', 'Nữ', 18000000, '2017-10-01', 2, 0, 2,'2020-10-01'),
('Bùi Văn G', 'Quảng Ninh', '1996-10-28', 'Nam', 13000000, '2020-08-22', 1, 5, 1,'2020-08-22'),
('Hoàng Thị H', 'Lâm Đồng', '1995-12-05', 'Nữ', 9500000, '2022-03-10', 1, 2, 2,'2022-03-10');

INSERT INTO Project (projectName, projectDescription, numberOfEmployees, roleOfProject, numberOfWorkingHours, employeesId,totalAmount,startDate,managerProject) VALUES
('Dự án A', 'Phát triển ứng dụng web bán hàng', 4, 'Phát triển chính', 40.0, 1,10000000.0,'2021-05-20',1),
('Dự án B', 'Nghiên cứu thị trường', 4, 'Hỗ trợ nghiên cứu', 32.0, 3,42000000.0,'2022-01-20',1),
('Dự án A', 'Phát triển ứng dụng web bán hàng', 4, 'Phát triển chính', 64.0, 2,10000000.0,'2021-05-20',0),
('Dự án A', 'Phát triển ứng dụng web bán hàng', 4, 'Phát triển chính', 56.0, 4,10000000.0,'2021-05-20',0),
('Dự án A', 'Phát triển ứng dụng web bán hàng', 4, 'Phát triển chính', 60.0, 6,10000000.0,'2021-05-20',0),
('Dự án B', 'Nghiên cứu thị trường', 4, 'Hỗ trợ nghiên cứu', 48.0, 5,42000000.0,'2022-01-20',0),
('Dự án B', 'Nghiên cứu thị trường', 4, 'Hỗ trợ nghiên cứu', 58.0, 7,42000000.0,'2022-01-20',0),
('Dự án B', 'Nghiên cứu thị trường', 4, 'Hỗ trợ nghiên cứu', 52.0, 8,42000000.0,'2022-01-20',0);










-- 1. Liệt kê các dự án diễn ra trong năm *?* có số tiền thu được trên *?* triệu VND
SELECT * FROM Project
	WHERE startDate = '2021-05-20' AND totalAmount = 10000000.0;

-- 2. Liệt kê các nhân viên đã tham gia hơn ?*? giờ trong các dự án, hiển thị chi tiết số giờ trong mỗi dự án mà nhân viên tham gia

SELECT 
	 Project.employeesId,
	 Employees.employeesName ,
     Project.projectName,
     Project.roleOfProject,
     Project.numberOfWorkingHours
    FROM Project JOIN Employees ON Project.employeesId = Employees.employeesId
	WHERE numberOfWorkingHours > 40.0;

-- 3. Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp nhân 

SELECT 
	e1.employeesId  AS employeesId,
    e1.employeesName AS employeesName ,
    e1.employeeWage AS employeeswage,
    e2.employeesId  AS managerId,
    e2.employeesName AS managerName ,
    e2.employeeWage AS managerWage
	FROM Employees e1
    JOIN Employees e2 ON e1.managerId  = e2.employeesId
    WHERE e1.employeeWage >= e2.employeeWage ;

-- 4. Liệt kê các phòng ban có số lượng nhân viên lớn hơn *?*
SELECT * 
	FROM Departments WHERE numberOfEmployees > 20 ;
    
-- 5. Liệt kê các nhân viên đã làm việc cho công ty hơn 5  năm

SELECT *
	FROM Employees 
    WHERE DATEDIFF(CURDATE(),dateOfJoining) / 365 > 5;
    
-- 6. Liệt kê các nhân viên vừa là trưởng phòng ban, và là quản lý dự án

SELECT * 
	FROM Employees JOIN Project  ON Employees.employeesId = Project.employeesId 
    WHERE Employees.positionId = 2 AND Project.managerProject = 1;
    
-- 7. Liệt kê các nhân viên quản lý nhiều hơn 1 dự án
SELECT Project.projectName , Employees.employeesId , Employees.employeesName 
	FROM Employees JOIN Project  ON Employees.employeesId = Project.employeesId
     WHERE Project.managerProject = 1
    GROUP BY Project.projectName , Employees.employeesId , Employees.employeesName    HAVING COUNT( Project.projectName ) > 1 ;
    


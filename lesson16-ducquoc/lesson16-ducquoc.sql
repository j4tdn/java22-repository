CREATE DATABASE Lesson16_exam CHAR SET utf8mb4;

-- phòng ban
USE Lesson16_exam ;
CREATE TABLE Departments (
	departmentsId INT PRIMARY KEY AUTO_INCREMENT,
    departmentsName VARCHAR(255) NOT NULL,
    numberOfEmployees INT NOT NULL
) ;
-- nhân viên 
CREATE TABLE Employees (
	employeesId INT PRIMARY KEY AUTO_INCREMENT,
    employeesName VARCHAR(255) NOT NULL,
    employeesAdress VARCHAR(255) NOT NULL,
    dateOfBirth DATE NOT NULL,
    gender VARCHAR(255) NOT NULL,
    employeeWage FLOAT NOT NULL,
    dateOfJoining DATE NOT NULL,
    positionId INT NOT NULL ,
    CONSTRAINT FK_Em_Po FOREIGN KEY (positionId) REFERENCES Position (positionId),
    managerId INT NOT NULL,
    departmentsId INT NOT NULL,
    CONSTRAINT FK_Em_De FOREIGN KEY (departmentsId) REFERENCES Departments (departmentsId)
);
-- chức vụ
CREATE TABLE Position (
	positionId INT PRIMARY KEY AUTO_INCREMENT,
    positionName VARCHAR(255) NOT NULL ,
     dateOfJoiningPosition DATE NOT NULL
);
-- dự án
CREATE TABLE Project(
	projectId INT PRIMARY KEY AUTO_INCREMENT,
    projectName VARCHAR(255) NOT NULL ,
    projectDescription VARCHAR(255) NOT NULL ,
    numberOfEmployees INT NOT NULL,
    roleOfProject VARCHAR(255) NOT NULL ,
    numberOfWorkingHours FLOAT NOT NULL ,
    employeesId INT NOT NULL,
    CONSTRAINT FK_Pr_Em FOREIGN KEY (employeesId) REFERENCES Employees (employeesId)
);

ALTER TABLE  Position
	DROP COLUMN dateOfJoiningPosition;

ALTER TABLE Employees
	ADD COLUMN dateOfJoiningPosition DATE NOT NULL ;
ALTER TABLE Project 
	ADD COLUMN totalAmount FLOAT NOT NULL;
    
ALTER TABLE Project
	ADD COLUMN startDate DATE NOT NULL;
    
ALTER TABLE Project
	ADD COLUMN managerProject BOOLEAN NOT NULL;








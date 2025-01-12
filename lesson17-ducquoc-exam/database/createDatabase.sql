CREATE DATABASE test_database CHAR SET utf8mb4;
USE test_database;

CREATE TABLE Studens (
	id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL ,
    gender VARCHAR(255) NOT NULL ,
    class_id INT NOT NULL ,
    CONSTRAINT FK_s_c FOREIGN KEY (class_id) REFERENCES Class(id)
);

CREATE TABLE Result(
	studen_id INT ,
    CONSTRAINT FK_R_S FOREIGN KEY (studen_id) REFERENCES Studens(id),
    subject VARCHAR(255) NOT NULL ,
    score DOUBLE NOT NULL 
);

CREATE TABLE Class(
	id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL ,
    teacher VARCHAR(255) NOT NULL 
);

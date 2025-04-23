-- index
-- count = 7
SELECT * FROM t01_item;

-- Kết quả giống nhau
-- rows: số dòng sql thực sự đã duyệt để tìm ra kết quả
-- filtered(%): tỉ lệ số dòng kết quả / số dòng duyệt

-- rows: 1
-- filtered: 100%
-- explain --> pk index
EXPLAIN SELECT * FROM t01_item WHERE C01_ITEM_ID = 1;

-- rows: 1
-- filtered: 100%
-- explain --> unique constraint index
EXPLAIN SELECT * FROM t01_item WHERE C01_ITEM_NAME = 'Áo 1';

-- fk index
EXPLAIN SELECT * FROM t01_item WHERE C01_ITEM_GROUP_ID = 1;

SELECT * FROM t04_order;

EXPLAIN SELECT * FROM t04_order WHERE C04_ORDER_ID = 1;

EXPLAIN SELECT * FROM t04_order WHERE C04_RECEIVER_NAME = 'Người nhận X1';

-- Truy vấn theo thuộc tính ko có index thì khả năng chậm hơn
-- Có nên tạo index cho tất cả các column để speed up searching không ?
-- KHÔNG - Nên
-- 1. Giữ nguyên index của pk, fk, constraints ví dụ unique
-- 2. Tạo thêm index cho column khi column đó được sử dụng tìm kiếm nhiều trong ứng dụng
--    và bị chậm --> thêm index

ALTER TABLE t04_order
ADD INDEX IDX_C04_REC_NAME(C04_RECEIVER_NAME);


-- stored procedure
-- mergeNewItemGroup: save/update
DELIMITER $$
CREATE PROCEDURE mergeNewItemGroup(p_group_id INT, p_group_name VARCHAR(255))
BEGIN
    -- B1: Kiểm tra p_group_id đã tồn tại trong t02_item_group chưa
    DECLARE counter INT;
	SELECT count(*) INTO counter FROM t02_item_group WHERE C02_ITEM_GROUP_ID = p_group_id;
	
    IF (counter = 0) THEN
		INSERT INTO t02_item_group(C02_ITEM_GROUP_ID, C02_ITEM_GROUP_NAME)
		VALUES(p_group_id, p_group_name);
    ELSE
		UPDATE t02_item_group
           SET C02_ITEM_GROUP_NAME = p_group_name
         WHERE C02_ITEM_GROUP_ID = p_group_id;
	END IF;
END $$

SELECT * FROM t02_item_group;
CALL mergeNewItemGroup(8, 'Balo');

-- function
-- sumOfSalesPrice of item

DELIMITER $$
CREATE FUNCTION calSumOfSalesPrice()
RETURNS INT
BEGIN
    DECLARE result INT;
    SET result := (SELECT SUM(C03_SALES_PRICE) FROM t03_item_detail);
    
    RETURN result;
END $$

SET GLOBAL log_bin_trust_function_creators = 1;

SELECT calSumOfSalesPrice() AS SALES_PRICE;

-- trigger
DROP TABLE IF EXISTS Salaries;

CREATE TABLE Salaries (
    employeeNumber INT PRIMARY KEY,
    validFrom DATE NOT NULL,
    amount DEC(12 , 2 ) NOT NULL DEFAULT 0
);

INSERT INTO salaries(employeeNumber,validFrom,amount)
VALUES
    (1002,'2000-01-01',50000),
    (1056,'2000-01-01',60000),
    (1076,'2000-01-01',70000);
    
-- Ví dụ
-- Khi xóa dữ liệu DELETE FROM, xóa bay dữ liệu từ salaries
-- Mong muốn: ko nên được xóa, nếu xóa tracking được người dùng nào xóa vào thời gian nào
-- Tạo ra trigger lưu lại dữ liệu bị xóa kèm thông tin người/thời gian xóa

CREATE TABLE SalaryArchives (
    id INT PRIMARY KEY AUTO_INCREMENT,
    employeeNumber INT,
    validFrom DATE NOT NULL,
    amount DEC(12 , 2 ) NOT NULL DEFAULT 0,
    deletedAt TIMESTAMP DEFAULT NOW()
);

DELIMITER $$

CREATE TRIGGER before_salaries_delete
BEFORE DELETE
ON salaries FOR EACH ROW
BEGIN
    INSERT INTO SalaryArchives(employeeNumber,validFrom,amount)
    VALUES(OLD.employeeNumber,OLD.validFrom,OLD.amount);
END$$

DELIMITER ;


DELETE FROM  Salaries WHERE employeeNumber = 1002;

SELECT * FROM Salaries;
SELECT * FROM SalaryArchives;

-- view

-- Tìm giá bán của mỗi mặt hàng
CREATE VIEW V_ITEMS
AS 
SELECT C03_ITEM_ID ITEM_ID,
       avg(C03_SALES_PRICE) SALES_PRICE
  FROM t03_item_detail
 GROUP BY C03_ITEM_ID;
 
SELECT * FROM V_ITEMS;

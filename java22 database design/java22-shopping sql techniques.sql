-- index
-- count = 7
SELECT * FROM t01_item;

-- kết quả giống nhau
-- rows: số dòng sql thực sự đã duyệt để mà tìm ra kết quả
-- filtered(%): tỉ lệ số dòng kết quả / số dòng duyệt

-- rows: 1
-- filtered: 100%
-- explain: --> pk index
EXPLAIN SELECT * FROM t01_item WHERE C01_ITEM_ID = 1;

-- rows: 1
-- filtered: 100%
-- explain: --> unique constraint index
EXPLAIN SELECT * FROM t01_item WHERE C01_ITEM_NAME = 'Áo 1';

-- fk index
EXPLAIN SELECT * FROM t01_item WHERE C01_ITEM_GROUP_ID = 1;

SELECT * FROM t04_order;

EXPLAIN SELECT * FROM t04_order WHERE C04_ORDER_ID = 1;

EXPLAIN SELECT * FROM t04_order WHERE C04_RECEIVER_NAME = 'Người nhận X1';

-- Truy vấn theo thuộc tính ko có index thì khả năng chậm hơn
-- Có nên tạo index cho tất cả các column để speed up searching không?
-- KHÔNG - NÊN
-- 1. Giữ nguyên index của pk, fk, constraints ví dụ unique
-- 2. Tạo thêm index cho column khi column đó được sử dụng tìm kiếm trong ứng dụng và bị chậm --> thêm index

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
    
    IF(counter = 0) THEN
		INSERT INTO t02_item_group(C02_ITEM_GROUP_ID, C02_ITEM_GROUP_NAME)
		VALUES(p_group_id, p_group_name);
	ELSE
		UPDATE t02_item_group
		SET C02_ITEM_GROUP_NAME = p_group_name
        WHERE C02_ITEM_GROUP_ID = p_group_id;
    END IF;    
END
$$
SELECT * FROM t02_item_group;
CALL mergeNewItemGroup(8, 'Balo');

-- function
-- sumOfSalesPrice of itemn
DELIMITER $$
CREATE FUNCTION sumOfSalesPrice()
RETURNS INT
BEGIN
	DECLARE result INT;
    SET result := (SELECT SUM(C03_SALES_PRICE) FROM t03_item_detail);
    
    RETURN result;
END $$

SELECT sumOfSalesPrice() AS SALES_PRICE;

SET GLOBAL log_bin_trust_function_creators = 1;

-- trigger



-- view

-- Tìm giá bán của mỗi mặt hàng
CREATE VIEW V_ITEMS
SELECT  C03_ITEM_ID ITEM_ID,
			avg(C03_SALES_PRICE) SALES_PRICE 
	FROM t03_item_detail
	GROUP BY C03_ITEM_ID



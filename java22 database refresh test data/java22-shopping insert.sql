-- T01_ITEM, T02_ITEM_GROUP, T03_ITEM_DETAIL, T12_SIZE
INSERT INTO t02_item_group(C02_ITEM_GROUP_NAME) VALUES
('Áo'),
('Quần'),
('Giày'),
('Dép'),
('Mũ'),
('Thắt lưng'),
('Túi xách');

INSERT INTO t01_item(C01_ITEM_NAME, C01_ITEM_GROUP_ID) VALUES
('Áo 1',	1),
('Áo 2',	1),
('Áo 3',	1),
('Quần 4',	2),
('Quần 5',	2),
('Giày 6',	3),
('Giày 7',	3),
('Giày 8',	3),
('Giày 9',	3),
('Giày 10',	3),
('Giép 11',	4),
('Áo 12',	1),
('Giép 13',	4),
('Mũ 14',	5),
('Mũ 15',	5),
('Thắt lưng 16',6),
('Thắt lưng 17',6),
('Mũ 18', 5),
('Túi xách 1',7),
('Túi xách 2',7);

CALL p_insert_into_size();

-- T100_SUPPLIER, T101_SUPPLIER_CHAIN

-- T08_CUSTOMER, T11_TITLE, T13_EMPLOYEE

-- T09_PAYMENT_METHOD, T10_ORDER_STATUS

-- T04_ORDER, T05_ORDER_DETAIL, T06_ORDER_STATUS_DETAIL, T07_BILL
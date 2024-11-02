

-- 1. Toàn bộ thông tin các loại hàng
    -- Mặt hàng thuộc loại hàng là 'Thắt lưng'
    
    SELECT * FROM t01_item INNER Join t02_item_group 
			 ON t01_item.C01_ITEM_GROUP_ID = t02_item_group.C02_ITEM_GROUP_ID
             WHERE t02_item_group.C02_ITEM_GROUP_NAME="Thắt lưng";
    -- Top 5 mặt hàng có giá bán cao nhất
    
    SELECT * FROM t01_item inner Join t03_item_detail
			ON t01_item.C01_ITEM_ID = t03_item_detail.C03_ITEM_ID
            ORDER BY C03_SALES_PRICE DESC
            LIMIT 5; 
            
	SELECT * from t03_item_detail
	ORDER BY C03_SALES_PRICE DESC
	LIMIT 5;
-- 2. Đơn hàng


SELECT * FROM t04_order;
    -- Được bán trong ngày 28/11/2019
    SELECT * FROM t04_order WHERE DATE(C04_ORDER_TIME) = '2024-11-05';
    -- Được bán từ ngày 28/11/2019 đến ngày 02/12/2019
    
    SELECT * FROM t04_order WHERE C04_ORDER_TIME BETWEEN '2024-11-28 00:00:00' AND '2024-12-14 23:59:59';
    
    -- Được bán trong tháng 11/2019
    
     SELECT * FROM t04_order WHERE YEAR(C04_ORDER_TIME) = 2019 and MONTH(C04_ORDER_TIME) = 11;
    
    -- Được giao hàng tại Hòa Khánh
    SELECT * FROM t04_order WHERE C04_DELIVERY_ADDRESS LIKE '%Hoà Khánh%';
-- 3. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân
SELECT *, ROUND(C03_SALES_PRICE * 0.8, 2) AS Discounted_Price
FROM T03_ITEM_DETAIL;

-- 4. Giảm giá 20% tất cả các mặt hàng trong ngày 25/11/2019
SELECT * from t04_order;
SELECT C01_ITEM_ID, C01_ITEM_NAME, C05_ORDER_ID, C03_SALES_PRICE, ROUND(C03_SALES_PRICE * 0.8, 2) AS Discounted_Price
FROM T01_ITEM 
INNER JOIN t03_item_detail on t01_item.C01_ITEM_ID = t03_item_detail.C03_ITEM_ID
INNER JOIN t05_order_detail on t03_item_detail.C03_ITEM_DETAIL_ID = t05_order_detail.C05_ITEM_DETAIL_ID
INNER JOIN t04_order ON t05_order_detail.C05_ORDER_ID = t04_order.C04_ORDER_ID
 Where DATE(C04_ORDER_TIME) = "2024-11-02";

-- 5. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.
SELECT DISTINCT C03_COLOR FROM t03_item_detail;

-- 7. Liệt kê tất cả các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 23/11/2019

SELECT C01_ITEM_ID, C01_ITEM_NAME, C05_ORDER_ID 
FROM T01_ITEM 
INNER JOIN t03_item_detail on t01_item.C01_ITEM_ID = t03_item_detail.C03_ITEM_ID
INNER JOIN t05_order_detail on t03_item_detail.C03_ITEM_DETAIL_ID = t05_order_detail.C05_ITEM_DETAIL_ID
INNER JOIN t04_order ON t05_order_detail.C05_ORDER_ID = t04_order.C04_ORDER_ID
WHERE DATE(C04_ORDER_TIME) = "2024-11-02";

-- 8. Liệt kê các mặt hàng có giá bán từ 100 - 300
SELECT * FROM t01_item inner Join t03_item_detail
			ON t01_item.C01_ITEM_ID = t03_item_detail.C03_ITEM_ID
            WHERE C03_SALES_PRICE BETWEEN 100 and 300;
-- 9. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'
SELECT * from t01_item WHERE C01_ITEM_GROUP_ID IN 
		(SELECT C02_ITEM_GROUP_ID FROM t02_item_group 
         WHERE C02_ITEM_GROUP_NAME IN ('Mũ', 'Thắt lưng'));
-- 10. Liệt kê các đơn hàng được đặt trong ngày (28/11/2019, 14/12/2019)
SELECT * FROM t04_order WHERE C04_ORDER_TIME BETWEEN '2024-11-28 00:00:00' AND '2024-12-14 23:59:59';


-- ======================= REFRESH DATA - DEMO MULTI TABLES AND GROUPING =======================
-- 11. Sắp xếp các mặt hàng với giá bán tăng dần
 SELECT * FROM t01_item
 INNER JOIN t03_item_detail ON t01_item.C01_ITEM_ID = t03_item_detail.C03_ITEM_ID
 ORDER BY C03_SALES_PRICE;
-- 12. Sắp xếp các mặt hàng với giá mua giảm dần
SELECT * FROM t01_item
 INNER JOIN t101_supplier_chain ON t01_item.C01_ITEM_ID = t101_supplier_chain.C101_ITEM_ID
 ORDER BY C01_BUY_PRICE DESC;
-- 13. Sắp xếp các mặt hàng với giá bán tăng dần, giá mua giảm dần
 SELECT T01_ITEM.C01_ITEM_ID, T03_ITEM_DETAIL.C03_SALES_PRICE, T101_SUPPLIER_CHAIN.C01_BUY_PRICE FROM t01_item
 INNER JOIN t03_item_detail ON t01_item.C01_ITEM_ID = t03_item_detail.C03_ITEM_ID
 INNER JOIN t101_supplier_chain ON t01_item.C01_ITEM_ID = t101_supplier_chain.C101_ITEM_ID
 ORDER BY C03_SALES_PRICE ASC , C01_BUY_PRICE DESC;
 
 

-- 14. Đếm số lượng các mặt hàng trong hệ thống

SELECT COUNT(*) from t01_item;

-- 15. Số lượng 'Giày da Nam' được bán trong ngày 23/11/2019

-- 16. Đếm số lượng các mặt hàng theo từng loại hàng
--     MaLoai  TenLoai SoLuong
-- 	1       Giày    20
-- 	2       Áo      28

SELECT C02_ITEM_GROUP_ID, C02_ITEM_GROUP_NAME, COUNT(*) from t01_item
INNER JOIN t02_item_group 
ON t01_item.C01_ITEM_GROUP_ID = t02_item_group.C02_ITEM_GROUP_ID
GROUP BY C02_ITEM_GROUP_NAME;
-- 17. Tìm mặt hàng có giá bán cao nhất trong loại hàng 'Giày'

SELECT T01_ITEM.C01_ITEM_NAME, T03_ITEM_DETAIL.C03_SALES_PRICE from t01_item
 JOIN t02_item_group 
ON t01_item.C01_ITEM_GROUP_ID = t02_item_group.C02_ITEM_GROUP_ID
Join t03_item_detail 
ON t01_item.C01_ITEM_ID = t03_item_detail.C03_ITEM_ID
WHERE C02_ITEM_GROUP_NAME="Giày"
ORDER BY C03_SALES_PRICE DESC LIMIT 1;

-- 18. Tìm mặt hàng có giá bán cao nhất của mỗi loại hàng

select * from t03_item_detail;

SELECT  C02_ITEM_GROUP_NAME,  MAX(t03_item_detail.C03_SALES_PRICE) as Max from t01_item
 JOIN t02_item_group 
ON t01_item.C01_ITEM_GROUP_ID = t02_item_group.C02_ITEM_GROUP_ID
Join t03_item_detail 
ON t01_item.C01_ITEM_ID = t03_item_detail.C03_ITEM_ID
GROUP BY C02_ITEM_GROUP_NAME
having MAX(t03_item_detail.C03_SALES_PRICE);


-- 19. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống >> 16

SELECT  C02_ITEM_GROUP_NAME,  COUNT(*) as count from t01_item
 JOIN t02_item_group 
ON t01_item.C01_ITEM_GROUP_ID = t02_item_group.C02_ITEM_GROUP_ID
GROUP BY C02_ITEM_GROUP_NAME;

-- 20. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống
--     Điều kiện tổng số lượng > 20 mặt hàng >> HAVING
SELECT  C02_ITEM_GROUP_NAME, COUNT(*) as Amount from t01_item
 JOIN t02_item_group 
ON t01_item.C01_ITEM_GROUP_ID = t02_item_group.C02_ITEM_GROUP_ID
Join t03_item_detail 
ON t01_item.C01_ITEM_ID = t03_item_detail.C03_ITEM_ID
GROUP BY C02_ITEM_GROUP_NAME
having COUNT(*) > 20;


-- ==============================================================
-- 21. Hiển thị mặt hàng có số lượng nhiều nhất trong mỗi loại hàng


-- 22. Hiển thị giá bán trung bình của mỗi loại hàng

SELECT  C02_ITEM_GROUP_NAME, AVG(t03_item_detail.C03_SALES_PRICE) as Amount from t01_item
 JOIN t02_item_group 
ON t01_item.C01_ITEM_GROUP_ID = t02_item_group.C02_ITEM_GROUP_ID
Join t03_item_detail 
ON t01_item.C01_ITEM_ID = t03_item_detail.C03_ITEM_ID
GROUP BY C02_ITEM_GROUP_NAME;

-- 23. In ra 3 loại hàng có số lượng hàng còn lại nhiều nhất ở thời điểm hiện tại

SELECT  C02_ITEM_GROUP_NAME, COUNT(*) as Amount from t01_item
 JOIN t02_item_group 
ON t01_item.C01_ITEM_GROUP_ID = t02_item_group.C02_ITEM_GROUP_ID
Join t03_item_detail 
ON t01_item.C01_ITEM_ID = t03_item_detail.C03_ITEM_ID
GROUP BY C02_ITEM_GROUP_NAME 
ORDER BY Amount DESC LIMIT 3;

-- 24. Liệt kê những mặt hàng có MaLoai = 2 và thuộc đơn hàng 100100



-- 25. Tìm những mặt hàng có Mã Loại = 2 và đã được bán trong ngày 28/11
-- 26. Liệt kê những mặt hàng là 'Mũ' không bán được trong ngày 14/02/2019
-- 27. Cập nhật giá bán của tất cả các mặt hàng thuộc loại hàng 'Áo' thành 199
-- 28. Backup data. Tạo table LoaiHang_SaoLuu(MaLoai, TenLoai)
--     Sao chép dữ liệu từ bảng LoaiHang sang LoaiHang_SaoLuu
-- 30. Liệt kê 2 sản phẩm (có số lượng tồn kho nhiều nhất) của loại hàng 'Áo' và 'Quần'
-- 31. Tính tổng tiền cho đơn hàng 02
    -- Với tổng tiền được tính bằng tổng các sản phẩm và số lượng của sản phẩm tương ứng
-- 32. Xuất thông tin hóa đơn của đơn hàng 02 với thông tin như sau.
	-- SoDH ChiTietDonHang           TongTien
    -- 02   TenMH:GiaBan:SoLuong     100
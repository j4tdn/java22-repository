-- A. INSERT
-- Sử dụng bảng dữ liệu mẫu. Thực hiện thêm dữ liệu vào cơ sở dữ liệu cho table
-- + Mathang
-- + LoaiHang
-- + Sử dụng shopping refresh data.sql để refresh data

-- ======================= REFRESH DATA =======================
-- DISABLE FOREIGN KEY
-- B. DELETE
-- 1. Xóa nhân viên có tên 'abcxyz' trong hệ thống
-- 2. Xóa bộ phận giao hàng trong hệ thống
-- 3. Xóa tất cả các mặt hàng thuộc loại hàng là mũ
-- 4. Xóa tất cả các mặt hàng trong hệ thống
-- 5. Vì hệ thống bị lỗi. Hủy tất cả các đơn hàng ngày 23/11/2019
--    Thực hiện xóa các đơn hàng bị lỗi
--    + IS_DELETED
--    + CASECADE

-- ======================= REFRESH DATA =======================
-- C. UPDATE
-- 1. Cập nhật tên mới cho phòng ban có MaPB = 2 thành 'Bộ phận quản lý'
-- 2. Cập nhật ghi chú của đơn hàng 01 thành 'Giao hàng sau 10H sáng'
-- 3. Đơn hàng 01 đã được giao hàng thành công. Thực hiện cập nhật
--    MaTT = 03, TrangThai = 'Đã giao', ThoiGian = Thời gian hiện tại
-- 4. Cập nhật số tiền cần thanh toán trong bảng hóa đơn thành 890 cho đơn hàng 01
-- 5. Cập nhật tất cả các mặt hàng thuộc loại hàng là 'Mũ' với giá bán là 199K

-- ======================= REFRESH DATA - DEMO SELECT 1 TABLE =======================
-- D. SELECT - SLIDE 25-44
-- 1. Toàn bộ thông tin các loại hàng
SELECT * FROM t02_item_group;
    -- Mặt hàng thuộc loại hàng là 'Thắt lưng'
 SELECT * FROM t01_item;
 SELECT * 
   FROM t01_item
   WHERE C01_ITEM_GROUP_ID IN (SELECT C02_ITEM_GROUP_ID
							     FROM t02_item_group
                                 WHERE C02_ITEM_GROUP_NAME = 'Thắt lưng');
 
    -- Top 5 mặt hàng có giá bán cao nhất
SELECT * from t03_item_detail
ORDER BY C03_SALES_PRICE DESC
LIMIT 5;

 -- Top 5 mặt hàng có giá bán cao nhất(khác nhau mã mặt hàng)
SELECT C03_ITEM_ID, MAX(C03_SALES_PRICE) AS MAX_SALES_PRICE 
FROM t03_item_detail
GROUP BY C03_ITEM_ID
ORDER BY MAX_SALES_PRICE DESC
LIMIT 5;
 
-- 2. Đơn hàng
SELECT * FROM t04_order;
    -- Được bán trong ngày 28/11/2019
    SELECT date(C04_ORDER_TIME) FROM t04_order;
    SELECT cast(C04_ORDER_TIME as date) from  t04_order;
    
 SELECT * FROM t04_order 
 WHERE date(C04_ORDER_TIME) = str_to_date('27/10/2024', '%d/%m/%Y');   
    -- Được bán từ ngày 28/11/2019 đến ngày 02/12/2019
SELECT * FROM t04_order 
WHERE cast(C04_ORDER_TIME as date) BETWEEN '2024-10-20' AND '2024-10-26';
    
    -- Được bán trong tháng 11/2019
SELECT * FROM t04_order 
WHERE month(C04_ORDER_TIME) = 10
AND year(C04_ORDER_TIME) = 2024;
    
    -- Được giao hàng tại Hòa Khánh
SELECT *
FROM T04_ORDER
JOIN T05_ORDER_DETAIL ON T04_ORDER.C04_ORDER_ID = T05_ORDER_DETAIL.C05_ORDER_ID
WHERE T04_ORDER.C04_DELIVERY_ADDRESS LIKE '%Địa chỉ X3%';
    
-- 3. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân
SELECT *, ROUND(C03_SALES_PRICE * 0.8, 2) NEW_SALES_PRICE
from t03_item_detail;

-- 4. Giảm giá 20% tất cả các mặt hàng trong ngày 25/11/2019
SELECT *, ROUND(C03_SALES_PRICE * 0.8) NEW_SALES_PRICE
from t03_item_detail
WHERE date('2024-10-26') ;

-- 5. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.
SELECT DISTINCT C03_COLOR FROM t03_item_detail;

-- 7. Liệt kê tất cả các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 23/11/2019
SELECT T01_ITEM.C01_ITEM_ID AS MaMH, 
       T01_ITEM.C01_ITEM_NAME AS TenMH, 
       T04_ORDER.C04_ORDER_TIME AS ThoiGianDatHang
FROM T01_ITEM
JOIN T03_ITEM_DETAIL ON T01_ITEM.C01_ITEM_ID = T03_ITEM_DETAIL.C03_ITEM_ID
JOIN T05_ORDER_DETAIL ON T03_ITEM_DETAIL.C03_ITEM_DETAIL_ID = T05_ORDER_DETAIL.C05_ITEM_DETAIL_ID
JOIN T04_ORDER ON T05_ORDER_DETAIL.C05_ORDER_ID = T04_ORDER.C04_ORDER_ID
WHERE DATE(T04_ORDER.C04_ORDER_TIME) = '2024-10-26';

-- 8. Liệt kê các mặt hàng có giá bán từ 100 - 300
SELECT * from t03_item_detail
WHERE C03_SALES_PRICE BETWEEN 100 AND 300;

-- 9. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'
SELECT * FROM t01_item;
 SELECT * 
   FROM t01_item
   WHERE C01_ITEM_GROUP_ID IN (SELECT C02_ITEM_GROUP_ID
							     FROM t02_item_group
                                 WHERE C02_ITEM_GROUP_NAME IN ('Thắt lưng', 'Mũ'));

-- 10. Liệt kê các đơn hàng được đặt trong ngày (28/11/2019, 14/12/2019)
SELECT * FROM t04_order 
WHERE cast(C04_ORDER_TIME as date) IN ('2024-10-20', '2024-10-26');

-- ======================= REFRESH DATA - DEMO MULTI TABLES AND GROUPING =======================
-- 11. Sắp xếp các mặt hàng với giá bán tăng dần
SELECT * from t03_item_detail
ORDER BY C03_SALES_PRICE ASC;

-- 12. Sắp xếp các mặt hàng với giá mua giảm dần
SELECT T01_ITEM.C01_ITEM_ID, T101_SUPPLIER_CHAIN.C01_BUY_PRICE
FROM T01_ITEM
JOIN T101_SUPPLIER_CHAIN ON T01_ITEM.C01_ITEM_ID = T101_SUPPLIER_CHAIN.C101_ITEM_ID
ORDER BY C01_BUY_PRICE DESC;

-- 13. Sắp xếp các mặt hàng với giá bán tăng dần, giá mua giảm dần
SELECT T01_ITEM.C01_ITEM_ID, T03_ITEM_DETAIL.C03_SALES_PRICE, T101_SUPPLIER_CHAIN.C01_BUY_PRICE
FROM T01_ITEM
JOIN T03_ITEM_DETAIL ON T01_ITEM.C01_ITEM_ID = T03_ITEM_DETAIL.C03_ITEM_ID
JOIN T101_SUPPLIER_CHAIN ON T01_ITEM.C01_ITEM_ID = T101_SUPPLIER_CHAIN.C101_ITEM_ID
ORDER BY C03_SALES_PRICE ASC, C01_BUY_PRICE DESC;

-- 14. Đếm số lượng các mặt hàng trong hệ thống
SELECT COUNT(*) AMOUNT_ITEM
FROM t01_item;

-- 15. Số lượng 'Giày da Nam' được bán trong ngày 23/11/2019

-- 16. Đếm số lượng các mặt hàng theo từng loại hàng
SELECT T02_ITEM_GROUP.C02_ITEM_GROUP_ID AS MaLoai, 
       T02_ITEM_GROUP.C02_ITEM_GROUP_NAME AS TenLoai, 
       COUNT(T01_ITEM.C01_ITEM_ID) AS SoLuong
FROM T01_ITEM
JOIN T02_ITEM_GROUP ON T01_ITEM.C01_ITEM_GROUP_ID = T02_ITEM_GROUP.C02_ITEM_GROUP_ID
GROUP BY T02_ITEM_GROUP.C02_ITEM_GROUP_ID, T02_ITEM_GROUP.C02_ITEM_GROUP_NAME;

--     MaLoai  TenLoai SoLuong
-- 	1       Giày    20
-- 	2       Áo      28

-- 17. Tìm mặt hàng có giá bán cao nhất trong loại hàng 'Giày'
SELECT T01_ITEM.C01_ITEM_ID, T01_ITEM.C01_ITEM_NAME, T03_ITEM_DETAIL.C03_SALES_PRICE
FROM T01_ITEM
JOIN T02_ITEM_GROUP ON T01_ITEM.C01_ITEM_GROUP_ID = T02_ITEM_GROUP.C02_ITEM_GROUP_ID
JOIN T03_ITEM_DETAIL ON T01_ITEM.C01_ITEM_ID = T03_ITEM_DETAIL.C03_ITEM_ID
WHERE T02_ITEM_GROUP.C02_ITEM_GROUP_NAME = 'Giày'
ORDER BY T03_ITEM_DETAIL.C03_SALES_PRICE DESC
LIMIT 1;

-- 18. Tìm mặt hàng có giá bán cao nhất của mỗi loại hàng
SELECT T02_ITEM_GROUP.C02_ITEM_GROUP_NAME AS TenLoai, 
       T01_ITEM.C01_ITEM_ID, 
       T01_ITEM.C01_ITEM_NAME, 
       MAX(T03_ITEM_DETAIL.C03_SALES_PRICE) AS GiaBanCaoNhat
FROM T01_ITEM
JOIN T02_ITEM_GROUP ON T01_ITEM.C01_ITEM_GROUP_ID = T02_ITEM_GROUP.C02_ITEM_GROUP_ID
JOIN T03_ITEM_DETAIL ON T01_ITEM.C01_ITEM_ID = T03_ITEM_DETAIL.C03_ITEM_ID
GROUP BY T02_ITEM_GROUP.C02_ITEM_GROUP_NAME, T01_ITEM.C01_ITEM_ID, T01_ITEM.C01_ITEM_NAME;

-- 19. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống >> 16
SELECT T02_ITEM_GROUP.C02_ITEM_GROUP_NAME AS TenLoai, COUNT(T01_ITEM.C01_ITEM_ID) AS SoLuong
FROM T01_ITEM
JOIN T02_ITEM_GROUP ON T01_ITEM.C01_ITEM_GROUP_ID = T02_ITEM_GROUP.C02_ITEM_GROUP_ID
GROUP BY T02_ITEM_GROUP.C02_ITEM_GROUP_NAME;

-- 20. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống
SELECT T02_ITEM_GROUP.C02_ITEM_GROUP_NAME AS TenLoai, COUNT(T01_ITEM.C01_ITEM_ID) AS SoLuong
FROM T01_ITEM
JOIN T02_ITEM_GROUP ON T01_ITEM.C01_ITEM_GROUP_ID = T02_ITEM_GROUP.C02_ITEM_GROUP_ID
GROUP BY T02_ITEM_GROUP.C02_ITEM_GROUP_NAME
HAVING COUNT(T01_ITEM.C01_ITEM_ID) > 20;

--     Điều kiện tổng số lượng > 20 mặt hàng >> HAVING
-- ==============================================================
-- 21. Hiển thị mặt hàng có số lượng nhiều nhất trong mỗi loại hàng
SELECT T02_ITEM_GROUP.C02_ITEM_GROUP_NAME AS TenLoai, 
       T01_ITEM.C01_ITEM_ID, 
       T01_ITEM.C01_ITEM_NAME, 
       MAX(T03_ITEM_DETAIL.C03_AMOUNT) AS SoLuong
FROM T01_ITEM
JOIN T02_ITEM_GROUP ON T01_ITEM.C01_ITEM_GROUP_ID = T02_ITEM_GROUP.C02_ITEM_GROUP_ID
JOIN T03_ITEM_DETAIL ON T01_ITEM.C01_ITEM_ID = T03_ITEM_DETAIL.C03_ITEM_ID
GROUP BY TenLoai, T01_ITEM.C01_ITEM_ID, T01_ITEM.C01_ITEM_NAME;

-- 22. Hiển thị giá bán trung bình của mỗi loại hàng
SELECT T02_ITEM_GROUP.C02_ITEM_GROUP_NAME AS TenLoai, 
       AVG(T03_ITEM_DETAIL.C03_SALES_PRICE) AS GiaBanTrungBinh
FROM T01_ITEM
JOIN T02_ITEM_GROUP ON T01_ITEM.C01_ITEM_GROUP_ID = T02_ITEM_GROUP.C02_ITEM_GROUP_ID
JOIN T03_ITEM_DETAIL ON T01_ITEM.C01_ITEM_ID = T03_ITEM_DETAIL.C03_ITEM_ID
GROUP BY T02_ITEM_GROUP.C02_ITEM_GROUP_NAME;

-- 23. In ra 3 loại hàng có số lượng hàng còn lại nhiều nhất ở thời điểm hiện tại
SELECT T02_ITEM_GROUP.C02_ITEM_GROUP_NAME AS TenLoai, 
       SUM(T03_ITEM_DETAIL.C03_AMOUNT) AS TongSoLuong
FROM T01_ITEM
JOIN T02_ITEM_GROUP ON T01_ITEM.C01_ITEM_GROUP_ID = T02_ITEM_GROUP.C02_ITEM_GROUP_ID
JOIN T03_ITEM_DETAIL ON T01_ITEM.C01_ITEM_ID = T03_ITEM_DETAIL.C03_ITEM_ID
GROUP BY T02_ITEM_GROUP.C02_ITEM_GROUP_NAME
ORDER BY TongSoLuong DESC
LIMIT 3;

-- 24. Liệt kê những mặt hàng có MaLoai = 2 và thuộc đơn hàng 100100

-- 25. Tìm những mặt hàng có Mã Loại = 2 và đã được bán trong ngày 28/11

-- 26. Liệt kê những mặt hàng là 'Mũ' không bán được trong ngày 14/02/2019

-- 27. Cập nhật giá bán của tất cả các mặt hàng thuộc loại hàng 'Áo' thành 199
UPDATE T03_ITEM_DETAIL
SET C03_SALES_PRICE = 199
WHERE C03_ITEM_ID IN (
    SELECT T01_ITEM.C01_ITEM_ID
    FROM T01_ITEM
    JOIN T02_ITEM_GROUP ON T01_ITEM.C01_ITEM_GROUP_ID = T02_ITEM_GROUP.C02_ITEM_GROUP_ID
    WHERE T02_ITEM_GROUP.C02_ITEM_GROUP_NAME = 'Áo'
);

-- 28. Backup data. Tạo table LoaiHang_SaoLuu(MaLoai, TenLoai)

--     Sao chép dữ liệu từ bảng LoaiHang sang LoaiHang_SaoLuu

-- 30. Liệt kê 2 sản phẩm (có số lượng tồn kho nhiều nhất) của loại hàng 'Áo' và 'Quần'
SELECT DISTINCT T01_ITEM.C01_ITEM_ID, T01_ITEM.C01_ITEM_NAME, T03_ITEM_DETAIL.C03_AMOUNT
FROM T01_ITEM
JOIN T02_ITEM_GROUP ON T01_ITEM.C01_ITEM_GROUP_ID = T02_ITEM_GROUP.C02_ITEM_GROUP_ID
JOIN T03_ITEM_DETAIL ON T01_ITEM.C01_ITEM_ID = T03_ITEM_DETAIL.C03_ITEM_ID
WHERE T02_ITEM_GROUP.C02_ITEM_GROUP_NAME IN ('Áo')
ORDER BY T03_ITEM_DETAIL.C03_AMOUNT DESC
LIMIT 2;

SELECT DISTINCT T01_ITEM.C01_ITEM_ID, T01_ITEM.C01_ITEM_NAME, T03_ITEM_DETAIL.C03_AMOUNT
FROM T01_ITEM
JOIN T02_ITEM_GROUP ON T01_ITEM.C01_ITEM_GROUP_ID = T02_ITEM_GROUP.C02_ITEM_GROUP_ID
JOIN T03_ITEM_DETAIL ON T01_ITEM.C01_ITEM_ID = T03_ITEM_DETAIL.C03_ITEM_ID
WHERE T02_ITEM_GROUP.C02_ITEM_GROUP_NAME IN ('Quần')
ORDER BY T03_ITEM_DETAIL.C03_AMOUNT DESC
LIMIT 2;

-- 31. Tính tổng tiền cho đơn hàng 02
SELECT SUM(T03_ITEM_DETAIL.C03_SALES_PRICE * T05_ORDER_DETAIL.C05_AMOUNT) AS TongTien
FROM T05_ORDER_DETAIL
JOIN T03_ITEM_DETAIL ON T05_ORDER_DETAIL.C05_ITEM_DETAIL_ID = T03_ITEM_DETAIL.C03_ITEM_DETAIL_ID
WHERE T05_ORDER_DETAIL.C05_ORDER_ID = 2;

    -- Với tổng tiền được tính bằng tổng các sản phẩm và số lượng của sản phẩm tương ứng
    
-- 32. Xuất thông tin hóa đơn của đơn hàng 02 với thông tin như sau.
	-- SoDH ChiTietDonHang           TongTien
    -- 02   TenMH:GiaBan:SoLuong     100
    
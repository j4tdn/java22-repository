-- A. INSERT
-- Sử dụng bảng dữ liệu mẫu. Thực hiện thêm dữ liệu vào cơ sở dữ liệu cho table
-- + Mathang
-- + LoaiHang
-- + Sử dụng shopping refresh data.sql để refresh data

-- ======================= REFRESH DATA =======================
-- DISABLE FOREIGN KEY
-- B. DELETE
-- 1. Xóa nhân viên có tên 'abcxyz' trong hệ thống
USE java22_shopping;
DELETE FROM T13_EMPLOYEE 
WHERE C13_EMPLOYEE_NAME = 'abcxyz';

-- 2. Xóa bộ phận giao hàng trong hệ thống 

-- 3. Xóa tất cả các mặt hàng thuộc loại hàng là mũ
DELETE FROM T01_ITEM
WHERE C01_ITEM_GROUP_ID = (SELECT C02_ITEM_GROUP_ID FROM T02_ITEM_GROUP WHERE C02_ITEM_GROUP_NAME = 'Mũ');
-- 4. Xóa tất cả các mặt hàng trong hệ thống
DELETE FROM T01_ITEM;
-- 5. Vì hệ thống bị lỗi. Hủy tất cả các đơn hàng ngày 23/11/2019
--    Thực hiện xóa các đơn hàng bị lỗi
--    + IS_DELETED
--    + CASECADE

-- ======================= REFRESH DATA =======================
-- C. UPDATE
-- 1. Cập nhật tên mới cho phòng ban có MaPB = 2 thành 'Bộ phận quản lý'
UPDATE T11_TITLE
SET C11_TITLE_NAME = (SELECT C11_TITLE_ID FROM T11_TITLE WHERE C11_TITLE_ID = 2 );
-- 2. Cập nhật ghi chú của đơn hàng 01 thành 'Giao hàng sau 10H sáng'
UPDATE T06_ORDER_STATUS_DETAIL
SET C06_STATUS_ID = 'Giao hàng sau 10H sáng' 
WHERE C06_ORDER_ID = 1;
-- 3. Đơn hàng 01 đã được giao hàng thành công. Thực hiện cập nhật
UPDATE T06_ORDER_STATUS_DETAIL
SET C06_STATUS_ID = 'giao hàng thành công' 
WHERE C06_ORDER_ID = 1;
--    MaTT = 03, TrangThai = 'Đã giao', ThoiGian = Thời gian hiện tại
-- 4. Cập nhật số tiền cần thanh toán trong bảng hóa đơn thành 890 cho đơn hàng 01
UPDATE T07_BILL 
SET C07_TOTAL_OF_MONEY = 890
WHERE C07_ORDER_ID = 1;
-- 5. Cập nhật tất cả các mặt hàng thuộc loại hàng là 'Mũ' với giá bán là 199K
UPDATE T03_ITEM_DETAIL
SET C03_SALES_PRICE =199
WHERE C101_ITEM_ID =  (SELECT C02_ITEM_GROUP_ID FROM T02_ITEM_GROUP WHERE C02_ITEM_GROUP_NAME = 'mũ');
-- ======================= REFRESH DATA - DEMO SELECT 1 TABLE =======================
-- D. SELECT - SLIDE 25-44
-- 1. Toàn bộ thông tin các loại hàng
    -- Mặt hàng thuộc loại hàng là 'Thắt lưng'
    -- Top 5 mặt hàng có giá bán cao nhất

SELECT  *
FROM 
    T01_ITEM 
WHERE 
    C01_ITEM_GROUP_ID = (SELECT C02_ITEM_GROUP_ID FROM T02_ITEM_GROUP WHERE C02_ITEM_GROUP_NAME = 'Thắt lưng');





-- 2. Đơn hàng
    -- Được bán trong ngày 28/11/2019
    SELECT *
FROM 
    T04_ORDER
WHERE 
    DATE(C04_ORDER_TIME) = '2024-10-27';
    -- Được bán từ ngày 28/11/2019 đến ngày 02/12/2019
SELECT * 
FROM T04_ORDER 
WHERE DATE(C04_ORDER_TIME) BETWEEN '2024-10-27' AND '2024-10-28';

    -- Được bán trong tháng 11/2019
SELECT * 
FROM T04_ORDER 
WHERE DATE(C04_ORDER_TIME) BETWEEN '2024-11-01' AND '2024-11-30';
    -- Được giao hàng tại Hòa Khánh
SELECT * 
FROM T04_ORDER    
WHERE C04_DELIVERY_ADDRESS = 'Địa chỉ X1';
-- 3. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân
UPDATE T101_SUPPLIER_CHAIN
SET C01_BUY_PRICE = ROUND(C01_BUY_PRICE * 0.8, 2);
-- 4. Giảm giá 20% tất cả các mặt hàng trong ngày 25/11/2019
UPDATE T101_SUPPLIER_CHAIN
SET C01_BUY_PRICE = ROUND(C01_BUY_PRICE * 0.8, 2)
WHERE DATE(C101_ENTERING_DATE) = '25-11-2019';
-- 5. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.
SELECT DISTINCT C03_COLOR
FROM T03_ITEM_DETAIL;
-- 7. Liệt kê tất cả các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 23/11/2019
SELECT 
    T01.C01_ITEM_ID,
    T01.C01_ITEM_NAME ,
    T101.C101_ENTERING_DATE 
FROM 
    T01_ITEM T01
JOIN 
    T101_SUPPLIER_CHAIN T101 ON T01.C01_ITEM_ID = T101.C101_ITEM_ID
WHERE 
    T101.C101_ENTERING_DATE = '23-11-2019';
-- 8. Liệt kê các mặt hàng có giá bán từ 100 - 300
SELECT 
    T01.C01_ITEM_NAME 
FROM 
    T01_ITEM T01
JOIN 
    T101_SUPPLIER_CHAIN T101 ON T01.C01_ITEM_ID = T101.C101_ITEM_ID
WHERE 
    T101.C01_BUY_PRICE BETWEEN 100 AND 300;

-- 9. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'
SELECT *
FROM 
    T01_ITEM
WHERE 
    C01_ITEM_GROUP_ID IN (
        SELECT C02_ITEM_GROUP_ID 
        FROM T02_ITEM_GROUP 
        WHERE C02_ITEM_GROUP_NAME IN ('Thắt lưng', 'Mũ')
    );

-- 10. Liệt kê các đơn hàng được đặt trong ngày (28/11/2019, 14/12/2019)
-- ======================= REFRESH DATA - DEMO MULTI TABLES AND GROUPING =======================
-- 11. Sắp xếp các mặt hàng với giá bán tăng dần
SELECT *
FROM T03_ITEM_DETAIL
ORDER BY C03_SALES_PRICE ASC;

-- 12. Sắp xếp các mặt hàng với giá mua giảm dần
SELECT *
FROM T03_ITEM_DETAIL
ORDER BY C03_SALES_PRICE DESC;

-- 13. Sắp xếp các mặt hàng với giá bán tăng dần, giá mua giảm dần
SELECT *
FROM 
    T03_ITEM_DETAIL 
JOIN 
    T101_SUPPLIER_CHAIN  ON C03_ITEM_ID = C101_ITEM_ID
ORDER BY 
    T03.C03_SALES_PRICE ASC,    
    T101.C01_BUY_PRICE DESC;   

-- 14. Đếm số lượng các mặt hàng trong hệ thống
-- 15. Số lượng 'Giày da Nam' được bán trong ngày 23/11/2019
-- 16. Đếm số lượng các mặt hàng theo từng loại hàng
--     MaLoai  TenLoai SoLuong
-- 	1       Giày    20
-- 	2       Áo      28
-- 17. Tìm mặt hàng có giá bán cao nhất trong loại hàng 'Giày'
-- 18. Tìm mặt hàng có giá bán cao nhất của mỗi loại hàng
-- 19. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống >> 16
-- 20. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống
--     Điều kiện tổng số lượng > 20 mặt hàng >> HAVING
-- ==============================================================
-- 21. Hiển thị mặt hàng có số lượng nhiều nhất trong mỗi loại hàng
-- 22. Hiển thị giá bán trung bình của mỗi loại hàng
-- 23. In ra 3 loại hàng có số lượng hàng còn lại nhiều nhất ở thời điểm hiện tại

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

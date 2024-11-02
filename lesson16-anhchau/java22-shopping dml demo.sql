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
    -- Mặt hàng thuộc loại hàng là 'Thắt lưng'
    SELECT * FROM t01_item t01
JOIN t02_item_group t02 ON t01.C01_ITEM_GROUP_ID = t02.C02_ITEM_GROUP_ID
WHERE t02.C02_ITEM_GROUP_NAME = 'Thắt lưng';

    -- Top 5 mặt hàng có giá bán cao nhất
    SELECT *
FROM T03_ITEM_DETAIL
ORDER BY C03_SALES_PRICE DESC
LIMIT 5;

	-- Top 5 mặt hàng có giá bán cao nhất(khác nhau mã mặt hàng)

SELECT C03_ITEM_ID, C03_SIZE_ID, C03_COLOR, C03_AMOUNT, C03_SALES_PRICE
FROM T03_ITEM_DETAIL
GROUP BY C03_ITEM_ID
ORDER BY C03_SALES_PRICE DESC
LIMIT 5;

-- 2. Đơn hàng
    -- Được bán trong ngày 28/11/2019
    SELECT * 
FROM T04_ORDER
WHERE DATE(C04_ORDER_TIME) = '2019-11-28';

    
    -- Được bán từ ngày 28/11/2019 đến ngày 02/12/2019
    SELECT * 
FROM T04_ORDER
WHERE DATE(C04_ORDER_TIME) BETWEEN '2019-11-28' AND '2019-12-02';

    -- Được bán trong tháng 11/2019
    SELECT * 
FROM T04_ORDER
WHERE MONTH(C04_ORDER_TIME) = 11 AND YEAR(C04_ORDER_TIME) = 2019;

    -- Được giao hàng tại Hòa Khánh
      SELECT * FROM T04_ORDER
      WHERE C04_DELIVERY_ADDRESS LIKE '%Hòa Khánh%';

-- 3. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân
-- 4. Giảm giá 20% tất cả các mặt hàng trong ngày 25/11/2019
UPDATE T03_ITEM_DETAIL
SET C03_SALES_PRICE = C03_SALES_PRICE * 0.8
WHERE C03_ITEM_ID IN (
    SELECT C01_ITEM_ID
    FROM T01_ITEM
    WHERE C04_ORDER_TIME = '2019-11-25'
);

-- 5. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.
SELECT DISTINCT C03_COLOR
FROM T03_ITEM_DETAIL;

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
SELECT *
FROM t01_item t01
JOIN t02_item_group t02 ON t01.C01_ITEM_GROUP_ID = t02.C02_ITEM_GROUP_ID
WHERE t02.C02_ITEM_GROUP_NAME IN ('Mũ', 'Thắt lưng');

-- 10. Liệt kê các đơn hàng được đặt trong ngày (28/11/2019, 14/12/2019)
SELECT *
FROM T04_ORDER
WHERE C04_ORDER_TIME = '2019-11-28'
   OR C04_ORDER_TIME = '2019-12-14';

-- ======================= REFRESH DATA - DEMO MULTI TABLES AND GROUPING =======================
-- 11. Sắp xếp các mặt hàng với giá bán tăng dần
-- 12. Sắp xếp các mặt hàng với giá mua giảm dần
-- 13. Sắp xếp các mặt hàng với giá bán tăng dần, giá mua giảm dần
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



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
SELECT * FROM T02_ITEM_GROUP;
    -- Mặt hàng thuộc loại hàng là 'Thắt lưng'
-- cách 1
SELECT * 
  FROM T01_ITEM t01
  JOIN  T02_ITEM_GROUP t02
	        ON t01.C01_ITEM_GROUP_ID = t02.C02_ITEM_GROUP_ID
			WHERE C02_ITEM_GROUP_NAME = 'Thắt lưng';
-- cách 2
SELECT * 
	FROM T01_ITEM
	WHERE C01_ITEM_GROUP_ID = (SELECT C02_ITEM_GROUP_ID 
							  FROM T02_ITEM_GROUP 
                              WHERE C02_ITEM_GROUP_NAME = 'Thắt lưng');
    -- Top 5 mặt hàng có giá bán cao nhất
SELECT *
		FROM t01_item t01
		JOIN t03_item_detail t03 
        ON   t01.C01_ITEM_ID = t03.C03_ITEM_ID
		WHERE (t03.C03_ITEM_ID, t03.C03_SALES_PRICE)
		IN (SELECT C03_ITEM_ID, MAX(C03_SALES_PRICE)
			FROM t03_item_detail
			GROUP BY C03_ITEM_ID)
		ORDER BY t03.C03_SALES_PRICE DESC
		LIMIT 5;

-- 2. Đơn hàng
    -- Được bán trong ngày 28/11/2019
    -- Cách 1
    SELECT * 
		FROM T04_ORDER
        WHERE DATE(C04_ORDER_TIME) = '2019-11-28';
	-- CÁCH 2
	SELECT CAST(C04_ORDER_TIME AS DATE) FROM T04_ORDER;
	-- DÙNG PATTER --> str_to_date
     SELECT * 
		FROM T04_ORDER
        WHERE CAST(C04_ORDER_TIME AS DATE) = STR_TO_DATE('27/10/2024', '%d/%m/%Y');
	SELECT * 
		FROM  T04_ORDER
		WHERE CAST(C04_ORDER_TIME AS DATE) = STR_TO_DATE('28/10/2024', '%d/%m/%Y');
    -- Được bán từ ngày 28/11/2019 đến ngày 02/12/2019
	SELECT * 
		FROM  T04_ORDER
		WHERE CAST(C04_ORDER_TIME AS DATE)
			BETWEEN STR_TO_DATE('28/11/2019', '%d/%m/%Y')
			AND STR_TO_DATE('02/12/2019', '%d/%m/%Y');
    -- Được bán trong tháng 11/2019
	SELECT * 
		FROM  T04_ORDER
		WHERE MONTH(C04_ORDER_TIME) = 11
		AND YEAR(C04_ORDER_TIME) = 2019;
    -- Được giao hàng tại Hòa Khánh
	SELECT * 
		FROM  T04_ORDER
		WHERE C04_DELIVERY_ADDRESS = 'Địa chỉ X6';
-- 3. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân
-- 4. Giảm giá 20% tất cả các mặt hàng trong ngày 25/11/2019
-- 5. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.
	SELECT DISTINCT (C03_COLOR)
		FROM   T03_ITEM_DETAIL;
-- 7. Liệt kê tất cả các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 23/11/2019
	SELECT	C01_ITEM_ID,
			C01_ITEM_NAME,
			C04_ORDER_TIME
		FROM T04_ORDER T04, T05_ORDER_DETAIL T05, T03_ITEM_DETAIL T03, T01_ITEM T01
		WHERE T04.C04_ORDER_ID = T05.C05_ORDER_ID
		AND T05.C05_ITEM_DETAIL_ID = T03.C03_ITEM_DETAIL_ID
		AND T03.C03_ITEM_ID = T01.C01_ITEM_ID
		AND CAST(C04_ORDER_TIME AS DATE) = str_to_date('27/10/2024', '%d/%m/%Y');
-- 8. Liệt kê các mặt hàng có giá bán từ 100 - 300
	SELECT C01_ITEM_ID, C01_ITEM_NAME, C03_SALES_PRICE
		FROM t01_item t01
		JOIN t03_item_detail t03 
        ON   t01.C01_ITEM_ID = t03.C03_ITEM_ID
		AND  C03_SALES_PRICE BETWEEN 100 AND 300;
-- 9. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'
	SELECT * 
		FROM t01_item t01
		JOIN  t02_item_group t02
	        ON t01.C01_ITEM_GROUP_ID = t02.C02_ITEM_GROUP_ID
		WHERE C02_ITEM_GROUP_NAME = 'Thắt lưng' OR C02_ITEM_GROUP_NAME = 'Mũ' ;
-- 10. Liệt kê các đơn hàng được đặt trong ngày (28/11/2019, 14/12/2019)
	SELECT * 
		FROM t04_order
		WHERE CAST(C04_ORDER_TIME AS DATE) = STR_TO_DATE('27/10/2024', '%d/%m/%Y') OR 
              CAST(C04_ORDER_TIME AS DATE) = STR_TO_DATE('29/10/2024', '%d/%m/%Y')
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
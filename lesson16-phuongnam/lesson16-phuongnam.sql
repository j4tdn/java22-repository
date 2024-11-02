

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

SELECT * FROM t04_order WHERE DATE(C04_ORDER_TIME) = '2024-11-01';
SELECT * FROM t04_order;
    -- Được bán trong ngày 28/11/2019
    -- Được bán từ ngày 28/11/2019 đến ngày 02/12/2019
    -- Được bán trong tháng 11/2019
    -- Được giao hàng tại Hòa Khánh
    SELECT * FROM t04_order WHERE C04_DELIVERY_ADDRESS LIKE '%6%';
-- 3. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân
-- 4. Giảm giá 20% tất cả các mặt hàng trong ngày 25/11/2019
-- 5. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.
SELECT DISTINCT C03_COLOR FROM t03_item_detail;

-- 7. Liệt kê tất cả các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 23/11/2019
-- 8. Liệt kê các mặt hàng có giá bán từ 100 - 300
SELECT * FROM t01_item inner Join t03_item_detail
			ON t01_item.C01_ITEM_ID = t03_item_detail.C03_ITEM_ID
            WHERE C03_SALES_PRICE BETWEEN 100 and 300;
-- 9. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'
SELECT * from t01_item WHERE C01_ITEM_GROUP_ID IN 
		(SELECT C02_ITEM_GROUP_ID FROM t02_item_group 
         WHERE C02_ITEM_GROUP_NAME IN ('Mũ', 'Thắt lưng'));
-- 10. Liệt kê các đơn hàng được đặt trong ngày (28/11/2019, 14/12/2019)
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
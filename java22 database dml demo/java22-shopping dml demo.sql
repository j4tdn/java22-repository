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

-- ------------------- ------------------------------------------

-- ======================= REFRESH DATA - DEMO SELECT 1 TABLE =======================

-- D. SELECT - SLIDE 25-44
-- 1. Toàn bộ thông tin các loại hàng
SELECT * FROM T02_ITEM_GROUP;

-- Mặt hàng thuộc loại hàng là 'Thắt lưng'
SELECT * FROM T01_ITEM;

SELECT t01.*
  FROM T01_ITEM t01
  JOIN T02_ITEM_GROUP t02
    ON t01.C01_ITEM_GROUP_ID = t02.C02_ITEM_GROUP_ID
 WHERE t02.C02_ITEM_GROUP_NAME = 'Thắt lưng';
 
-- sub query(truy vấn con)
-- trong mệnh đề where lại chứa 1 câu lệnh truy vấn khác(sub query)
SELECT *
  FROM T01_ITEM
 WHERE C01_ITEM_GROUP_ID = (SELECT C02_ITEM_GROUP_ID 
							  FROM T02_ITEM_GROUP 
							 WHERE C02_ITEM_GROUP_NAME = 'Thắt lưng');
  
-- Top 5 mặt hàng có giá bán cao nhất
-- Mặt hàng khác size xem như là mặt hàng khác
SELECT *
  FROM t03_item_detail
 ORDER BY C03_SALES_PRICE DESC
 LIMIT 5;
 
-- Về nhà: Top 5 mặt hàng(khác nhau mã mặt hàng) có giá bán cao nhất

-- 2. Đơn hàng
SELECT * FROM t04_order;

-- Được bán trong ngày '28/11/2019'
SELECT DATE(C04_ORDER_TIME) FROM t04_order;
SELECT cast(C04_ORDER_TIME AS date) FROM t04_order;
-- '2024-10-27' đúng format y-m-d --> hiểu KDL date
-- nếu muốn patern bất kỳ --> str_to_date

SELECT str_to_date('27/10/2024', '%d/%m/%Y');

SELECT * 
  FROM t04_order
 WHERE cast(C04_ORDER_TIME AS date) = str_to_date('27/10/2024', '%d/%m/%Y');

-- Được bán từ ngày 28/11/2019 đến ngày 02/12/2019
SELECT * 
  FROM t04_order
 WHERE cast(C04_ORDER_TIME AS date) BETWEEN '2024-10-27' AND '2024-10-27';

-- Được bán trong tháng 11/2019
SELECT * 
  FROM t04_order
 WHERE MONTH(C04_ORDER_TIME) = 10
 AND YEAR(C04_ORDER_TIME) = 2024;

-- Được giao hàng tại Hòa Khánh
-- =     --> equals
-- LIKE  --> %..., ...%, %...%
SELECT * 
  FROM t04_order
 WHERE C04_DELIVERY_ADDRESS LIKE '%Địa chỉ X1%';

-- 3. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân
SELECT *, 
       ROUND(C03_SALES_PRICE * 0.77, 2) AS C03_DISCOUNT_PRICE
  FROM t03_item_detail;

-- 4. Giảm giá 20% tất cả các mặt hàng trong ngày 25/11/2019
-- order, order_detail, item_detail
SELECT t03.*,
       ROUND(C03_SALES_PRICE * 0.8, 2) DISCOUNT_PRICE,
       '26.10.2024' AS SALES_DATE
  FROM t04_order t04
  JOIN t05_order_detail t05 ON t05.C05_ORDER_ID = t04.C04_ORDER_ID
  JOIN t03_item_detail t03  ON t03.C03_ITEM_DETAIL_ID = t05.C05_ITEM_DETAIL_ID
 WHERE cast(C04_ORDER_TIME AS date) = str_to_date('26/10/2024', '%d/%m/%Y') ;

-- 5. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.
SELECT DISTINCT C03_COLOR
  FROM t03_item_detail;

-- 6. Liệt kê tất cả các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 23/11/2019
SELECT t01.C01_ITEM_ID,
	   t01.C01_ITEM_NAME,
       t03.C03_SIZE_ID,
       cast(C04_ORDER_TIME AS TIME) ORDER_TIME 
  FROM t04_order t04
  JOIN t05_order_detail t05 ON t05.C05_ORDER_ID = t04.C04_ORDER_ID
  JOIN t03_item_detail t03  ON t03.C03_ITEM_DETAIL_ID = t05.C05_ITEM_DETAIL_ID
  JOIN t01_item t01 ON t01.C01_ITEM_ID = t03.C03_ITEM_ID
 WHERE cast(C04_ORDER_TIME AS date) = str_to_date('26/10/2024', '%d/%m/%Y');

-- 7. Liệt kê các mặt hàng có giá bán từ 100 - 300
SELECT *
  FROM t03_item_detail
 WHERE C03_SALES_PRICE BETWEEN 100 AND 300; 

-- 8. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'
-- Mệnh đề IN --> Thực thi sub query được kết quả --> thực thi main query
--            --> Thường bị performance và trong 1 số ngôn ngữ bị giới hạn số lượng phần tử

-- Mệnh đề EXISTS --> Thực thi song song sub và main query
 
SELECT *
  FROM T01_ITEM
 WHERE C01_ITEM_GROUP_ID IN (SELECT C02_ITEM_GROUP_ID 
							   FROM T02_ITEM_GROUP 
							  WHERE C02_ITEM_GROUP_NAME IN ('Thắt lưng', 'Mũ'));

SELECT *
  FROM T01_ITEM t01
 WHERE NOT EXISTS (SELECT * -- EXISTS --> ko quan tâm đến phần SELECT ở sub query
			     FROM T02_ITEM_GROUP t02
			    WHERE C02_ITEM_GROUP_NAME IN ('Thắt lưng', 'Mũ')
                  AND t01.C01_ITEM_GROUP_ID = t02.C02_ITEM_GROUP_ID);

-- 9. Liệt kê các đơn hàng được đặt trong ngày (28/11/2019, 14/12/2019)

-- =============================================================================================
SELECT @@sql_mode;
SET sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY',''));
SET sql_mode=(SELECT CONCAT(@@sql_mode, ',ONLY_FULL_GROUP_BY'));

-- 100% dùng ONLY_FULL_GROUP_BY mode
-- Khi có group by, thuộc tính xuất hiện ở SELECT thì phải thuộc trong group by, ngoại từ các hàm
-- để xử lý dữ liệu trên từng nhóm

-- COUNT(*): Đếm số dòng
-- COUNT(column_name): Đếm số dòng có column_name value != null
-- nếu column non nullable, tự động chuyển về count(*)
SELECT * FROM t999_logger;
INSERT INTO t999_logger(C999_MESSAGE, C999_LEVEL)
VALUES('M1', 'L1'),
      ('M2', 'L2'),
      (null, null),
      (null, 'L3');
SELECT COUNT(*) FROM t999_logger;
SELECT COUNT(C999_MESSAGE) FROM t999_logger;
SELECT COUNT(C999_LEVEL) FROM t999_logger;

SELECT GROUP_CONCAT(C999_MESSAGE) FROM t999_logger;

-- Câu hỏi 1: Đếm số lượng mặt hàng trên từng loại hàng
SELECT C01_ITEM_GROUP_ID,
       COUNT(*) AMOUNT_OF_ITEMS,
       GROUP_CONCAT(C01_ITEM_NAME SEPARATOR ', ') ITEM_NAMES
  FROM t01_item
 GROUP BY C01_ITEM_GROUP_ID
 HAVING AMOUNT_OF_ITEMS > 2;
 
-- Câu hỏi 2: 
-- Liệt kê các mặt hàng thuộc loại hàng thắt lưng, quần có giá trung bình > 300 
-- Thông tin trả về gồm: MaMH, TenMH, GiaTrungBinh, TenLH
SELECT t01.C01_ITEM_ID,
       t01.C01_ITEM_NAME,
       AVG(t03.C03_SALES_PRICE) AVG_PRICE,
       t02.C02_ITEM_GROUP_NAME
  FROM t01_item t01
  JOIN t03_item_detail t03 ON t03.C03_ITEM_ID = t01.C01_ITEM_ID
  JOIN t02_item_group t02 ON t02.C02_ITEM_GROUP_ID = t01.C01_ITEM_GROUP_ID
 WHERE t02.C02_ITEM_GROUP_NAME IN ('Thắt lưng', 'Quần') 
 GROUP BY t01.C01_ITEM_ID, t01.C01_ITEM_NAME, t02.C02_ITEM_GROUP_NAME
 HAVING AVG_PRICE > 300
 ORDER BY AVG_PRICE DESC;

-- ======================= REFRESH DATA - DEMO MULTI TABLES AND GROUPING =======================
-- 11. Sắp xếp các mặt hàng với giá bán(theo size) tăng dần

-- 12. Sắp xếp các mặt hàng với giá mua(mới nhất, nếu thời gian trùng nhau --> lấy record có sid nhỏ nhất) giảm dần
SELECT * FROM t101_supplier_chain;

SELECT *
  FROM t101_supplier_chain
  WHERE C101_ITEM_ID = 5
  ORDER BY C101_ENTERING_DATE DESC, C101_SID ASC
  LIMIT 1;

-- Áp dụng trong trường hợp
-- Lấy N phần tử trong mỗi nhóm
WITH cte_item_ranking AS (
	SELECT *,
		   ROW_NUMBER() OVER (
			  PARTITION BY C101_ITEM_ID -- phân nhóm trước khi đánh row_num
			  ORDER BY C101_ENTERING_DATE DESC, C101_SID ASC
		   ) row_num
	  FROM t101_supplier_chain
)
SELECT C101_SID,C101_ITEM_ID,C101_SUPPLIER_ID,C101_AMOUNT,C101_ENTERING_DATE,C01_BUY_PRICE
  FROM cte_item_ranking 
 WHERE row_num = 1 ORDER BY C01_BUY_PRICE;

WITH cte_temp AS (
	SELECT t01.C01_ITEM_ID ITEM_ID,
		   MAX(t101.C101_ENTERING_DATE) MAX_DATE
	  FROM t01_item t01
	  JOIN t101_supplier_chain t101 ON t101.C101_ITEM_ID = t01.C01_ITEM_ID
	 GROUP BY t01.C01_ITEM_ID
)
SELECT *
  FROM t101_supplier_chain t101
  JOIN cte_temp temp ON t101.C101_ITEM_ID = temp.ITEM_ID
                    AND t101.C101_ENTERING_DATE = temp.MAX_DATE
 ORDER BY C01_BUY_PRICE DESC;
 
ALTER TABLE t101_supplier_chain
CHANGE COLUMN C01_BUY_PRICE C101_BUY_PRICE DOUBLE NOT NULL;


-- 13. Sắp xếp các mặt hàng với giá bán(theo size) tăng dần, giá mua(mới nhất, sid) giảm dần
-- itemId  sizeId salesPrice  buyPrice
--   A      1         12        5
--   A      3         24        5
--   A      2         36        5
--   B      3         77        2
--   B      5         55        2
--   A      4         24        5
--   A      5         24        5
--   C      1         24        4
-- Tìm giá mua của từng mặt hàng theo yêu cầu
WITH cte_item_ranking AS (
	SELECT *,
		   ROW_NUMBER() OVER (
			  PARTITION BY C101_ITEM_ID -- phân nhóm trước khi đánh row_num
			  ORDER BY C101_ENTERING_DATE DESC, C101_SID ASC
		   ) row_num
	  FROM t101_supplier_chain
),
cte_item_with_buy_price AS (
    SELECT C101_ITEM_ID,
		   C101_BUY_PRICE
	  FROM cte_item_ranking
	 WHERE row_num = 1
)
SELECT t03.*,
       cte.C101_BUY_PRICE
  FROM t03_item_detail t03
  JOIN cte_item_with_buy_price cte
    ON cte.C101_ITEM_ID = t03.C03_ITEM_ID
 ORDER BY t03.C03_SALES_PRICE, cte.C101_BUY_PRICE DESC;

-- 14. Đếm số lượng các mặt hàng trong hệ thống
SELECT * FROM t01_item;
SELECT COUNT(*) FROM t01_item;
SELECT COUNT(C01_ITEM_ID) FROM t01_item;

-- 15. Số lượng 'Giày 9' được bán trong ngày 23/11/2019
SELECT 'Giày 9' AS ITEM_NAME,
	   SUM(t05.C05_AMOUNT) TOTAL_OF_SALES_ITEMS
  FROM t01_item t01
  JOIN t03_item_detail t03 ON t01.C01_ITEM_ID = t03.C03_ITEM_ID
  JOIN t05_order_detail t05 ON t05.C05_ITEM_DETAIL_ID = t03.C03_ITEM_DETAIL_ID
  JOIN t04_order t04 ON t04.C04_ORDER_ID = t05.C05_ORDER_ID
 WHERE date(t04.C04_ORDER_TIME) = '2024-10-27'
   AND t01.C01_ITEM_NAME LIKE '%Giày 9%';

-- 16. Đếm số lượng các mặt hàng theo từng loại hàng
--  MaLoai  TenLoai SoLuong
-- 	1       Giày    20
-- 	2       Áo      28

-- 16.1: Đếm, count số lượng mặt hàng trong từng loại hàng

-- 16.2: Đếm, sum số lượng mặt hàng trong từng loại hàng

-- 17. Tìm mặt hàng có giá bán cao nhất trong loại hàng 'Giày'

-- 18. Tìm mặt hàng có giá bán cao nhất của mỗi loại hàng
-- MatHang -> GiaBan
-- MatHang(LoaiHang) + Size -> GiaBan

-- B1: Tìm giá bán trung bình của mỗi mặt hàng
-- B2: Tìm giá bán cao nhất trong mỗi loại hàng
WITH CTE_ITEMS AS (
	SELECT C03_ITEM_ID ITEM_ID,
		   avg(C03_SALES_PRICE) SALES_PRICE
	  FROM t03_item_detail
	  GROUP BY C03_ITEM_ID
)
SELECT t1.C01_ITEM_GROUP_ID ITEM_GROUP_ID,
       MAX(cte.SALES_PRICE) MAX_SALES_PRICE
  FROM CTE_ITEMS cte
  JOIN t01_item t1
    ON cte.ITEM_ID = t1.C01_ITEM_ID
  GROUP BY t1.C01_ITEM_GROUP_ID;
  
-- Thay thế bằng VIEW

SELECT t1.C01_ITEM_GROUP_ID ITEM_GROUP_ID,
       MAX(vi.SALES_PRICE) MAX_SALES_PRICE
  FROM V_ITEMS vi
  JOIN t01_item t1
    ON vi.ITEM_ID = t1.C01_ITEM_ID
  GROUP BY t1.C01_ITEM_GROUP_ID;
  
-- Tìm mặt hàng có giá bán cao nhất trong mỗi loại hàng
WITH CTE_ITEMS AS (
	SELECT C03_ITEM_ID ITEM_ID,
		   avg(C03_SALES_PRICE) SALES_PRICE
	  FROM t03_item_detail
	  GROUP BY C03_ITEM_ID
),
CTE_SALES_RANKING AS (
	SELECT cte.*,
		   t1.C01_ITEM_GROUP_ID ITEM_GROUP_ID,
		   ROW_NUMBER() OVER (
			  PARTITION BY t1.C01_ITEM_GROUP_ID
			  ORDER BY cte.SALES_PRICE DESC
		   ) row_num
	  FROM CTE_ITEMS cte
	  JOIN t01_item t1
		ON cte.ITEM_ID = t1.C01_ITEM_ID
)
SELECT *
  FROM CTE_SALES_RANKING
  WHERE row_num = 1;
  
-- 19. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống

-- 20. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống
--     Điều kiện tổng số lượng > 20 mặt hàng

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



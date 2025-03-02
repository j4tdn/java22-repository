select * from t04_order;
select * from t05_order_detail;

SELECT t01.C01_ITEM_GROUP_ID,
       t01.C01_ITEM_NAME,
       TIME(t04.C04_ORDER_TIME) 
FROM t01_item t01 
JOIN t03_item_detail t03
 ON t01.C01_ITEM_ID = t03.C03_ITEM_ID
JOIN t05_order_detail t05 
ON t05.C05_ITEM_DETAIL_ID = t03.C03_ITEM_DETAIL_ID
JOIN t04_order t04
 ON t04.C04_ORDER_ID = t05.C05_ORDER_ID
WHERE DATE(t04.C04_ORDER_TIME) = '2024-10-27'
GROUP BY t01.C01_ITEM_GROUP_ID, t01.C01_ITEM_NAME, t04.C04_ORDER_TIME;

-- 3. Liệt kê top 3 mặt hàng được bán nhiều nhất của năm bất kì. Với năm là tham số truyền vào
SELECT t01.C01_ITEM_NAME
  FROM t04_order t04
  JOIN t05_order_detail t05
	ON t04.C04_ORDER_ID = t05.C05_ORDER_ID
  JOIN t03_item_detail t03
	ON t01.C01_ITEM_ID = t03.C03_ITEM_ID
 WHERE year(t04.C04_ORDER_TIME) = ?
 GROUP BY t01.C01_ITEM_ID, t01.C01_ITEM_NAME
 ORDER BY sum(t05.C05_AMOUNT) desc, t1.C01_ITEM_ID desc
 LIMIT 3;
 
 -- 4
 SELECT t01.C01_ITEM_ID,
       t01.C01_ITEM_NAME,
	   t03.C03_ITEM_DETAIL_ID,
       t02.C02_ITEM_GROUP_ID,
       t02.C02_ITEM_GROUP_NAME
  FROM t02_item_group t02
  JOIN t01_item t01
    ON t01.C01_ITEM_GROUP_ID = t02.C02_ITEM_GROUP_ID
  JOIN t03_item_detail t03
    ON t03.C03_ITEM_ID = t01.C01_ITEM_ID;


-- java22-shopping dbp 02.sql
-- Thêm khóa ngoại cho T03_ITEM_DETAIL
ALTER TABLE T03_ITEM_DETAIL
ADD CONSTRAINT FK_T03_T01 FOREIGN KEY (C03_ITEM_ID)
						  REFERENCES T01_ITEM(C01_ITEM_ID);
                          
ALTER TABLE T03_ITEM_DETAIL
ADD CONSTRAINT FK_T03_T12 FOREIGN KEY (C03_SIZE_ID)
						  REFERENCES T12_SIZE(C12_SIZE_ID);
                          
-- referencing: Bảng con N - chứa khóa ngoại
-- referenced: Bảng cha 1 - chứa khóa chính
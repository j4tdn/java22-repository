

-- CREATE TABLE T09_PAYMENT_METHOD(
-- C09_PAYMENT_METHOD_ID  INT PRIMARY KEY AUTO_INCREMENT,
-- C09_PAYMENT_TYPE VARCHAR(255) NOT NULL,
-- -- CONSTRAINT UNQ_T09_PM_TYPE UNIQUE(C09_PM_TYPE), 
-- -- CONSTRAINT T09_PM_TYPE_CHECK CHECK (C09_PM_TYPE IN ('Thanh toán khi nhận hàng', 
-- -- 													'Thanh toán online - chuyển khoản', 
--   --                                                   'Thanh toán online - thẻ ghi nợ')),
--                                                     
-- CONSTRAINT UNQ_T09_PAYMENT_TYPE UNIQUE(C09_PAYMENT_TYPE)

-- );

-- CREATE TABLE T10_ORDER_STATUS(
-- C10_STATUS_ID INT PRIMARY KEY AUTO_INCREMENT,
-- C10_STATUS_DESC VARCHAR(255) NOT NULL,
-- CONSTRAINT UNQ_T10_STATUS_DESC UNIQUE(C10_STATUS_DESC),
-- CONSTRAINT T10_STATUS_DESC_CHECK CHECK (C10_STATUS_DESC IN ('Chờ xác nhận', 
-- 													'Đang đóng gói', 
--                                                     'Đóng gói hoàn thành',
--                                                     'Đang vận chuyển',
--                                                     'Giao hàng thành công',
--                                                     'Giao hàng thất bại',
--                                                     'Huỷ đơn hàng'
--                                                     ))
-- )

CREATE TABLE T09_PAYMENT_METHOD (
	C09_PAYMENT_METHOD_ID INT PRIMARY KEY AUTO_INCREMENT,
	C09_PAYMENT_METHOD_TYPE VARCHAR(255) NOT NULL,
    CONSTRAINT UNQ_T09_PAYMENT_METHOD_TYPE UNIQUE(C09_PAYMENT_METHOD_TYPE)
);

CREATE TABLE T10_ORDER_STATUS (
	C10_STATUS_ID INT PRIMARY KEY AUTO_INCREMENT,
	C10_STATUS_DESC VARCHAR(255) NOT NULL,
    CONSTRAINT UNQ_T10_STATUS_DESC UNIQUE(C10_STATUS_DESC)
);


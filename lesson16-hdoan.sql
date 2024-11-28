-- Phần A. Phân tích và viết các lệnh để xây dựng cơ sở dữ liệu dựa vào mô tả phía trên
CREATE DATABASE QUANLYCONGTY;
USE QUANLYCONGTY;

SET FOREIGN_KEY_CHECKS = 0;

CREATE TABLE NHANVIEN(
	MaNV INT PRIMARY KEY,
    HoTen VARCHAR(100) NOT NULL,
    DiaChi VARCHAR(255),
    Luong DECIMAL(15, 2),
    GioiTinh VARCHAR(10),
    NgaySinh DATE,
    NgayVaoCty DATE,
    MaPhongBan INT,
    MaGiamSat INT,
    FOREIGN KEY (MaPhongBan) REFERENCES PHONGBAN(MaPB),
    FOREIGN KEY (MaGiamSat) REFERENCES NHANVIEN(MaNV)
);

CREATE TABLE PHONGBAN(
	MaPB INT PRIMARY KEY,
    TenPB VARCHAR(100) NOT NULL UNIQUE,
    TruongPhong INT UNIQUE,
    NgayNhanChuc DATE,
    FOREIGN KEY (TruongPhong) REFERENCES NHANVIEN(MaNV)
);

CREATE TABLE DUAN(
	MaDA INT PRIMARY KEY,
	TenDA VARCHAR(100) NOT NULL UNIQUE,
    NgayBatDau DATE,
    NgayKetThuc DATE,
    ThuNhap DECIMAL(15, 2),
    QLDuAn INT UNIQUE,
    FOREIGN KEY (QLDuAn) REFERENCES NHANVIEN(MaNV)
);

CREATE TABLE NHANVIEN_DUAN(
	MaNV INT,
    MaDA INT,
    SoGioLam DECIMAL(5, 2),
    PRIMARY KEY (MaNV, MaDA),
    FOREIGN KEY (MaNV) REFERENCES NHANVIEN(MaNV),
    FOREIGN KEY (MaDA) REFERENCES DUAN(MaDA)
);

SET FOREIGN_KEY_CHECKS = 1;

-- Phần B. Viết các lệnh để tạo dữ liệu kiểm thử cho dự án
-- Yêu cầu: Ít nhất 5 dòng cho mỗi bảng dữ liệu

INSERT INTO PHONGBAN(MaPB, TenPB, TruongPhong, NgayNhanChuc)
VALUES
(1, 'Phong Ky Thuat', 101, '2024-01-15'),
(2, 'Phong Nhan Su', 102, '2024-02-01'),
(3, 'Phong Kinh Doanh', 104, '2024-01-03'),
(4, 'Phong Tai Chinh', 105, '2024-04-01'),
(5, 'Phong Marketing', NULL, NULL);

INSERT INTO NHANVIEN(MaNV, HoTen, DiaChi, Luong, GioiTinh, NgaySinh, NgayVaoCty, MaPhongBan, MaGiamSat)
VALUES
(101, 'Nguyen Tien Luat', 'Ha Noi', 20000000, 'Nam', '1995-05-20', '2017-03-15', 1, NULL),
(102, 'Tran Thi Hien', 'Ho Chi Minh', 18000000, 'Nu', '1997-04-19', '2019-04-12', 2, NULL),
(103, 'Pham Van Chinh', 'Ha Noi', 15000000, 'Nam', '1996-09-27', '2018-09-13', 1, 101),
(104, 'Le Thi Hue', 'Da Nang', 22000000, 'Nu', '1999-06-22', '2020-09-20', 3, NULL),
(105, 'Vu Van Thanh', 'Hue', 25000000, 'Nam', '1998-03-16', '2016-05-11', 4, NULL);

INSERT INTO DUAN(MaDA, TenDA, NgayBatDau, NgayKetThuc, ThuNhap, QLDuAn)
VALUES
(201, 'Du An A', '2023-01-01', '2023-06-01', 500000000, 101),
(202, 'Du An B', '2022-05-01', '2022-07-25', 100000000, 102),
(203, 'Du An C', '2022-01-23', '2022-5-15', 200000000, 104),
(204, 'Du An D', '2023-04-01', NULL , 450000000, 105),
(205, 'Du An E', '2023-07-22', '2023-10-22', 600000000, NULL);

INSERT INTO NHANVIEN_DUAN(MaNV, MaDA, SoGioLam)
VALUES
(101, 201, 120),
(103, 201, 100),
(102, 202, 90),
(104, 203, 150),
(105, 204, 200),
(103, 204, 80);

-- Phần C. Thực hiện truy vấn
-- 1. Liệt kê các dự án diễn ra trong năm *?* có số tiền thu được trên *?* triệu VND
SELECT *
FROM DUAN
WHERE YEAR(NgayBatDau) = '2022' AND ThuNhap > 100000000;

-- 2. Liệt kê các nhân viên đã tham gia hơn ?*? giờ trong các dự án, hiển thị chi tiết số giờ trong mỗi
-- dự án mà nhân viên tham gia

SELECT 
	NV.MaNV,
    NV.HoTen,
    DA.MaDA,
    NV_DuAn.SoGioLam
FROM NHANVIEN_DUAN NV_DuAn
JOIN NHANVIEN NV ON NV_DuAn.MaNV = NV.MaNV
JOIN DUAN DA ON NV_DuAn.MaDA = DA.MaDA
WHERE NV_DuAn.SoGioLam > 100;

-- 3. Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp nhân
-- viên đó
SELECT 
		NV.MaNV,
        NV.HoTen TenNhanVien,
        NV.Luong LuongNhanVien,
        (SELECT HoTen FROM NHANVIEN WHERE MaNV = NV.MaGiamSat) TenGiamSat,
        (SELECT Luong FROM NHANVIEN WHERE MaNV = NV.MaGiamSat) Luong
FROM NHANVIEN NV
WHERE NV.Luong >= (
					SELECT Luong 
                    FROM NHANVIEN
                    WHERE MaNV = NV.MaGiamSat);
-- 4. Liệt kê các phòng ban có số lượng nhân viên lớn hơn *?*
SELECT 
	pb.MaPB,
    pb.TenPB,
    COUNT(nv.MaNV) SoLuongNhanVien
FROM PHONGBAN pb
JOIN NHANVIEN nv ON nv.MaPhongBan = pb.MaPB
GROUP BY pb.MaPB, pb.TenPB
HAVING COUNT(nv.MaNV) > 1;

-- 5. Liệt kê các nhân viên đã làm việc cho công ty hơn ?*? năm
SELECT 
	MaNV,
    HoTen,
    NgayVaoCty,
    DATEDIFF(CURRENT_DATE(), NgayVaoCty) SoNgayLamViec
FROM NHANVIEN 
WHERE DATEDIFF(CURRENT_DATE(), NgayVaoCty) > 2100;

-- 6. Liệt kê các nhân viên vừa là trưởng phòng ban, và là quản lý dự án
SELECT 
	NV.MaNV,
    NV.HoTen
FROM NHANVIEN NV
JOIN PHONGBAN PB ON NV.MaNV = PB.TruongPhong
JOIN DUAN DA ON NV.MaNV = DA.QLDuAn;

-- 7. Liệt kê các nhân viên quản lý nhiều hơn 1 dự án
SELECT 
	NV.MaNV,
    NV.HoTen,
    COUNT(DA.QLDuAn) SoLuongDuAnQuanLy
FROM NHANVIEN NV
JOIN DUAN DA ON NV.MaNV = DA.QLDuAn
GROUP BY NV.MaNV, NV.HoTen
HAVING COUNT(DA.QLDuAn) >= 1;

-- 8. Mỗi khi nhân viên tham gia vào dự án chúng ta cần lưu lại thông tin hay còn được gọi là log để
-- biết nhân viên đó tham gia vào dự án vào thời gian nào
-- Mỗi khi nhân viên cập nhật số giờ tham gia dự án, ta cần lưu lại thông tin thời gian cập nhật khi
-- nào, số giờ tham gia cũ, số giờ tham gia mới
-- Công việc được thực hiện tự động khi dữ liệu được thêm, cập nhật

CREATE TABLE LOG(
	MaLog INT PRIMARY KEY AUTO_INCREMENT,
    MaNV INT,
    MaDA INT, 
    ThoiGianThamGia DATETIME,
    ThoiGianCapNhat DATETIME,
    SoGioThamGiaCu INT,
    SoGioThamGiaMoi INT,
    FOREIGN KEY (MaNV) REFERENCES NHANVIEN(MaNV),
    FOREIGN KEY (MaDA) REFERENCES DUAN(MaDA)
);

DELIMITER $$
CREATE TRIGGER SauKhiThemNhanVien
	 AFTER INSERT
	 ON NHANVIEN_DUAN
	 FOR EACH ROW
 BEGIN
	INSERT INTO LOG(MaNV, MaDA, ThoiGianThamGia, ThoiGianCapNhat, SoGioThamGiaCu, SoGioThamGiaMoi)
    VALUES (NEW.MaNV, NEW.MaDA, NOW(), NOW(), 0, NEW.SoGioLam);
END $$
DELIMITER ;

DELIMITER $$
CREATE TRIGGER SauKhiCapNhatNhanVien
	 AFTER UPDATE
	 ON NHANVIEN_DUAN
	 FOR EACH ROW
 BEGIN
	INSERT INTO LOG(MaNV, MaDA, ThoiGianThamGia, ThoiGianCapNhat, SoGioThamGiaCu, SoGioThamGiaMoi)
    VALUES (NEW.MaNV, NEW.MaDA, NOW(), NOW(), OLD.SoGioLam, NEW.SoGioLam);
END $$
DELIMITER ;

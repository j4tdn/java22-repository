package Ex03PhanTuYenNgua;

public class KiemTraPhanTu {

    // Phương thức kiểm tra phần tử yên ngựa
    public static void kiemTraYenNgua(int[][] maTran, int soHang, int soCot) {
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                int giaTriHienTai = maTran[i][j];

                // Kiểm tra xem có phải là phần tử nhỏ nhất trong hàng
                boolean laMinTrongHang = true;
                for (int k = 0; k < soCot; k++) {
                    if (maTran[i][k] < giaTriHienTai) {
                        laMinTrongHang = false;
                        break;
                    }
                }

                // Kiểm tra xem có phải là phần tử lớn nhất trong cột
                boolean laMaxTrongCot = true;
                for (int k = 0; k < soHang; k++) {
                    if (maTran[k][j] > giaTriHienTai) {
                        laMaxTrongCot = false;
                        break;
                    }
                }

                // In kết quả
                if (laMinTrongHang && laMaxTrongCot) {
                    System.out.println("Phần tử yên ngựa: A[" + i + "][" + j + "] = " + giaTriHienTai);
                }
            }
        }
    }
}


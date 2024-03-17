package Btap4;
public class DocSo {

    private static final String[] SO = {"Không", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín"};
    private static final String[] HANG_CHUC = {"", "Mười", "Hai mươi", "Ba mươi", "Bốn mươi", "Năm mươi", "Sáu mươi", "Bảy mươi", "Tám mươi", "Chín mươi"};
    private static final String[] HANG_TRAM = {"", "Một trăm", "Hai trăm", "Ba trăm", "Bốn trăm", "Năm trăm", "Sáu trăm", "Bảy trăm", "Tám trăm", "Chín trăm"};

    public static void main(String[] args) {
      
        System.out.println(readNumber(6)); 
        System.out.println(readNumber(25)); 
        System.out.println(readNumber(101)); 
        System.out.println(readNumber(321)); 
    }

    public static String readNumber(int n) {
        if (n < 0 || n > 999) {
            return "Số nhập vào không hợp lệ";
        }
        if (n == 0) {
            return SO[0];
        }

        int tram = n / 100;
        int chuc = (n % 100) / 10;
        int donVi = n % 10;

        String ketQua = HANG_TRAM[tram];

        if (chuc == 0 && donVi > 0) {
            ketQua += " linh";
        } else {
            ketQua += " " + HANG_CHUC[chuc];
        }

        if (chuc > 1 && donVi == 1) {
            ketQua += " mốt";
        } else if (chuc > 0 && donVi == 5) {
            ketQua += " lăm";
        } else if (donVi > 0 || (chuc == 1 && donVi == 0)) {
            ketQua += " " + SO[donVi];
        }

        return ketQua.trim();
    }
}

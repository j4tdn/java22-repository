package lesson06_pttsang;

public class Ex04Test {
    public static void main(String[] args) {
        int number = 123; 
        String result = readNumber(number);
        System.out.println("Số " + number + " đọc là: " + result);
    }

    
    public static String readNumber(int n) {
        if (n < 0 || n > 999) {
            return "Số không hợp lệ";
        }

        String[] ones = {"", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        String[] tens = {"", "mười", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi", "tám mươi", "chín mươi"};
        String[] hundreds = {"", "một trăm", "hai trăm", "ba trăm", "bốn trăm", "năm trăm", "sáu trăm", "bảy trăm", "tám trăm", "chín trăm"};

        int hundredDigit = n / 100;
        int tenDigit = (n % 100) / 10;
        int oneDigit = n % 10; // a

        StringBuilder result = new StringBuilder();
        
        if (hundredDigit > 0) {
            result.append(hundreds[hundredDigit]).append(" ");
        }

        if (tenDigit == 0 && oneDigit > 0) {
            result.append("linh ");
        }

        if (tenDigit == 1) {
            result.append("mười ");
        } else if (tenDigit > 1) {
            result.append(tens[tenDigit]).append(" ");
        }

        if (oneDigit > 0 && tenDigit != 1) {
            result.append(ones[oneDigit]);
        }

        return result.toString().trim();
    }
}
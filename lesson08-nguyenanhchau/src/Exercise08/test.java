package Exercise08;

public class test {
    public static void main(String[] args) {
        String S = "aaabaaabbaaaaa";
        int maxLength = 1; // Khởi tạo độ dài lớn nhất là 1, vì chuỗi có ít nhất 1 ký tự
        int minLength = Integer.MAX_VALUE; // Khởi tạo độ dài nhỏ nhất là giá trị lớn nhất của kiểu int

        int count = 1; // Biến đếm độ dài dãy con đúng
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) == S.charAt(i - 1)) {
                count++; // Nếu ký tự hiện tại giống với ký tự trước đó, tăng biến đếm lên 1
            } else {
                // Nếu ký tự hiện tại không giống với ký tự trước đó
                // Kiểm tra độ dài của dãy con đúng hiện tại và cập nhật độ dài lớn nhất và nhỏ nhất nếu cần
                maxLength = Math.max(maxLength, count);
                if (count > 1) {
                    minLength = Math.min(minLength, count);
                }
                count = 1; // Đặt lại biến đếm về 1
            }
        }

        // Kiểm tra độ dài của dãy con đúng tại vị trí cuối cùng của chuỗi S
        maxLength = Math.max(maxLength, count);
        if (count > 1) {
            minLength = Math.min(minLength, count);
        }

        // In ra kết quả
        System.out.println("Độ dài lớn nhất của dãy con đúng: " + maxLength);
        System.out.println("Độ dài nhỏ nhất của dãy con đúng: " + minLength);
    }
}

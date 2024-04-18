package view;

public class Ex05 {

	public static void main(String[] args) {

		String s1 = "ABCEDEABC";
		String s2 = "ABCEDCBBCK";

		int m = s1.length();
		int n = s2.length();
		int row = 0;
		int[][] arr = new int[m][n];
		int max = 0; // biến đếm chiều dài của sâu con chung
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {

				if (s1.charAt(i) == s2.charAt(j)) {
					// Các phần tử ở vị trí cột hoặc hàng = 0 thì tại đó gán giá trị cho phần tử bằng 1
					if (i == 0 || j == 0) {
						arr[i][j] = 1;
					}

					else {
						// Phần tử nào mà có phần tử phía chéo góc trái khác 0 thì tăng giá trị phần tử đó thêm 1
						if (arr[i - 1][j - 1] != 0) {
							arr[i][j] = arr[i - 1][j - 1] + 1;
							if (arr[i][j] > max) {
								max = arr[i][j];
								row = i; // vị trí cuối cùng của chuỗi substring
							}
						} else {
							arr[i][j] = 1;
						}

					}
				}
			}
		}
		System.out.println("độ dài max là : " + max);
		String sub = "";

		sub = s1.substring(row - max + 1, row + 1);
		if (max != 0) {
			System.out.println("Chuỗi xâu con chung dài nhất là: " + sub);
		} else {
			System.out.println("Không có chuỗi xâu con chung");
		}

	}
}

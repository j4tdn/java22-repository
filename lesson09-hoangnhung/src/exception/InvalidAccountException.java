package exception;

public class InvalidAccountException extends Exception {

	private static final long serialVersionUID = 13456789034567892L;
	
	public InvalidAccountException(AccountError error) {
		super(error.getValue());
	}

	public enum AccountError{
		
		LESS_THAN_REQUIRED_LENGTH("Độ dài mật khẩu >= 8"),
		AT_LEAST_ONE_LOWER_UPPER_SPECIAL_LETTER("Có ít nhất 1 chữ số, 1 kí tự in hoa và 1 kí tự đặc biệt"),
		OVERLAP_MORE_THAN_REQUIRE_LETTERS("Không được trùng quá 3 ký tự với tên tài khoản");
		
		
		private String value;
		
		AccountError(String value) {
			this.value =  value;
		}
		
		public String getValue() {
			return value;
		}
		
	}
}
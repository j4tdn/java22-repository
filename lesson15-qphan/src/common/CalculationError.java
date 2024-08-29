package common;

public enum CalculationError {
	
	LESS_THAN_REQUIRED_MIN_PLANNING_AMOUNT("Planning Amount is not matched the required Min Planning Amount");
	
	private String message;
	
	CalculationError(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}

package exception;

import common.CalculationError;

public class CalculationException extends Exception {
	private static final long serialVersionUID = 2745768268155000428L;

	public CalculationException(CalculationError calculationError) {
		
	}
	
	public CalculationException(String message) {
		super(message);
	}
	
}

package validation;

public interface Validator<T extends Exception> {
	
	void validate() throws T;
	
}

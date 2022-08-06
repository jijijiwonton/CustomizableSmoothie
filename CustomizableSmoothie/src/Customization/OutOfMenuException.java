package Customization;

public class OutOfMenuException extends Exception {
	
	public OutOfMenuException() {}
	
	public OutOfMenuException(String message) {
		super(message);	
	}
	
	public OutOfMenuException(Throwable cause) {
		super(cause);
	}

}

package in.ineuron.exception;

public class NegativeNumberException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NegativeNumberException() {
		super();
		System.out.println("You entered negative number please enter postive number");
	}

}

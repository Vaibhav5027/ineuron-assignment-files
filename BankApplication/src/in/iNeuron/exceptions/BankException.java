package in.iNeuron.exceptions;

public class BankException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;
	
	public String message;
	public BankException(String msg){
		this.message=msg;
	}
}

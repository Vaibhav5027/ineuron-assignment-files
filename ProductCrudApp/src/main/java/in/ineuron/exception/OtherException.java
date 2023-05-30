package in.ineuron.exception;

public class OtherException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;
	private String msg;
	
	public OtherException(String msg) {
		this.msg=msg;
	}

}

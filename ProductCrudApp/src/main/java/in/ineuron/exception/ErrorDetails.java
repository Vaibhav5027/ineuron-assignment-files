package in.ineuron.exception;

import java.time.LocalDateTime;

public class ErrorDetails {
	private String errorMsg;
	private String statusCode;
	private LocalDateTime time;

	public ErrorDetails(String errorMsg, String statusCode, LocalDateTime time) {
		super();
		this.errorMsg = errorMsg;
		this.statusCode = statusCode;
		this.time = time;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "ErrorDetails [errorMsg=" + errorMsg + ", statusCode=" + statusCode + ", time=" + time + "]";
	}

}

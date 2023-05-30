package in.ineuron.globalException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	 @ExceptionHandler(value = PolicyNotFoundException.class)
	ResponseEntity<String> stockNotfound(PolicyNotFoundException se){
		return new ResponseEntity<String>(se.getMessage(),HttpStatus.BAD_REQUEST);
	}
}

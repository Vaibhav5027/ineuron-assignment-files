package in.ineuron.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProductExceptionController {

	
	@ExceptionHandler(ProductNotFound.class)
	ResponseEntity<ErrorDetails> notFound(ProductNotFound px){
		System.out.println(px);
	ErrorDetails er=new ErrorDetails(px.getMessage(),"404",LocalDateTime.now());
	return new ResponseEntity<ErrorDetails>(er,HttpStatus.BAD_REQUEST);
			
	}
	@ExceptionHandler(Exception.class)
	ResponseEntity<ErrorDetails> generalException(Exception ex){
	ErrorDetails er=new ErrorDetails(ex.getMessage(),"404",LocalDateTime.now());
	return new ResponseEntity<ErrorDetails>(er,HttpStatus.BAD_REQUEST);
			
	}
}

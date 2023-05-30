package in.ineuron.controller;

import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/api/greet")
public class CircuiteController {

	
	@GetMapping("/name/{name}")
	@HystrixCommand(fallbackMethod = "showFallBackMethod")
	ResponseEntity<String> getMeg(@PathVariable String name){
		if(new Random().nextInt(100)>=50)
			throw new RuntimeException("Number greather than 50");
	return new ResponseEntity<String>("Hi :"+name,HttpStatus.OK);
}
	
	ResponseEntity<String> showFallBackMethod(){
	
		return new ResponseEntity<String>("aSuvidha ke liye khed hai ||",HttpStatus.OK);
	}
}
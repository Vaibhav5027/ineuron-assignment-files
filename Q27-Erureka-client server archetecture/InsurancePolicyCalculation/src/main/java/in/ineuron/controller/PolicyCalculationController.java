package in.ineuron.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.service.PriceCalculation;

@RestController
@RequestMapping("policy")
public class PolicyCalculationController {
	@Autowired
	private PriceCalculation service;
	@GetMapping("calculate/{company}/{year}/{quantity}")
     ResponseEntity<String> calculateTotalCost(@PathVariable String company,@PathVariable Integer year,@PathVariable Integer quantity){
      Double price = service.calculateTotalPolicyPrice(company, year, quantity);
		
		return new ResponseEntity<String>("Total Cost"+price,HttpStatus.OK);
}
	
}

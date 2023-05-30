package in.ineuron.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.service.IPolicyService;

@RestController
@RequestMapping("api/policy")
public class PolicyController {

	@Autowired
	private IPolicyService service;

	@GetMapping("company/{companyName}")
	ResponseEntity<Double> getPolicyPrice(@PathVariable String companyName) {

		Double price = service.getPolicyPrice(companyName);

		return new ResponseEntity<Double>(price, HttpStatus.OK);

	}
}

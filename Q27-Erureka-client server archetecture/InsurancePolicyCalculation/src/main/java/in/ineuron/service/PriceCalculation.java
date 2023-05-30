package in.ineuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import in.ineuron.client.PolicyClient;

@Service
public class PriceCalculation {
 @Autowired
 private PolicyClient client;
  private Double totalPrice=null;
   public Double calculateTotalPolicyPrice(String company,int year,int quantity) {
	    ResponseEntity<Double> policyPrice = client.invokePolicyDetails(company);
	    Double price  = policyPrice.getBody();
	    totalPrice= price * year *quantity;
	   return totalPrice;
   }
}

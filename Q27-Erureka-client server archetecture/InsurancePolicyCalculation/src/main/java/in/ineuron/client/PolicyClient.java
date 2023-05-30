package in.ineuron.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("Insurance-Policy-Details")
public interface PolicyClient {

	@GetMapping("api/policy/company/{companyName}")
	ResponseEntity<Double> invokePolicyDetails(@PathVariable String companyName);
}

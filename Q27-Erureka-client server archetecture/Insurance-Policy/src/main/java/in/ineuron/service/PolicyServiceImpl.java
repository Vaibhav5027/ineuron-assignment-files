package in.ineuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.entity.InsurancePolicy;
import in.ineuron.globalException.PolicyNotFoundException;
import in.ineuron.repo.InsuranceRepo;

@Service
public class PolicyServiceImpl implements IPolicyService {
	@Autowired
private InsuranceRepo repo;
	@Override
	public double getPolicyPrice(String company) {
		  InsurancePolicy policy = repo.findByCompany(company);
		  if(policy==null) {
			 throw new PolicyNotFoundException("no policy by this company"); 
		  }
		  else
			  return policy.getPolicyPrice();
	}

}

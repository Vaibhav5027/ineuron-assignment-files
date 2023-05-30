package in.ineuron.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ineuron.entity.InsurancePolicy;

public interface InsuranceRepo extends JpaRepository<InsurancePolicy, Integer> {
	InsurancePolicy findByCompany(String company);
}

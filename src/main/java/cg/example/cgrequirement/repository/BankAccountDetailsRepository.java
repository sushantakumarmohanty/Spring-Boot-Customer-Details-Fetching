package cg.example.cgrequirement.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import cg.example.cgrequirement.model.BankDetails;

public interface BankAccountDetailsRepository extends JpaRepository<BankDetails, Integer> {
//custom query for JPA 
	BankDetails findByCustomerId(int customerId);

}

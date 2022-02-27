package cg.example.cgrequirement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cg.example.cgrequirement.model.BankDetails;
import cg.example.cgrequirement.repository.BankAccountDetailsRepository;
import cg.example.cgrequirement.service.interfaces.BankAccountServiceInterface;

@Service
public class BankAccountDetailsServices implements BankAccountServiceInterface {
	@Autowired
	private BankAccountDetailsRepository bankAccountDetailsRepository;

	@Override
	public BankDetails getCustomerDetailsById(int customerId) {
		return bankAccountDetailsRepository.findByCustomerId(customerId);
	}

}

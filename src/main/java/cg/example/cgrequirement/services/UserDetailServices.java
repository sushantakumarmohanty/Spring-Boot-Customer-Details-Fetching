package cg.example.cgrequirement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cg.example.cgrequirement.model.BankDetails;
import cg.example.cgrequirement.model.UserAccountDetails;
import cg.example.cgrequirement.model.UserDetails;
import cg.example.cgrequirement.repository.UserDetailsRepository;
import cg.example.cgrequirement.service.interfaces.BankAccountServiceInterface;
import cg.example.cgrequirement.service.interfaces.UserDetailsInterface;

@Service
public class UserDetailServices implements UserDetailsInterface {

	@Autowired
	private UserDetailsRepository userDetailsRepository;
	@Autowired
	private BankAccountServiceInterface bankAccountServiceInterface;
	
	@Override
	public List<UserDetails> getUserDetails() {
		return userDetailsRepository.findAll();
	}
	@Override
	public UserDetails getUserDetailsByCustomerId(int customerId) {
		return userDetailsRepository.findByCustomerId(customerId);
	}
	@Override
	public UserDetails getUserAndAccountDetailsByCustomerId(int customerId) {
	
		return userAndAccountDetailsByCustomerId(customerId) ;
	}
	
	private UserDetails userAndAccountDetailsByCustomerId(int customerId) {
		System.out.println("customerId------>>>"+ customerId);                                                                                                                                      
		BankDetails bd= bankAccountServiceInterface.getCustomerDetailsById(customerId);
		UserDetails ud=getUserDetailsByCustomerId(customerId);
		System.out.println("sushant bd=="+bd);
		System.out.println("sushant ud=="+ud);              
//		UserAccountDetails uad=new UserAccountDetails();
		ud.setBankDetails(bd);
//		uad.setBd(bd);
//		uad.setUd(ud);
//		System.out.println("sushant==uad" +uad);
		return ud;
	}
}

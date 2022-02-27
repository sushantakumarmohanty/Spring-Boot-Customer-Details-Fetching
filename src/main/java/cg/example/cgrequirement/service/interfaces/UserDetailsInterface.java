package cg.example.cgrequirement.service.interfaces;
import java.util.List;

import cg.example.cgrequirement.model.UserAccountDetails;
import cg.example.cgrequirement.model.UserDetails;

public interface UserDetailsInterface {
	
	public List<UserDetails> getUserDetails();
	public UserDetails getUserDetailsByCustomerId(int customerId);
	public UserDetails getUserAndAccountDetailsByCustomerId(int customerId);

}

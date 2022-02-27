package cg.example.cgrequirement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import cg.example.cgrequirement.model.UserAccountDetails;
import cg.example.cgrequirement.model.UserDetails;
import cg.example.cgrequirement.services.UserDetailServices;

@RestController
public class UserDetailsController {

	@Autowired
	UserDetailServices userDetailServices;

	@GetMapping("/api/users")
	public ResponseEntity<List<UserDetails>> getUserDetails() {
		List<UserDetails> customerDetails = null;
		try {
			customerDetails = userDetailServices.getUserDetails();
		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<List<UserDetails>>(customerDetails, HttpStatus.OK);
	}

	// TODO  handle bad request status code
	@GetMapping("/api/users/{CUSTOMER_ID}")
	public ResponseEntity<UserDetails> getUserDetailsByCustomerId(@PathVariable("CUSTOMER_ID") int id) {
		UserDetails customerDetailsData = null;
		try {
			customerDetailsData = userDetailServices.getUserDetailsByCustomerId(id);
		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<UserDetails>(customerDetailsData, HttpStatus.OK);
	}
	// TODO  handle bad request status code
		@GetMapping("/api/users/account/{CUSTOMER_ID}")
		public ResponseEntity<UserDetails> getUserAndAccountDetailsByCustomerId(@PathVariable("CUSTOMER_ID") int id) {
			UserDetails customerDetailsData = null;
			try {
				customerDetailsData = userDetailServices.getUserAndAccountDetailsByCustomerId(id);
				System.out.println("customerDetailsData====="+customerDetailsData);
			} catch (Exception ex) {
				ex.getMessage();
			}
			return new ResponseEntity<UserDetails>(customerDetailsData, HttpStatus.OK);
		}
	
}

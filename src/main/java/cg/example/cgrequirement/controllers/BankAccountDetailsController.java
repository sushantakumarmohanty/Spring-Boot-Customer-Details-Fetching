package cg.example.cgrequirement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import cg.example.cgrequirement.model.BankDetails;
import cg.example.cgrequirement.services.BankAccountDetailsServices;

@RestController
public class BankAccountDetailsController {
	@Autowired
	BankAccountDetailsServices bankAccountDetailsServices;

	@GetMapping("/api/userDetails/{CUSTOMER_ID}")
	public ResponseEntity<BankDetails> getCustomerDetailsById(@PathVariable("CUSTOMER_ID") int id) {
		BankDetails customerDetailsData = null;
		try {
			customerDetailsData = bankAccountDetailsServices.getCustomerDetailsById(id);
		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<BankDetails>(customerDetailsData, HttpStatus.OK);
	}
}
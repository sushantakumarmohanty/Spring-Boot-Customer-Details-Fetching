package cg.example.cgrequirement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "BANK_DETAILS")
public class BankDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BANK_ID")
	private int bankId;
	@Column(name = "CUSTOMER_ID")
	private int customerId;
	@Column(name = "ACCOUNT_NUMBER")
	private String AccountNumber;

	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "BankDetails [bankId=" + bankId + ", customerId=" + customerId + ", AccountNumber=" + AccountNumber
				+ "]";
	}

}

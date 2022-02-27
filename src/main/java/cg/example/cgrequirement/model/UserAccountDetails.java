package cg.example.cgrequirement.model;

import org.springframework.stereotype.Component;

@Component
public class UserAccountDetails {
	private UserDetails ud;
	private BankDetails bd;
	
	public void setUd(UserDetails ud) {
		this.ud = ud;
	}
	public void setBd(BankDetails bd) {
		this.bd = bd;
	}
	@Override
	public String toString() {
		return "UserAccountDetails [ud=" + ud + ", bd=" + bd + "]";
	}	
}

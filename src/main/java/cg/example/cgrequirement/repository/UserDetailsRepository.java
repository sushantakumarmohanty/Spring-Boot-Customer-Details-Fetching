package cg.example.cgrequirement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cg.example.cgrequirement.model.UserDetails;

public interface UserDetailsRepository  extends JpaRepository<UserDetails, Integer>{
	//custom query for JPA
	UserDetails findByCustomerId(int customerId);

}

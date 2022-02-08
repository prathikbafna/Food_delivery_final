package com.learning.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.dto.Register;

@Repository
public interface UserRepository extends JpaRepository<Register, String> {

	//write the custom jpa method // we will not write any definition just only signature
	//its pre-defined in jpa
	//Boolean existsByEmail(String email);
	//Boolean existsByContactNumber(BigDecimal contactNumber);
	Boolean existsByEmailAndContactNumber(String email,BigInteger contactNumber);
	Boolean existsByEmail(String email);
	
}

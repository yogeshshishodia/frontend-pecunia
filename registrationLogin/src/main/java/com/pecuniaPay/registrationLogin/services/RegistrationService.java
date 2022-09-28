package com.pecuniaPay.registrationLogin.services;

import java.util.Optional;

import com.pecuniaPay.registrationLogin.entities.Customer;
import com.pecuniaPay.registrationLogin.entities.Registration;
import com.pecuniaPay.registrationLogin.entities.User;
import com.pecuniaPay.registrationLogin.exceptions.RegistrationClassNotFound;

public interface RegistrationService {
	public Customer saveNewUser(User userDetails);
	
	public Optional<Registration> getUserDetailsById(Long id) throws RegistrationClassNotFound;
}

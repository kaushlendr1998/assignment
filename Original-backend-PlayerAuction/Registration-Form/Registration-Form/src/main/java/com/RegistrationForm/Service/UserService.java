package com.RegistrationForm.Service;

import com.RegistrationForm.Entity.User;
import com.RegistrationForm.Repo.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository uRepo;
	
	
	public User saveallDeatils(User user) {
		return uRepo.save(user);
	}
	
	public ResponseEntity<?> ValidateUser(User Details){
		User user = uRepo.findByUserName(Details.getUserName());
		if(user.getUserPassword().equals(Details.getUserPassword())) {
			return ResponseEntity.ok(user);
		}
		return (ResponseEntity<?>) ResponseEntity.internalServerError();
	}
	
}

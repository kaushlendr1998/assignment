package com.RegistrationForm.Controller;

import com.RegistrationForm.Entity.User;
import com.RegistrationForm.Service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/regn")
public class UserController {

	@Autowired
	private UserService uSerive;
	
	@PostMapping("/add")
	public User saveallDeatils(@RequestBody User user) {
		return uSerive.saveallDeatils(user);
	}
	
	@PostMapping("/validate")
	public ResponseEntity<?> ValidateUser(@RequestBody User Details){
		return uSerive.ValidateUser(Details);
	}
}

package com.RegistrationForm.Repo;

import com.RegistrationForm.Entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

	User save(UserRepository userRepo);
	User findByUserName(String userName);
}

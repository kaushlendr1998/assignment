package com.RegistrationForm.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int userId;
	private String userName;
	private int userAge;
	private String UserGender;
	private String userHobbies;
	private String userPassword;
	
	public User() {
		super();
	}
	
	public User(int userId, String userName, int userAge, String userGender, String userHobbies, String userPassword) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAge = userAge;
		this.UserGender = userGender;
		this.userHobbies = userHobbies;
		this.userPassword = userPassword;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUserGender() {
		return UserGender;
	}
	public void setUserGender(String userGender) {
		UserGender = userGender;
	}
	public String getUserHobbies() {
		return userHobbies;
	}
	public void setUserHobbies(String userHobbies) {
		this.userHobbies = userHobbies;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	
	
	
	
}

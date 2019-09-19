package com.restaurant.Restaurant.Service;

import java.util.List;
import java.util.Optional;

import com.restaurant.Restaurant.Model.Users;


public interface UsersService {

	
	Users findUserByEmail(String email);

	Users register(Users user);
	
	/*
	 * public List<Users> getUser(); public void createUser(Users user); public
	 * List<Users> findById(String emailId); public Users update(Users currentUser,
	 * int user_id); public void deleteUserById(int id); public Users
	 * updatePartially(Users currentUser, int id);
	 */
	 

}

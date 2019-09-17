package com.restaurant.Restaurant.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.restaurant.Restaurant.Model.Users;

@Service
public interface UsersService {

	
	/*
	 * public void createUser(Users user); public List<Users> getUser(); public
	 * Optional<Users> findById(long id); public Users update(Users user, long l);
	 * public void deleteUserById(long id); public Users updatePartially(Users user,
	 * long id);
	 */
	
	
	
	  public List<Users> getUser(); public void createUser(Users user); public
	  Users findById(int id); public Users update(Users currentUser, int user_id);
	  public void deleteUserById(int id); public Users updatePartially(Users
	  currentUser, int id);
	 

}

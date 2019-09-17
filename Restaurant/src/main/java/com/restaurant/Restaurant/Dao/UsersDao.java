package com.restaurant.Restaurant.Dao;

import java.util.List;

import com.restaurant.Restaurant.Model.Users;

public interface UsersDao {
	
	public List<Users> getUser();

	public void createUser(Users user);

	public Users findById(int id);

	public Users update(Users currentUser, int user_id);

	public void deleteUserById(int id);

	public Users updatePartially(Users currentUser, int id);
}

package com.restaurant.Restaurant.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restaurant.Restaurant.Dao.UsersDao;
import com.restaurant.Restaurant.Model.Users;
import com.restaurant.Restaurant.Service.UsersService;

@Service
@Transactional
public class UserServiceImpl implements UsersService{

	@Autowired
	private UsersDao usersDao;
	
	@Override
	public List<Users> getUser() {
		return usersDao.getUser();
	}

	@Override
	public void createUser(Users user) {
		usersDao.createUser(user);
		
	}

	@Override
	public Users findById(int id) {
		return usersDao.findById(id);
	}

	@Override
	public Users update(Users currentUser, int user_id) {
		return usersDao.update(currentUser,user_id);
		
	}

	@Override
	public void deleteUserById(int id) {
		usersDao.deleteUserById(id);		
	}

	@Override
	public Users updatePartially(Users currentUser, int id) {
		return usersDao.updatePartially(currentUser,id);
	}

}

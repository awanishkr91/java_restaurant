package com.restaurant.Restaurant.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restaurant.Restaurant.Model.Users;
import com.restaurant.Restaurant.Repository.UsersRepository;
import com.restaurant.Restaurant.Service.UsersService;

@Service("usersService")
@Transactional
public class UserServiceImpl implements UsersService{

	@Autowired
	private UsersRepository usersRepository;
	
	@Override
	public Users findUserByEmail(String email) {
		return usersRepository.findUserByEmail(email);
	}

	@Override
	public Users register(Users user) {
		
		return usersRepository.save(user);
	}
	 

}

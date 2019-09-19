package com.restaurant.Restaurant.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restaurant.Restaurant.Model.Users;

@Repository("usersRepository")
public interface UsersRepository extends JpaRepository<Users, Long>{

	Users findUserByEmail(String email);
	
}

package com.restaurant.Restaurant.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.Restaurant.Model.FoodModel;
import com.restaurant.Restaurant.Repository.FoodRepository;
import com.restaurant.Restaurant.Service.FoodService;

@Service("foodService")
public class FoodServiceImpl implements FoodService{

	@Autowired
	FoodRepository foodRepository;
	
	@Override
	public FoodModel add(FoodModel food) {
		
		return foodRepository.save(food);
	}

}

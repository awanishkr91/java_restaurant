package com.restaurant.Restaurant.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.Restaurant.Model.FoodModel;

public interface FoodRepository extends JpaRepository<FoodModel, Long>{

}

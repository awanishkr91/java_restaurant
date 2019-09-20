package com.restaurant.Restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.Restaurant.Model.FoodModel;
import com.restaurant.Restaurant.Service.FoodService;


@RestController
@RequestMapping(value ="/product")
@CrossOrigin(origins = "http://localhost:4200")

public class Food {

	@Autowired
	private FoodService foodService;
	
	@GetMapping(value="/get")
	public ResponseEntity<String> getAllProducts(){
		
		System.out.println("I am Ok");
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	
	@PostMapping(value="/add")
	public ResponseEntity<String> addProduct(@RequestBody FoodModel food){
		
		foodService.add(food);
		
		return new ResponseEntity<String>(HttpStatus.OK);
	}
}

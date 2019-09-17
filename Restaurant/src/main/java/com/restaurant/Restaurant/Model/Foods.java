package com.restaurant.Restaurant.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="FOODS")

public class Foods implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int foodId;
	
	@Column(name="FOOD_NAME")
	private String name;
	
	@Column(name="FOOD_DESCRIPTION")
	private String foodDes;
	
	@Column(name="PRICE")
	private long price;
	
	@Column(name="FOOD_IMAGE")
	private String foodImg;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="foods")
	private Foods foods;
	
	public int getFoodId() {
		return foodId;
	}

	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFoodDes() {
		return foodDes;
	}

	public void setFoodDes(String foodDes) {
		this.foodDes = foodDes;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getFoodImg() {
		return foodImg;
	}

	public void setFoodImg(String foodImg) {
		this.foodImg = foodImg;
	}

	public Foods getFoods() {
		return foods;
	}

	public void setFoods(Foods foods) {
		this.foods = foods;
	}

	
	
}

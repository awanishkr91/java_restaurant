package com.restaurant.Restaurant.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Food")
public class FoodModel {
	
	@Id
	@GeneratedValue
	private int Id;
	
	@Column(name="FOOD_NAME",nullable = true)
	private String foodName;
	
	@Column(name="FOOD-CAT",nullable = true)
	private String prodCat;
	
	@Column(name="FOOD-QTY",nullable = true)
	private int prodQty;
	
	@Column(name="FOOD_DESCRIPTION",nullable = true)
	private String foodDes;
	
	@Column(name="PRICE,nullable = true")
	private long foodPrice;
	
	public int getFoodId() {
		return Id;
	}

	public void setFoodId(int foodId) {
		this.Id = foodId;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getProdCat() {
		return prodCat;
	}

	public void setProdCat(String prodCat) {
		this.prodCat = prodCat;
	}

	public int getProdQty() {
		return prodQty;
	}

	public void setProdQty(int prodQty) {
		this.prodQty = prodQty;
	}

	public String getFoodDes() {
		return foodDes;
	}

	public void setFoodDes(String foodDes) {
		this.foodDes = foodDes;
	}

	public long getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(long foodPrice) {
		this.foodPrice = foodPrice;
	}

	
	
	

}

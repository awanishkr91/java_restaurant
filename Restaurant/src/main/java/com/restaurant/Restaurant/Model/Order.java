package com.restaurant.Restaurant.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;



@Entity
@Table(name="ORDRE")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	
	@Column(name="QUANTITY")
	private String quantity;
	
	@Column(name="ORDER_DATE")
	private String orderDate;
	

	/*
	 * @OneToMany
	 * 
	 * @JoinTable(name = "Customer_Order",joinColumns
	 * = @JoinColumn(name="orderId"),inverseJoinColumns
	 * = @JoinColumn(name="cust_id")) private Set<Customer> customers;
	 * 
	 * @OneToMany
	 * 
	 * @JoinTable(name =
	 * "FOOD_ORDER",joinColumns=@JoinColumn(name="orderId"),inverseJoinColumns
	 * =@JoinColumn(name="foodId")) private Set<Foods> foods;
	 */
	
	/*
	 * public Set<Customer> getCustomers() { return customers; }
	 * 
	 * public void setCustomers(Set<Customer> customers) { this.customers =
	 * customers; }
	 */

	/*
	 * public Set<Foods> getFoods() { return foods; }
	 * 
	 * public void setFoods(Set<Foods> foods) { this.foods = foods; }
	 */

	
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

}

package com.restaurant.Restaurant.Model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="role")
public class Role implements Serializable{

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int role_id;
    
	
	/*
	 * @OneToMany
	 * 
	 * @JoinTable(name
	 * ="user_role",joinColumns=@JoinColumn(name="role_id"),inverseJoinColumns
	 * =@JoinColumn(name="user_id")) private Set<Users> userRole;
	 */

	  @Column(name = "ROLENAME")
      private String role;
	/*
	 * public Set<Users> getUserRole() { return userRole; } public void
	 * setUserRole(Set<Users> userRole) { this.userRole = userRole; }
	 */
	 
	public String getRole() {
		return role;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}

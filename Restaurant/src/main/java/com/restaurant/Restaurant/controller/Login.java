package com.restaurant.Restaurant.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.restaurant.Restaurant.Model.Users;
import com.restaurant.Restaurant.Service.UsersService;

@RestController
@RequestMapping(value={"/user"})
@CrossOrigin(origins = "http://localhost:4200")
public class Login {
	
	@Autowired
    private UsersService userService;
	
	@GetMapping(value="/get", headers="Accept=application/json")
	public List<Users> getUsers() {
		System.out.println("calling---");
		List<Users> users = userService.getUser();
        return users;
	}
	
	
	  @PostMapping(value="/create", consumes = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Void> createUser(@RequestBody Users user, UriComponentsBuilder ucBuilder){
	        System.out.println("Creating User "+user.getUser_id());
	        userService.createUser(user);
	        HttpHeaders headers = new HttpHeaders();
	        headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(user.getUser_id()).toUri());
	        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	    }
	   
	  @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Users> getUserById(@PathVariable("id") int id) {
	        System.out.println("Fetching User with id " + id);
	        Users user = userService.findById(id);
	        if (user == null) {
	            return new ResponseEntity<Users>(HttpStatus.NOT_FOUND);
	        }
	        return new ResponseEntity<Users>(user,HttpStatus.OK);
	    }
	  
	  @PutMapping(value="/update", headers="Accept=application/json")
	    public ResponseEntity<String> updateUser(@RequestBody Users currentUser)
	    {
	        System.out.println("sd");
	        Users user = userService.findById(currentUser.getUser_id());
	        if (user==null) {
	            return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
	        }
	        userService.update(currentUser, currentUser.getUser_id());
	        return new ResponseEntity<String>(HttpStatus.OK);
	    }
	  
	  @DeleteMapping(value="/{id}", headers ="Accept=application/json")
	    public ResponseEntity<Login> deleteUser(@PathVariable("id") int id){
		  Users user = userService.findById(id);
	        if (user == null) {
	            return new ResponseEntity<Login>(HttpStatus.NOT_FOUND);
	        }
	        userService.deleteUserById(id);
	        return new ResponseEntity<Login>(HttpStatus.NO_CONTENT);
	    }
	  
	  @PatchMapping(value="/{id}", headers="Accept=application/json")
	    public ResponseEntity<Users> updateUserPartially(@PathVariable("id") int id, @RequestBody Users currentUser){
		  Users user = userService.findById(id);
	        if(user ==null){
	            return new ResponseEntity<Users>(HttpStatus.NOT_FOUND);
	        }
	        Users usr = userService.updatePartially(currentUser, id);
	        return new ResponseEntity<Users>(usr, HttpStatus.OK);
	    }
}

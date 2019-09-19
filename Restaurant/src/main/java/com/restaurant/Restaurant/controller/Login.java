package com.restaurant.Restaurant.controller;

import java.util.List;
import java.util.Optional;

import org.json.JSONObject;
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
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;

import com.restaurant.Restaurant.Model.Users;
import com.restaurant.Restaurant.Repository.UsersRepository;
import com.restaurant.Restaurant.Service.UsersService;

@RestController
@RequestMapping(value = { "/user" })
@CrossOrigin(origins = "http://localhost:4200")
public class Login {

	
	@Autowired
	private UsersService userService;

	
	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Users getUserById(@PathVariable("id") String emailId) 
	{
		Users user = userService.findUserByEmail(emailId);
		ModelAndView model =new ModelAndView();
		JSONObject person = new JSONObject();
		return user;
	}
	
	@PostMapping(value="/registration")
	public ResponseEntity<String> registerUser(@RequestBody Users user) {
		System.out.println("its calling...");
		 Users usr = userService.register(user);
		 
		 return new ResponseEntity<String>(HttpStatus.OK);
	}
	  
	/*
	 * @PutMapping(value="/update", headers="Accept=application/json") public
	 * ResponseEntity<String> updateUser(@RequestBody Users currentUser) {
	 * System.out.println("sd"); Options<Users> user =
	 * userService.findById(currentUser.getUser_id()); if (user==null) { return new
	 * ResponseEntity<String>(HttpStatus.NOT_FOUND); }
	 * userService.update(currentUser, currentUser.getUser_id()); return new
	 * ResponseEntity<String>(HttpStatus.OK); }
	 */
	  
	/*
	 * @DeleteMapping(value="/{id}", headers ="Accept=application/json") public
	 * ResponseEntity<Login> deleteUser(@PathVariable("id") int id) { List<Users>
	 * user = userService.findById(""); if (user == null) { return new
	 * ResponseEntity<Login>(HttpStatus.NOT_FOUND); }
	 * userService.deleteUserById(id); return new
	 * ResponseEntity<Login>(HttpStatus.NO_CONTENT); }
	 * 
	 * @PatchMapping(value="/{id}", headers="Accept=application/json") public
	 * ResponseEntity<Users> updateUserPartially(@PathVariable("id") int
	 * id, @RequestBody Users currentUser) { List<Users> user =
	 * userService.findById(""); if(user ==null) { return new
	 * ResponseEntity<Users>(HttpStatus.NOT_FOUND); } Users usr =
	 * userService.updatePartially(currentUser, id); return new
	 * ResponseEntity<Users>(usr, HttpStatus.OK); }
	 */
	 

}

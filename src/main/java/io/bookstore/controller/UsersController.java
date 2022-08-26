package io.bookstore.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import io.bookstore.dto.UsersDto;
import io.bookstore.service.UsersService;
import io.bookstore.utility.Response;

@RestController
public class UsersController {
	@Autowired
	private UsersService usersService;
	@GetMapping("/users")
	public ResponseEntity<Response> getAllUsers(){
		Response response = usersService.getAllUsers();
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}
	@PostMapping("/adduser")
	public ResponseEntity<Response> addUser(@Valid @RequestBody UsersDto usersDto){
		Response response = usersService.addUser(usersDto);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@PutMapping("/update/{userId}")
	public ResponseEntity<Response> updateUser(@RequestBody UsersDto usersDto, @PathVariable int userId) {
		Response response = usersService.updateUser(userId, usersDto);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	@DeleteMapping("/delete/{userId}")
	public ResponseEntity<Response> deleteUser(@PathVariable int userId) {
		Response response = usersService.deleteUser(userId);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}	
	

}

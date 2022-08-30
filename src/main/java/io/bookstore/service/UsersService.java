package io.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import io.bookstore.dto.UsersDto;
import io.bookstore.model.Books;
import io.bookstore.model.Users;
import io.bookstore.repository.BooksRepository;
import io.bookstore.repository.UsersRepository;
import io.bookstore.utility.Response;

@Service
public class UsersService {
	@Autowired
	private UsersRepository usersRepository;
	@Autowired
	private BooksRepository booksRepository;
	@Autowired
	private ModelMapper modelMapper;
	
	public Response getAllUsers() {
		return new Response("All Users", 200, usersRepository.findAll());
	}
	
	public Response addUser(UsersDto usersDto) {
		Users users = modelMapper.map(usersDto, Users.class);
		usersRepository.save(users);
		return new Response("new user added successfully", 200, users);
	}
	
	public Response updateUser(int userId, UsersDto usersDto) {
		Users users = modelMapper.map(usersDto, Users.class);
		usersRepository.save(users);
		return new Response("updated user successfully", 200, users);
	}
	
	public Response deleteUser(int userId) {
		return new Response("user deleted", 200, usersRepository.deleteById(userId));
	
	}
	

}

package io.bookstore.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.bookstore.repository.BooksRepository;
import io.bookstore.utility.Response;

@Service
public class BooksService {
	@Autowired
	private BooksRepository booksRepository;
	@Autowired
	private ModelMapper modelMapper;
	
	
	public Response getAllBooks() {
		return new Response("All books", 200, booksRepository.findAll());
	}
}

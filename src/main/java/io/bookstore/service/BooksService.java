package io.bookstore.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.bookstore.dto.BooksDto;
import io.bookstore.model.Books;
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
	
	public Response addBook(BooksDto booksDto) {
		Books books = modelMapper.map(booksDto, Books.class);
		booksRepository.save(books);
		return new Response("new book added successfully", 200, books);
	}
}

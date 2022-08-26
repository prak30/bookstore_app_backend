package io.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.bookstore.model.Books;
import io.bookstore.service.BooksService;
import io.bookstore.utility.Response;

@RestController
public class BooksController {
	@Autowired
	private BooksService booksService;
	@GetMapping("/books")
	public ResponseEntity<Response> getAllBooks(){
		Response response = booksService.getAllBooks();
		return new ResponseEntity<Response>(response,HttpStatus.OK);
	}

}

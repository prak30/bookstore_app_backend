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

import io.bookstore.dto.BooksDto;
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
	@PostMapping("/addbook")
	public ResponseEntity<Response> addBook(@Valid @RequestBody BooksDto booksDto){
		Response response = booksService.addBook(booksDto);
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}
	@PutMapping("/updatebook/{bookId}")
	public ResponseEntity<Response> updateBook(@RequestBody BooksDto booksDto, @PathVariable int bookId) {
		Response response = booksService.updateBook(bookId, booksDto);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	@DeleteMapping("/deletebook/{bookId}")
	public ResponseEntity<Response> deleteBook(@PathVariable int bookId) {
		Response response = booksService.deleteBook(bookId);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}	

}

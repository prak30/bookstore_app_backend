package io.bookstore.validation;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import io.bookstore.utility.Response;
import io.bookstore.utility.UsersException;

	@ControllerAdvice
	public class GlobalExceptionHandler  {
		@ExceptionHandler(value=UsersException.class)
		public ResponseEntity<Response> exceptionHandler(UsersException usersException){
			Response res = new Response(usersException.getMessage(), 400, null);
			return new ResponseEntity<>(res, HttpStatus.BAD_REQUEST);
		}
		
		
}

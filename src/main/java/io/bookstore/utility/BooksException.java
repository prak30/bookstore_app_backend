package io.bookstore.utility;

public class BooksException extends RuntimeException {
	String message;

	public BooksException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}

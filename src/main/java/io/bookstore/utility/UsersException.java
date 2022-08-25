package io.bookstore.utility;

public class UsersException extends RuntimeException {
	String message;

	public UsersException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}

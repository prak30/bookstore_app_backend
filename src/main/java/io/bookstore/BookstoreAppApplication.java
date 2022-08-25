package io.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookstoreAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreAppApplication.class, args);
		
		System.out.println("welcome to bookstore");
	}

}

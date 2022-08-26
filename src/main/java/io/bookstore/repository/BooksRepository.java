package io.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.bookstore.model.Books;

public interface BooksRepository extends JpaRepository<Books, Integer> {
	Books deleteById(int bookId);
}

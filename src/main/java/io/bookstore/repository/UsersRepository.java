package io.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.bookstore.model.Users;

public interface UsersRepository extends JpaRepository<Users,Integer>{
	Users deleteById(int userId);
}

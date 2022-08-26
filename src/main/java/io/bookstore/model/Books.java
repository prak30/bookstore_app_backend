package io.bookstore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Books {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bookId;
	private String bookTitle;
	private String bookAuthor;
	private String bookDescription;
}

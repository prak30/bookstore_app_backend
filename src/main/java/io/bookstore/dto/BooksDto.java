package io.bookstore.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class BooksDto {
	private String bookTitle;
	private String bookAuthor;
	private String bookDescription;
}

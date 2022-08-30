package io.bookstore.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class BooksDto {
	@NotBlank
	private String bookTitle;
	@NotBlank
	private String bookAuthor;
	@NotBlank
	private String bookDescription;
	private Integer price;
	private Integer quantity;

}

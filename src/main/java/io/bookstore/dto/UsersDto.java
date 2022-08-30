package io.bookstore.dto;

import java.util.LinkedList;
import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import io.bookstore.model.Books;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UsersDto {
	@NotBlank
	private String firstName;
	@NotBlank
	private String lastName;
	@Email
	@NotBlank
	private String email;
	@NotBlank
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$",message="Minimum eight characters, at least one uppercase letter, one lowercase letter, one number and one special character")
	private String password;
	
	private List<Books> cartBook = new LinkedList<>();
}

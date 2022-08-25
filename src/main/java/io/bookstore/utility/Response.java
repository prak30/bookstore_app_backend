package io.bookstore.utility;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Component
public class Response {
	private String responseMessage;
	private Integer responseStatus;
	private Object responseData;
	
}

package io.bookstore.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsersConfiguration {
	@Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}

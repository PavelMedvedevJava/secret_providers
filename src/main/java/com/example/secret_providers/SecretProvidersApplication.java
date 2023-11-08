package com.example.secret_providers;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.example.secret_providers"})
@MapperScan("com.example.secret.repository")
@SpringBootApplication
public class SecretProvidersApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecretProvidersApplication.class, args);
	}

}

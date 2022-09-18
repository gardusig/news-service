package br.com.authenticator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableAutoConfiguration
@Configuration
@ComponentScan(basePackages = "br.com.authenticator.*")
public class AuthenticatorApplication {
	public static void main(String[] args) {
		SpringApplication.run(AuthenticatorApplication.class, args);
	}
}
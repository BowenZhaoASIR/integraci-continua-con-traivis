package com.iesdoctorbalmis.balmisboardgames;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@RestController
public class BalmisBoardGamesApplication {
	
	@GetMapping("/hello")
	public String helloworld() {
		return "hello world";
	}
    public static void main(String[] args) {
        SpringApplication.run(BalmisBoardGamesApplication.class, args);
    }
}


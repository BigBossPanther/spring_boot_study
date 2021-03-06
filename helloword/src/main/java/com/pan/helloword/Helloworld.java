package com.pan.helloword;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class Helloworld {
	public static void main(String[] args) {
		SpringApplication.run(Helloworld.class, args);
	}
	
	@RequestMapping("/")
	public String helloWorld() {
		return "helloWorld";
	}
}

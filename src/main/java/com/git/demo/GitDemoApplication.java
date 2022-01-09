package com.git.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitDemoApplication {

	@GetMapping("/welcome")
	public String getWelcome(){
		return "Welcome GIT-Demo project";
	}

	@GetMapping("/welcome/{name}")
	public String getWelcomeName(@PathVariable String name){
		return "Welcome "+name;
	}

	public static void main(String[] args) {
		SpringApplication.run(GitDemoApplication.class, args);
	}

}

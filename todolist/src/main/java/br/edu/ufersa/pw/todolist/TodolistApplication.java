package br.edu.ufersa.pw.todolist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.edu.ufersa.pw.todolist.entity.User;
import br.edu.ufersa.pw.todolist.repositories.UserRepository;

@SpringBootApplication
public class TodolistApplication {
	@Autowired
	UserRepository userRepo;
	private static final Logger logger = LoggerFactory.getLogger(TodolistApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);
		logger.info("Start App");
	}
	
	@Bean
	CommandLineRunner runner() {
		return args ->{
//			User user = new User();
//			user.setEmail("riguinho@gmail.com");
//			user.setSenha("riguinho");
//			userRepo.save(user);
			
		};
	}
	
	

}

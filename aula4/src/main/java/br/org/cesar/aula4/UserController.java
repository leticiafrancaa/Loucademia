package br.org.cesar.aula4;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
	public class UserController{
		
	ArrayList<User> listaUsuarios = new ArrayList<User>();

		@GetMapping("/user")
		public User GetUser() {
			User temporario = new User("Leticia", "123456789999");
			return temporario;
		}
			
		@PostMapping("/user")
		public User cadastrarUser(@RequestBody User entity) {
			return entity;
		
		}
	}

package br.org.cesar.aula4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

	@GetMapping("/Welcome")
	public String getWelcome() {
		return "Bem vindo!";
	}
}

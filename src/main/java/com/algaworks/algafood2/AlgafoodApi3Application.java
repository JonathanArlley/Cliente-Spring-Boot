package com.algaworks.algafood2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//aqui diz que todas as classes desse package e os sub packages são 
//elegiveis para se tornar um componente gerenciado por spring
public class AlgafoodApi3Application {

	public static void main(String[] args) {
		SpringApplication.run(AlgafoodApi3Application.class, args);
	}

}

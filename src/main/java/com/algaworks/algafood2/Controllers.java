package com.algaworks.algafood2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.algaworks.algafood2.dl.modelo.Cliente;
import com.algaworks.algafood2.dl.service.AtivacaoCliente;

@Controller //aqui diz que essa é uma classe que vai receber requisições web
//o controller também um component, o controller é um meta anotação onde é anotada com component

public class Controllers {
	
	private AtivacaoCliente ativacaoCliente;
	
	
	public Controllers(AtivacaoCliente ativacaoCliente) {
		this.ativacaoCliente = ativacaoCliente;
		ativacaoCliente = ativacaoCliente;
		
		//System.out.println("MeuPrimeiroController: " + ativacaoCliente);
	}


	@GetMapping("/hello")//aqui diz o caminho para chegar na resposta
	@ResponseBody// diz que essa string vai sair como resposta
	public String hello() {
		Cliente joao = new Cliente("João", "joao@gmail.com", "83986443268");
		
		ativacaoCliente.ativar(joao);
		
		return "Hello!";
	}
	
}

package com.algaworks.algafood2.dl.service;

import com.algaworks.algafood2.dl.modelo.Cliente;

//Aqui vai ser o evento de ativação do cliente
public class ClienteAtivado {
	
	private Cliente cliente;

	public ClienteAtivado(Cliente cliente) {
		super();
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}
		
		
}

package com.algaworks.algafood2.dl.notificacao;

import com.algaworks.algafood2.dl.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}
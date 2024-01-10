package com.algaworks.algafood2.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.algaworks.algafood2.dl.service.ClienteAtivado;


@Component
public class EmissãoNotaFiscalService {

	@EventListener
	public void ClienteAtivadoLister(ClienteAtivado event) {
		System.out.println("Emitindo nota fiscal para cliente " + event.getCliente().getNome());
		
		
		//as vantagens disso é um baixo acoplamento e uma alta coesão
	}
}

package com.algaworks.algafood2.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.algaworks.algafood2.dl.notificacao.NivelUrgencia;
import com.algaworks.algafood2.dl.notificacao.Notificador;
import com.algaworks.algafood2.dl.notificacao.TipoNotificador;
import com.algaworks.algafood2.dl.service.ClienteAtivado;

@Component
//Essa classe vai servir para escutar o que vai passar no evento de ativação
public class NotificacaoService {
	
	@TipoNotificador(NivelUrgencia.SEM_URGENCIA)
	@Autowired
	private Notificador notificador;
	
	@EventListener
	public void ClienteAtivadoLister(ClienteAtivado event) {
		//System.out.println("Cliente " + event.getCliente().getNome() + " agora esá ativo");
		notificador.notificar(event.getCliente(), "Seu cadastro no sistema está ativo");
		
	}
	//podemos ter mais eventos nessa classe e mais metodos escutando outros eventos nessa classe
	
}

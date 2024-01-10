package com.algaworks.algafood2.dl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.algaworks.algafood2.dl.modelo.Cliente;
import com.algaworks.algafood2.dl.notificacao.NivelUrgencia;
import com.algaworks.algafood2.dl.notificacao.Notificador;
import com.algaworks.algafood2.dl.notificacao.TipoNotificador;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class AtivacaoCliente {
	
	@Autowired
	private ApplicationEventPublisher eventPublisher;

	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		//dizer para o cliente que ele está ativo neste momento//aqui diz que ele vai ser um evento e que vai 
		//ser melhor aclopado
		
		//Tiramos a obrigação de notificar dessa classe porém podemos ficar meio perdido
		//Podemos colocar novas funcionalidades sem ter que mexer na classe de notificação
		
		eventPublisher.publishEvent(new ClienteAtivado(cliente));
	}
}
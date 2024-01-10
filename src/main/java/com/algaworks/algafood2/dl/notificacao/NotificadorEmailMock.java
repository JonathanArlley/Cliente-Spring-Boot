package com.algaworks.algafood2.dl.notificacao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.algaworks.algafood2.dl.modelo.Cliente;

@Component //aqui diz que é um componente spring(um bean)
//@Primary//Serve para dar uma prioridade a esse bean quando existir mais de um bean desse tipo e usa isso pra desfazer
//a ambiguação

//@Qualifier("normal")//Serve para desambiguação e temos que colocar uma indentificação, serve para qualificar o nosso
//component 

@Profile("dev")
@TipoNotificador(NivelUrgencia.SEM_URGENCIA)
public class NotificadorEmailMock implements Notificador {
	
	 public NotificadorEmailMock() {
		System.out.println("NotificadorEmail MOCK");
	}
	
		@Override
		public void notificar (Cliente cliente, String mensagem) {
			
			System.out.printf("MOCK: Notificação seria enviada para %s através do e-mail %s: %s\n",
				cliente.getNome(), cliente.getEmail(), mensagem);
		}

} 

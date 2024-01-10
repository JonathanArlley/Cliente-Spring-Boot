package com.algaworks.algafood2.dl.notificacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.algaworks.algafood2.dl.modelo.Cliente;

@Component //aqui diz que é um componente spring(um bean)
//@Primary//Serve para dar uma prioridade a esse bean quando existir mais de um bean desse tipo e usa isso pra desfazer
//a ambiguação

//@Qualifier("normal")//Serve para desambiguação e temos que colocar uma indentificação, serve para qualificar o nosso
//Component

//@Profile("prod")//o componente notificdoremail vai ser registrad no container spring se apenas estivermos rodando em 
//ambiente de produção
@TipoNotificador(NivelUrgencia.SEM_URGENCIA)
public class NotificadorEmail implements Notificador {
	
		 /*public NotificadorEmail() {
			System.out.println("NotificadorEmail REAL");
		}*/
//se não tiver em ambiente de produção esse bean fica descohecido no container
	
		/*@Value("${notificador.email.host-servidor}")//Fazemos uma injeção do valor usando uma expression do spring
		private String host;
		
		@Value("${notificador.email.porta-servidor}")
		private Integer porta;
	*/
	@Autowired
	private NotificadorProperties properties;
	
		@Override
		public void notificar (Cliente cliente, String mensagem) {
			
			//System.out.println("Host: " + host);
			//System.out.println("Porta: " + porta);
			
			System.out.println("Host: " + properties.getHostServidor());
			
			System.out.printf("Notificamos %s através do e-mail %s: %s\n",
				cliente.getNome(), cliente.getEmail(), mensagem);
		}

} 

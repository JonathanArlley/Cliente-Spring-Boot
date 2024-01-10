package com.algaworks.algafood2.dl.notificacao;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier
@Retention(RetentionPolicy.RUNTIME)//diz quanto tempo que a anotação deve permanecer onde foi usada
//o RUNTIME diz que ela pode ser lida em tempo de execução
public @interface TipoNotificador {

	NivelUrgencia value();//value é o valor padrão assim podendo tirar do notificador desejado
	
	
}

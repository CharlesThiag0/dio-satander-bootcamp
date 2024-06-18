package edu.estudos.com.messeger.model;

import edu.estudos.com.messeger.service.ServiceMensageria;

public class MSN extends ServiceMensageria{
	
	@Override
	public void enviarMensagem() {
		this.validarConectadoInternet();
		System.out.println("Enviando mensagem pelo MSN");
		this.salvarHistoricoMensagem();
	}

	@Override
	public void receberMensagem() {
		this.validarConectadoInternet();
		System.out.println("Recebendo mensagem pelo MSN");
		this.salvarHistoricoMensagem();
	}
	
}

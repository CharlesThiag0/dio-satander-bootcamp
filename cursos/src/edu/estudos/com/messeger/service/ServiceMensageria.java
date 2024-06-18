package edu.estudos.com.messeger.service;

public abstract class ServiceMensageria {
	
	public abstract void enviarMensagem();
	
	public abstract void receberMensagem();
	
	protected void validarConectadoInternet() {
		System.out.println("Validando internet");
	}
	
	protected void salvarHistoricoMensagem() {
		System.out.println("Salvando historico");
	}
	
}

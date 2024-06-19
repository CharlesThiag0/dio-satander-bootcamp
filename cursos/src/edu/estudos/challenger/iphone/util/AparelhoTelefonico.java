package edu.estudos.challenger.iphone.util;

public interface AparelhoTelefonico {
	default void ligar(String numero) {
		System.out.println("Ligando para: " + numero);
	}
	
	default void atender() {
		System.out.println("Atendendo");
	}

	default void iniciarCorreioVoz() {
		System.out.println("Iniciando Correio de voz");
	}
}

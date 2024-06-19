package edu.estudos.challenger.iphone.util;

public interface AparelhoTelefonico {
	default void ligar() {
		System.out.println("Ligando");
	}
	
	default void atender() {
		System.out.println("Atendendo");
	}

	default void iniciarCommioVoz() {
		System.out.println("Iniciando Commio de voz");
	}
}

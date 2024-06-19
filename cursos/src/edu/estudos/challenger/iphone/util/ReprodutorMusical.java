package edu.estudos.challenger.iphone.util;

public interface ReprodutorMusical {
	default void selecionarMusica() {
		System.out.println("Selecionando musica");
	}
	
	default void pausar() {
		System.out.println("Musica pausada");
	}
	
	default void tocar() {
		System.out.println("Tocando musica");
	}
}

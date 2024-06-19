package edu.estudos.challenger.iphone.util;

public interface ReprodutorMusical {
	default void selecionarMusica(String musica) {
		System.out.println("Selecionando musica: " + musica);
	}
	
	default void pausar() {
		System.out.println("Musica pausada");
	}
	
	default void tocar() {
		System.out.println("Tocando musica");
	}
}

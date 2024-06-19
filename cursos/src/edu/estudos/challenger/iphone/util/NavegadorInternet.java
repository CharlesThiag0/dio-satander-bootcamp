package edu.estudos.challenger.iphone.util;

public interface NavegadorInternet {
	
	 default void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");
	}
	 
	 default void exibirPagina() {
		 System.out.println("Exibindo pagina");
	 }
	 
	 default void atualizarPagina() {
		 System.out.println("Atualizando pagina");
	 }
}

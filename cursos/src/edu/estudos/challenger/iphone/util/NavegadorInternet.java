package edu.estudos.challenger.iphone.util;

public interface NavegadorInternet {
	
	 default void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");
	}
	 
	 default void exibirPagina(String url) {
		 System.out.println("Exibindo pagina: " + url);
	 }
	 
	 default void atualizarPagina() {
		 System.out.println("Atualizando pagina");
	 }
}

package edu.estudos.challenger.iphone.app;

import edu.estudos.challenger.iphone.Iphone;

public class AppIphone {
	public static void main(String[] args) {
		Iphone  iphone = new Iphone();
		
		System.out.println("---------------------");
		
		System.out.println("Navegador:");
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		iphone.exibirPagina(null);
		
		System.out.println("---------------------");
		
		System.out.println("Telefone:");
		iphone.atender();
		iphone.ligar(null);
		iphone.iniciarCorreioVoz();
		
		System.out.println("---------------------");
		
		System.out.println("Musica:");
		iphone.selecionarMusica(null);
		iphone.tocar();
		iphone.pausar();
	}
}

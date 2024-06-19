package edu.estudos.challenger.iphone.app;

import edu.estudos.challenger.iphone.Iphone;

public class AppIphone {
	public static void main(String[] args) {
		Iphone  iphone = new Iphone();
		
		System.out.println("---------------------");
		
		System.out.println("Navegador:");
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		iphone.exibirPagina();
		
		System.out.println("---------------------");
		
		System.out.println("Telefone:");
		iphone.atender();
		iphone.ligar();
		iphone.iniciarCommioVoz();
		
		System.out.println("---------------------");
		
		System.out.println("Musica:");
		iphone.selecionarMusica();
		iphone.tocar();
		iphone.pausar();
	}
}

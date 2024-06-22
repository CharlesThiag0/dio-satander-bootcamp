package edu.estudos.collections.dicionario;

public class Main {
	public static void main(String[] args) {
		Dicionario dicionario = new Dicionario();
		
		dicionario.add("palvra", " significa o ato de descrever ou relatar algo detalhadamente");
		dicionario.add("palvr", " significa o ato de descrever ou relatar algo ");
		dicionario.add("palv", " significa o ato de descrever ou relatar");
		dicionario.add("pal", " significa o ato de descrever ou");
		dicionario.add("pa", " significa o ato de descrever");
		dicionario.exibir();
		
		dicionario.remove("pal");
		dicionario.exibir();
		
		System.out.println(dicionario.pesquisa("palvra"));
		
		
		
		
	}
}

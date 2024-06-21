package edu.estudos.collections.palavras;

public class Main {
	public static void main(String[] args) {
		ConjuntoPalavrasUnicas palavras = new ConjuntoPalavrasUnicas();

		palavras.adicionarPalavra("Teste");
		palavras.adicionarPalavra("Teste");

		palavras.adicionarPalavra("charles");

		palavras.adicionarPalavra("Thiago");
		palavras.adicionarPalavra("thiago");

		palavras.exibirPalavrasUnicas();

		System.out.println("------------------------------");

		palavras.removerPalavra("Teste");
		palavras.exibirPalavrasUnicas();
	}
}

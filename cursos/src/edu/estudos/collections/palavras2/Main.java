package edu.estudos.collections.palavras2;

public class Main {
	public static void main(String[] args) {
		ContagemPalavras contagemLinguagens = new ContagemPalavras();

	    // Adiciona linguagens e suas contagens
	    contagemLinguagens.add("Python", 2);
	    contagemLinguagens.add("Java", 8);
	    contagemLinguagens.add("JavaScript", 1);
	    contagemLinguagens.add("C#", 6);

	    // Exibe a contagem total de linguagens
	    System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");

	    // Encontra e exibe a linguagem mais frequente
	    String linguagemMaisFrequente = contagemLinguagens.palavrasMaisFrequente();
	    System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
	}
}

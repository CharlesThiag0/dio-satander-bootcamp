package edu.estudos.collections.palavras2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ContagemPalavras {
	private Map<String, Integer> palavras;
	
	public ContagemPalavras() {
		this.palavras = new HashMap<String, Integer>();
	}

//	adicionarPalavra(String palavra, Integer contagem): Adiciona uma palavra à contagem.
	public void add(String palavra, int contagem) {
		palavras.put(palavra, contagem);
	}
	
//	removerPalavra(String palavra): Remove uma palavra da contagem, se estiver presente.
	public void removerPalavra(String palavra) {
		palavras.remove(palavra);
	}
	
//	exibirContagemPalavras(): Exibe todas as palavras e suas respectivas contagens.
	public int exibirContagemPalavras(){
		int contagemTotal = 0;
		
		for(int contagem : palavras.values()) {
			contagemTotal += contagem;
		}
		
		return contagemTotal;
	}
	
//	encontrarPalavraMaisFrequente(): Encontra a palavra mais frequente no texto e retorna a palavra e sua contagem.
	public String palavrasMaisFrequente() {
		int maiorContagem = 0;
		String palavra = "";
		
		for(Entry<String, Integer> p : palavras.entrySet()) {
			if(p.getValue() > maiorContagem) {
				
				maiorContagem = p.getValue();
				palavra = p.getKey();
			}
		}
		return palavra;
	}
	
}

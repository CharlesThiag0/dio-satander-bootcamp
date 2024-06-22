package edu.estudos.collections.livraria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class LivrariaOnline {
	private Map<String, Livro> livros;

	public LivrariaOnline() {
		this.livros = new HashMap<String, Livro>();
	}
	
	public Map<String, Livro> getLivros() {
		return Collections.unmodifiableMap(this.livros);
	}

	//adicionarLivro
	public void adicionarLivro(String link, Livro livro) {
		livros.put(link, livro);
	}
	//removerLivro titulo
	public void remover(String titulo) {
		List<String> chavesParaRemover = new ArrayList<String>();
		
		for(Entry<String, Livro> entry : livros.entrySet()) {
			if(entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
				chavesParaRemover.add(entry.getKey());
			}
		}
		
		chavesParaRemover.forEach(x-> this.livros.remove(x));
	}
	//exibirLivrosOrdenadorPorPreco
	public Map<String, Livro> exibirLivrosOrdenadosPorPreco(){
		Map<String, Livro> livros = new TreeMap<>(this.livros);
		
		return livros;
	}
	//pesquisarLivrosPorAutor
	public List<Livro> pesquisarLivrosPorAutor(String autor) {
		List<Livro> livrosAutor = new ArrayList<>();
		
		for(Livro livro : livros.values()) {
			if(livro.getAutor().equalsIgnoreCase(autor)) {
				livrosAutor.add(livro);
			}
		}
		
		return livrosAutor;
	}
	//obterLivroMaisCaro
	public Livro obterLivroMaisCaro() {
		Livro livroCaro = null;
		Double maiorPreco = Double.MIN_VALUE;
		
		for(Livro livro : livros.values()) {
			if(livro.getPreco() > maiorPreco) {
				
				maiorPreco = livro.getPreco();
				livroCaro = livro;
			}
		}
		
		return livroCaro;
	}
	//exibirLivroMaisBarato
	public Livro obterLivroMaisBarato() {
		Livro livroBarato = null;
		Double menorPreco = Double.MAX_VALUE;
		
		for(Livro livro : livros.values()) {
			if(livro.getPreco() < menorPreco) {
				
				menorPreco = livro.getPreco();
				livroBarato = livro;
			}
		}
		
		return livroBarato;
	}
	//exibirLivroOrdenadorPorAutor
	public Map<String, Livro> exibirLivrosOrdenadosPorAutor(){
		//criar list com o tipo map.entry e nos parametros escolhe o map
		List<Map.Entry<String, Livro>> livrosParaOrdenarPorAutor   = new ArrayList<>(livros.entrySet());
		//ordenar com Collections sort e criando o obj comparatorAutor
		Collections.sort(livrosParaOrdenarPorAutor , new ComparatorPorAutor());
		//criando a nova Map
		Map<String, Livro> livrosOrdenadosPorAutor = new LinkedHashMap<>();
		// for each para da put da chave e valor
		for(Map.Entry<String, Livro> entry : livrosParaOrdenarPorAutor) {
			livrosOrdenadosPorAutor .put(entry.getKey(), entry.getValue());
		}
		return livrosOrdenadosPorAutor;
	}
}

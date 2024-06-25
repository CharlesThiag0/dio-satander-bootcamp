package edu.estudos.steam.carrinho;

import java.util.ArrayList;
import java.util.List;

import edu.estudos.collections.livraria.Livro;

public class CarrinhoCompras {
	private List<Livro> livros;

	public CarrinhoCompras() {
		this.livros = new ArrayList<>();
	}
	
	public double totalPreco(){
		if(livros.isEmpty()) 
			throw new RuntimeException("Lista esta vazia");
		
		return livros.stream().mapToDouble(item -> item.getPreco() * item.getQuant()).sum();
	}	
}

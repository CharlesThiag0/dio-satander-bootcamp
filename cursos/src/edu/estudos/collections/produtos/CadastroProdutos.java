package edu.estudos.collections.produtos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	private Set<Produto> produtos;

	public CadastroProdutos() {
		this.produtos = new HashSet<>();
	}

	public void add(long codigo, String nome, double preco, int quantidade) {
		produtos.add(new Produto(codigo, nome, preco, quantidade));
	}

	public Set<Produto> exibirPorNome() {
		Set<Produto> produtos = new TreeSet<Produto>(this.produtos);

		return produtos;
	}
	
	public Set<Produto> exibirPorPreco(){
		Set<Produto> produtos = new TreeSet<>(new ComparatorPreco());
		produtos.addAll(this.produtos);
		
		return produtos;
	}

}

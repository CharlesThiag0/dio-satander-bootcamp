package edu.estudos.collections.estoque;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
	private Map<Long, Produto> produtos;

	public EstoqueProdutos() {
		this.produtos = new HashMap<Long, Produto>();
	}

	public Map<Long, Produto> getProdutos() {
		return Collections.unmodifiableMap(produtos);
	}

	// add
	public void add(long cod, String nome, int quantidade, double preco) {
		produtos.put(cod, new Produto(nome, quantidade, preco));
	}

	// calcularValorTotalEstoque
	public Double calcularValorTotalEstoque() {
		double valorTotal = 0;

		for (Produto produto : produtos.values()) {
			valorTotal += produto.getQuantiadade() * produto.getPreco();
		}

		return valorTotal;
	}

	// produtoMaisCaro
	public String produtoMaisCaro() {
		String produto = "";

		double maiorValor = Double.MIN_VALUE;
		for (Produto p : produtos.values()) {
			if (p.getPreco() > maiorValor) {
				produto = p.getNome();
				maiorValor = p.getPreco();
			}
		}

		return produto;
	}

	// produtoMaisBarato
	public String produtoMaisBarato() {
		String produto = "";

		double menorValor = Double.MAX_VALUE;
		for (Produto p : produtos.values()) {
			if (p.getPreco() < menorValor) {
				menorValor = p.getPreco();
				produto = p.getNome();
			}
		}

		return produto;
	}

	// produtoMaiorValorTotalEstoque
	public Produto produtoMaiorValorTotalEstoque() {
		Produto produtoMaior = null;
		
		double total = 0;
		for(Produto p : produtos.values()) {
			if(p.getPreco() * p.getQuantiadade() > total) {
				total = p.getPreco() * p.getQuantiadade();
				produtoMaior = p;
			}
		}		
		return produtoMaior;
	}

}

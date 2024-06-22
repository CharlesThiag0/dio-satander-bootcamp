package edu.estudos.collections.estoque;

public class Produto {
	private String nome;
	private Integer quantiadade;
	private Double preco;
	
	public Produto(String nome, Integer quantiadade, Double preco) {
		this.nome = nome;
		this.quantiadade = quantiadade;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public Integer getQuantiadade() {
		return quantiadade;
	}

	public Double getPreco() {
		return preco;
	}

	@Override
	public String toString() {
		return "Estoque [nome=" + nome + ", quantiadade=" + quantiadade + ", preco=" + preco + "]";
	}
}

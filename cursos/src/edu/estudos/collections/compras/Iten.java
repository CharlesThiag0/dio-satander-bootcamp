package edu.estudos.collections.compras;

public class Iten {
	private String nome;
	private Double preco;
	private Integer quantidade;
	
	public Iten(String nome, Double preco, Integer quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public Double getPreco() {
		return preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Itens [nome = " + nome + ", preco = " + preco + ", quantidade = " + quantidade + "]";
	}
}

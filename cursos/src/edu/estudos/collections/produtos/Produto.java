package edu.estudos.collections.produtos;

import java.util.Comparator;

public class Produto implements Comparable<Produto> {
	private Long codigo;
	private String nome;
	private Double preco;
	private Integer quantidade;

	public Produto(Long codigo, String nome, Double preco, Integer quantidade) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public Long getCodigo() {
		return codigo;
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

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}

	@Override
	public int compareTo(Produto o) {
		return this.nome.compareTo(o.getNome());
	}
}

class ComparatorPreco implements Comparator<Produto> {

	@Override
	public int compare(Produto o1, Produto o2) {
		return Double.compare(o1.getPreco(), o2.getPreco());
	}

}
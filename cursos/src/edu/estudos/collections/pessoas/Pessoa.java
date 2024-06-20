package edu.estudos.collections.pessoas;

public class Pessoa implements Comparable<Pessoa> {
	private String nome;
	private Integer idade;
	private Double altura;
	
	public Pessoa(String nome, Integer idade, Double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	@Override
	public int compareTo(Pessoa pessoa) {
		return Integer.compare(idade, pessoa.idade);
	}
	
	public String getNome() {
		return nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public Double getAltura() {
		return altura;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
	}

		
}

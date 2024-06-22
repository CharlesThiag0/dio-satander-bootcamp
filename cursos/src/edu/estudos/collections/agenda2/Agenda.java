package edu.estudos.collections.agenda2;


public class Agenda {
	private String nome;
	private String atracao;
	
	public Agenda(String nome, String atracao) {

		this.nome = nome;
		this.atracao = atracao;
	}

	public String getNome() {
		return nome;
	}

	public String getAtracao() {
		return atracao;
	}

	@Override
	public String toString() {
		return "Agenda [nome=" + nome + ", atracao=" + atracao + "]";
	}

}

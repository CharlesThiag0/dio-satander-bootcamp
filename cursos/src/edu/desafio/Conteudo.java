package edu.desafio;

public abstract class Conteudo {
	protected static final double XP_PADRAO = 10d;
	
	protected String titulo;
	protected String descricao;
	
	public abstract double calcularXp();

	public static double getXpPadrao() {
		return XP_PADRAO;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	
	
}

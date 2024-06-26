package edu.desafio;

public class Curso extends Conteudo {
	private Integer cargaHoraria;

	public Curso(String titulo, String descricao, Integer cargaHoraria) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	@Override
	public String toString() {
		return "Curso [titulo = " + titulo + ", descricao = " + descricao + ", cargaHoraria = " + cargaHoraria + "]";
	}

	@Override
	public double calcularXp() {
		return XP_PADRAO * cargaHoraria;
	}

	
}

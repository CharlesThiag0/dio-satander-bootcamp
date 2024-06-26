package edu.desafio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	private LocalDate data;
	
	public Mentoria(String titulo, String descricao) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.data = LocalDate.now();
	}
	
	public LocalDate getData() {
		return data;
	}

	@Override
	public String toString() {
		return "Mentoria [titulo = " + titulo + ", descricao = " + descricao + ", data = " + data + "]";
	}

	@Override
	public double calcularXp() {
		return XP_PADRAO + 20d;
	}
	
	
	
}

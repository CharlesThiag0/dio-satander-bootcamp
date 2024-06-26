package edu.desafio;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;

public class Bootcamp {
	private String nome;
	private String descricao;
	private LocalDate dataInicial = LocalDate.now();
	private final LocalDate dataFinal = dataInicial.plusDays(45);
	private Collection<Dev> devsInscritos = new HashSet<>();
	private Collection<Conteudo> conteudos = new HashSet<>();
	
	public Bootcamp(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public LocalDate getDataInicial() {
		return dataInicial;
	}
	
	public LocalDate getDataFinal() {
		return dataFinal;
	}
	
	public Collection<Dev> getDevsInscritos() {
		return devsInscritos;
	}
	
	public Collection<Conteudo> getConteudos() {
		return conteudos;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(conteudos, dataFinal, dataInicial, descricao, devsInscritos, nome);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(conteudos, other.conteudos) && Objects.equals(dataFinal, other.dataFinal)
				&& Objects.equals(dataInicial, other.dataInicial) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(devsInscritos, other.devsInscritos) && Objects.equals(nome, other.nome);
	}	
}

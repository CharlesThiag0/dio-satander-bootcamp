package edu.desafio;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;

public class Dev {
	private String nome;
	private Collection<Conteudo> conteudos = new LinkedHashSet<>();
	private Collection<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
	
	public Dev(String nome) {
		this.nome = nome;
	}

	public void inscreverBootcamp(Bootcamp bootcamp) {
		this.conteudos.addAll(bootcamp.getConteudos());
		bootcamp.getDevsInscritos().add(this);
	}
	
	public void progredir() {
		Optional<Conteudo> conteudo = conteudos.stream().findFirst();
		if(conteudo.isPresent()) {
			conteudosConcluidos.add(conteudo.get());
			conteudos.remove(conteudo.get());
		} else {
			System.err.println("Voce não esta matriculado em nenhum conteudo");
		}
	}

	public double calcularTotalXp(){
		return conteudosConcluidos.stream()
				.mapToDouble(conteudo -> conteudo.calcularXp())
				.sum();
	}

	public String getNome() {
		return nome;
	}

	public Collection<Conteudo> getConteudos() {
		return conteudos;
	}

	public Collection<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudos, conteudosConcluidos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudos, other.conteudos)
				&& Objects.equals(conteudosConcluidos, other.conteudosConcluidos) && Objects.equals(nome, other.nome);
	}	
}

package edu.estudos.collections.tarefas;

import java.util.Objects;

public class Tarefa {
	private String nome;
	private boolean concluida = false;

	public Tarefa(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	public boolean isConcluida() {
		return concluida;
	}

	public void concluir() {
		this.concluida = true;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

	@Override
	public String toString() {
		return "Tarefa [nome = " + nome + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarefa other = (Tarefa) obj;
		return Objects.equals(nome, other.nome);
	}
}

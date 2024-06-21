package edu.estudos.collections.alunos;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
	private String nome;
	private Double nota;
	private Long matricula;
	
	public Aluno(String nome, Double nota, long matricula) {
		this.nome = nome;
		this.nota = nota;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public Double getNota() {
		return nota;
	}

	public Long getMatricula() {
		return matricula;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", nota=" + nota + "]";
	}

	@Override
	public int compareTo(Aluno o) {
		return this.nome.compareToIgnoreCase(o.getNome());
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		
		if (obj == null) return false;
		
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(matricula, other.matricula);
	}	
}

class ComparatorNota implements Comparator<Aluno> {
	@Override
	public int compare(Aluno o1, Aluno o2) {
		return Double.compare(o1.getNota(), o2.getNota());
	}
	
}

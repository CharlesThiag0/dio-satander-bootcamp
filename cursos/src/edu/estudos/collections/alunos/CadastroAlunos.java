package edu.estudos.collections.alunos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CadastroAlunos {
	private Set<Aluno> alunos;

	public CadastroAlunos() {
		this.alunos = new HashSet<>();
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(this.alunos);
	}
	
	public void add(String nome, double nota, long matricula) {
		alunos.add(new Aluno( nome, nota, matricula));
	}
	
	public void remove(long matricula) {
		List<Aluno> alunosRemover = new ArrayList<>();
	    for (Aluno aluno : alunos) {
	        if (aluno.getMatricula() == matricula) {
	            alunosRemover.add(aluno);
	        }
	    }
	    alunos.removeAll(alunosRemover);
	}
	
	public Set<Aluno> exibirNome(){
		Set<Aluno> alunos = new TreeSet<Aluno>(this.alunos);
		
		return alunos;
	}
	
	public Set<Aluno> exibirNota(){
		Set<Aluno> alunos = new TreeSet<Aluno>(new ComparatorNota());
		alunos.addAll(this.alunos);
		
		return alunos;
	}
	
}
